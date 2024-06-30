package exeptions;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.checkSpeed(5));
    }

    static class Car {
        public int checkSpeed(int speed) {

            if (speed < 0) throw new RuntimeException();

            return speed;
        }
    }

    static class MyException extends Exception {} // проверяемое исключение
}
