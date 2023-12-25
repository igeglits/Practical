//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//// Класс, который содержит два поля для хранения двух списков яблок
//class Apple {
//    // Поле для хранения списка легких яблок
//    private List<Apple> lightApples;
//    // Поле для хранения списка тяжелых яблок
//    private List<Apple> heavyApples;
//
//    // Конструктор, который принимает два списка яблок в качестве параметров и инициализирует поля
//    public Apple(List<Apple> lightApples, List<Apple> heavyApples) {
//        this.lightApples = lightApples;
//        this.heavyApples = heavyApples;
//    }
//
//    // Геттер для получения списка легких яблок
//    public List<Apple> getLightApples() {
//        return lightApples;
//    }
//
//    // Геттер для получения списка тяжелых яблок
//    public List<Apple> getHeavyApples() {
//        return heavyApples;
//    }
//}
//
//// Класс, который содержит метод, который разделяет список яблок по весу и возвращает объект класса Apple
//class AppleSeparator {
//    // Метод, который разделяет список яблок по весу и возвращает объект класса Apple
//    public static Apple separationByWeight(List<Apple> allApples) {
//        List<Apple> stockLightApples = new ArrayList<>();
//        List<Apple> stockHeavyApples = new ArrayList<>();
//        for (Apple apples : allApples) {
//            if (apples.getWeight() < 150) {
//                stockLightApples.add(apples);
//            } else {
//                stockHeavyApples.add(apples);
//            }
//        }
//        return new Apple(stockLightApples, stockHeavyApples);
//    }
//}
//
//// Класс, который содержит поле типа Apple и конструктор, который принимает список яблок в качестве параметра и вызывает метод separationByWeight внутри себя
//class OtherClass {
//    // Поле типа Apple, которое хранит возвращаемый объект
//    private Apple apple;
//
//    // Конструктор, который принимает список яблок в качестве параметра и вызывает метод separationByWeight внутри себя
//    public OtherClass(List<Apple> allApples) {
//        // Вызываем метод separationByWeight и сохраняем возвращаемый объект в поле
//        this.apple = AppleSeparator.separationByWeight(allApples);
//    }
//
//    // Геттер для получения поля типа Apple
//    public Apple getApple() {
//        return apple;
//    }
//}
//
//// Главный метод, который демонстрирует, как использовать класс OtherClass
//public static void main(String[] args) {
//    // Создаем список яблок
//    List<Apple> allApples = Arrays.asList(new Apple(100), new Apple(200), new Apple(150), new Apple(50));
//
//    // Создаем объект класса OtherClass, передавая ему список яблок
//    OtherClass obj = new OtherClass(allApples);
//
//    // Получаем и выводим на экран поле типа Apple из объекта класса OtherClass
//    Apple apple = obj.getApple();
//    System.out.println("Список легких яблок: " + apple.getLightApples());
//    System.out.println("Список тяжелых яблок: " + apple.getHeavyApples());
//}
