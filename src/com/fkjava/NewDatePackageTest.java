package com.fkjava;

import java.time.*;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/11 10:09
 */
public class NewDatePackageTest {
    public static void main(String[] args) {
        //获取当前Clock
        Clock clock = Clock.systemUTC();
        //获取当前时刻
        System.out.println("当前时刻为：" + clock.instant());
        //获取clock对应的毫秒数
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

        Duration d = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于" + d.toMinutes() + "分");
        System.out.println("6000秒相当于" + d.toHours() + "小时");
        System.out.println("6000秒相当于" + d.toDays() + "天");

        //在clock上增加6000秒，返回新的Clock
        Clock clock2 = Clock.offset(clock, d);
        System.out.println("当前时刻加6000秒为：" + clock2.instant());

        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant2 = instant.plusSeconds(6000);
        System.out.println(instant2);

        //根据字符串解析instant
        Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
        System.out.println(instant3);

        Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant4);
        Instant instant5 = instant4.plus(Duration.ofDays(5));
        System.out.println(instant5);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.ofYearDay(2014, 146);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        localTime = LocalTime.of(22, 33);
        System.out.println(localTime);

        localTime = LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
        System.out.println(future);

        Year year = Year.now();
        System.out.println(year);
        YearMonth ym = year.atMonth(10);
        System.out.println(ym);

    }
}
