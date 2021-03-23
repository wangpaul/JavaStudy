package com.fkjava;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/23 11:38
 */
public class ShowHand {
    //定义最多支持的玩家
    private final int PLAY_NUM = 5;

    /**
     *定义扑克牌的所有花色和数值
     */
    private String[] types = {"方块", "草花", "红心", "黑桃"};
    private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    /**
     * cards是一局中剩下的扑克牌
     */
    private List<String> cards = new LinkedList<String>();
    /**
     * players定义所有玩家
     */
    private String[] players = new String[PLAY_NUM];

    /**
     * 所有玩家手上的扑克牌
     */
    private List<String>[] playersCards = new List[PLAY_NUM];

    /**
     * 初始化扑克牌
     * 使用shuffle随机排序
     */
    public void initCards(){
        for (int i = 0; i < types.length; i++){
            for (int j = 0; j < values.length; j++){
                cards.add(types[i] + values[j]);
            }
        }
        Collections.shuffle(cards);
    }

    /**
     * 初始玩家
     */
    public void initPlayer(String... names){
        if (names.length > PLAY_NUM || names.length <2){
            System.out.println("玩家数量不对");
            return;
        }
        else{
            for(int i= 0; i < names.length; i++){
                players[i] = names[i];
            }
        }
    }

    /**
     * 初始化玩家扑克牌
     */
    public void initPlayerCards(){
        for (int i = 0; i < players.length; i++){
            playersCards[i] = new LinkedList<String>();
        }
    }

    /**
     * 输出全部扑克牌
     */
    public void showAllCards(){
        for (String card : cards){
            System.out.println(card);
        }
    }

    /**
     * 派发扑克牌
     * @param first 最先派给谁
     */
    public void deliverCard(String first){
        int firstPos = ArrayUtils.indexOf(players, first);

        for (int i = firstPos; i < PLAY_NUM; i++){
            if (players[i] != null){
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
    }

    /**
     * 输出玩家手上扑克牌
     */
    public void showPlayerCards(){
        for (int i = 0; i < PLAY_NUM; i++){
            if (players[i] != null){
                System.out.println(players[i] + ": ");
                for (String card : playersCards[i]){
                    System.out.println(card + "\t");
                }
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        ShowHand sh = new ShowHand();
        sh.initPlayer("wzz", "cc");
        sh.initCards();
        sh.initPlayerCards();
        sh.showAllCards();
        System.out.println("------------------");
        sh.deliverCard("cc");
        sh.showPlayerCards();
        sh.deliverCard("wzz");
        sh.showPlayerCards();
    }
}
