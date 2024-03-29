package dateAndTimeClasses;

import java.time.LocalTime;

public class LocalTimeEx {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);

        LocalTime lt2 = LocalTime.of(15, 30, 45);
        System.out.println(lt2);
    }
}
