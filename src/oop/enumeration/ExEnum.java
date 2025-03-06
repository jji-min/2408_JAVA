package oop.enumeration;

public class ExEnum {
    public static void main(String[] args) {
        Days day = Days.THURSDAY;
        System.out.println(day);
        System.out.println(day.getDayName());
        System.out.println(day.getDayNum());
    }
}

enum Days {
//    public static final SUNDAY = new Days("일요일");
    SUNDAY("일요일", 0),
    MONDAY("월요일", 1),
    TUESDAY("화요일", 2),
    WEDNESDAY("수요일", 3),
    THURSDAY("목요일", 4),
    FRIDAY("금요일", 5),
    SATURDAY("토요일", 6);
    // ',' 이용해서 쭈욱 적어주고 마지막에 ';'

    private final String dayName;
    private final int dayNum;

    private Days(String dayName, int dayNum) {
        this.dayName = dayName;
        this.dayNum = dayNum;
    }

    public String getDayName() {
        return this.dayName;
    }
    public int getDayNum() {
        return this.dayNum;
    }
}