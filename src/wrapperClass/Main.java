package wrapperClass;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(10, 5.5);
        WrapperCar car1 = new WrapperCar(car, 40);
        WrapperCar car2 = new WrapperCar(car, 110);

        System.out.println(car.getDistance());
        System.out.println(car1.getDistance());
        System.out.println(car2.getDistance());
    }


    static class Car {
        private double fuelQuantity; // количество топлива
        private double fuelConsumption; // расход топлива

        public Car(double fuelQuantity, double fuelConsumption) {
            this.fuelQuantity = fuelQuantity;
            this.fuelConsumption = fuelConsumption;
        }

        double getFuelQuantity() {
            return fuelQuantity;
        }

        double getFuelConsumption() {
            return fuelConsumption;
        }

        public double getDistance() {
            return Math.round(fuelQuantity / fuelConsumption * 100);
        }
    }

    static class WrapperCar extends Car {
        private Car car; // 1. Создайте переменную, в которой будет хранится экземпляр оборачиваемого класса
        private double averageSpeed;

        public WrapperCar(Car car, double averageSpeed) {
            super(car.getFuelQuantity(), car.getFuelConsumption());// 2. Вызовите конструктор суперкласса
            this.car = car;// 3. Инициализируйте пункт 1
            this.averageSpeed = averageSpeed;
        }

        //если средняя скорость меньше 60 - дистанция сокращается на 20%
        //если средняя скорость 60-100 - дистанция не изменяется
        //если средняя скорость больше 100 - дистанция уменьщается на 40%

        public double getDistance() {
            double baseDistance = car.getDistance();
            if (averageSpeed < 60) {
                return baseDistance * 0.8; // 20% reduction
            } else if (averageSpeed > 100) {
                return baseDistance * 0.6; // 40% reduction
            }
            return baseDistance; // No change
            // 4. Допишите метод
        }
    }
}
