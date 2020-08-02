package main.java.pers.hq.javacookbook.time;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
    public static void main(String[] args) {
        // 1.查看当天日期和时间：可以用LocalDate、LocalTime或LocalDateTime对象，并调用其toString()方法
        LocalDate ld = LocalDate.now();
        System.out.println(ld.toString());

        LocalTime lt = LocalTime.now();
        System.out.println(lt.toString());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.toString());
        System.out.println();

        // 2.日期和时间的格式化：使用 java.time.format.DateTimeFormatter的ofPattern(String pattern)方法自定义格式
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtFormatter.format(LocalDateTime.now()));

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println();

        // 3.字符串转换成日期：使用parse()方法
        String time = "20:20:20";
        String date = "2020-02-02";
        String datetimeFormat = "2020-02-02 20:20:20";
        System.out.println(LocalTime.parse(time));
        System.out.println(LocalDate.parse(date));
        System.out.println(LocalDateTime.parse(datetimeFormat, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println();

        // 4.计算两个日期之差：使用静态方法Period.between()来计算两个LocalDate型日期的差值
        LocalDate date1 = LocalDate.parse("2020-01-01");
        LocalDate date2 = LocalDate.now();
        Period period = Period.between(date1, date2);
        System.out.println(period.getYears() + "年" + period.getMonths() + "月" + period.getDays() + "天");

        // 5.日期的加减：使用LocalDate.plus(Period.ofDays(N))
        LocalDate currentDay = LocalDate.now();
        LocalDate newDay = currentDay.plus(Period.ofDays(20));
        System.out.println(newDay);
        System.out.println();

        // 6.旧的日期和日历类：java.util.Date和java.util.Calendar

    }
}
