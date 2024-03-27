package udemyDmitryPractic;

public class Switch {
    public static void main(String[] args) {
        var a = 2;
        switch (a) {
            case 1: {
                System.out.println("Сдай телефон, Андрюха!!");
                break;
            }
            case 2: {
                System.out.println("Андрюха, иди на унитаз");
                break;
            }
            case 3: {
                System.out.println("Читай книгу, Андрюха");
                break;
            }
            default: {
                System.out.println("default");
                break;
            }
        }
        var month = 10;
        //новый вид, переключение через лампочку
        switch (month) {
            case 1, 2, 12 -> {
                System.out.println("Winter");
            }
            case 3, 4, 5 -> {
                System.out.println("Spring");
            }
            case 6, 7, 8 -> {
                System.out.println("Summer");
            }
            case 9, 10, 11 -> {
                System.out.println("Fall");
            }
            default -> {
                System.out.println("default");
            }
        }
    }
}
