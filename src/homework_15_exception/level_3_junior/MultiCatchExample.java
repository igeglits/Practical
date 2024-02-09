package homework_15_exception.level_3_junior;

class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}
class TestException extends Exception { }

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
