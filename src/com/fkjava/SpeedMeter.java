package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/8 11:33
 */
public abstract class SpeedMeter {
    private double turnRate;
    public SpeedMeter(){}
    public abstract double calGirth();

    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }

    public double getSpeed(){
        return calGirth() * turnRate;
    }
}
