package UdemyDmitryPractic;

public class ConditionalOperators {
    public static void main(String[] args) {
        var day = 1;

        // if else
        if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Workday");
        }

        // Ternary
        System.out.println(day == 6 || day == 7 ? "Weekend" : "Workday");

        // Switch
        switch (day) {
            case 6:
            case 7: {
                System.out.println("Weekend");
                break;
            }
            default: {
                System.out.println("Workday");
            }
        }

        var month = 4;

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Unsupported month number: " + month);
        }
    }
}
