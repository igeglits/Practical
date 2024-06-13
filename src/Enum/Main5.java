package Enum;

public class Main5{
    public static void main(String[] args) {
        System.out.println(WeekDay.FRIDAY.getWeekDayPosition());
    }

    public enum WeekDay {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        int getWeekDayPosition() {
            return this.ordinal() + 1;
        }
    }
}