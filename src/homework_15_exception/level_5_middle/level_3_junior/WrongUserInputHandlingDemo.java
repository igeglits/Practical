package homework_15_exception.level_5_middle.level_3_junior;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        WrongUserInputHandlingDemo wrongUserInputHandlingDemo = new WrongUserInputHandlingDemo();
        System.out.println(wrongUserInputHandlingDemo.readFromConsole());
    }

    void checkInput(String scanner) throws WrongUserInputHandling {
        var charArray = scanner.toCharArray();
        for (char ch : charArray) {
            if (!isDigit(ch)) {
                throw new WrongUserInputHandling("Enter only Integers");// write your code here to throw exception if input is not a number
            }
        }
    }

    public boolean isDigit(char ch) {
        // return Character.isDigit(ch);
        return ch >= '0' && ch <= '9';
    }

    public String readFromConsole() {
        System.out.println("Enter INTEGER: ");
        var scanner =  new Scanner(System.in).nextLine();
        try {
            checkInput(scanner);
        } catch (WrongUserInputHandling e) {
            System.out.println(e.getMessage());
            return readFromConsole();
        }
        return scanner;
    }
}


class WrongUserInputHandling extends Exception {
    WrongUserInputHandling(String message) {
        super(message);
    }// write your code here to override the method of Exception class to get the message passed to the constructor of this class and print it.
}
