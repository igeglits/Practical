package GetSet;

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V8", 5);
        Car car2 = new Car("black", "V6", 4);
        System.out.println(car1.getColor() + " " + car1.getEngine() + " " + car1.getDoors());
        changeDoor(car1, 3);
        System.out.println(car1.getColor() + " " + car1.getEngine() + " " + car1.getDoors());
        car1.setColor("green");
        System.out.println(car1.getColor() + " " + car1.getEngine() + " " + car1.getDoors());
        System.out.println(car2.getColor() + " " + car2.getEngine() + " " + car2.getDoors());
        swapColor(car1,car2);
        System.out.println(car1.getColor() + " " + car1.getEngine() + " " + car1.getDoors());
        System.out.println(car2.getColor() + " " + car2.getEngine() + " " + car2.getDoors());

    }

    static void changeDoor(Car car, int i) {
        car.setDoors(i);
    }
    static  void swapColor(Car car1, Car car2){
        String colorTemp;
        colorTemp = car1.getColor();
        car1.setColor(car2.getColor());
        car2.setColor(colorTemp);
    }

}
