package overrideEquals;

import java.util.ArrayList;
import java.util.List;

// Создаем абстрактный класс overrideEquals.Shape с полем name и методом equals
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Метод equals сравнивает две фигуры по имени и площади
    public boolean equals(Object obj) {
        if (obj instanceof Shape) {
            Shape other = (Shape) obj;
            return this.name.equals(other.name) && this.area() == other.area();
        }
        return false;
    }

    // Абстрактный метод для вычисления площади фигуры
    public abstract double area();
}

// Создаем подкласс overrideEquals.Circle, который наследует от overrideEquals.Shape
class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name); // Вызываем конструктор суперкласса
        this.radius = radius;
    }

    // Переопределяем метод area для круга
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Создаем подкласс overrideEquals.Square, который наследует от overrideEquals.Shape
class Square extends Shape {
    private double side;

    public Square(String name, double side) {
        super(name); // Вызываем конструктор суперкласса
        this.side = side;
    }

    // Переопределяем метод area для квадрата
    public double area() {
        return side * side;
    }
}

// Создаем подкласс overrideEquals.Rectangle, который наследует от overrideEquals.Shape
class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        super(name); // Вызываем конструктор суперкласса
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // Переопределяем метод area для прямоугольника
    public double area() {
        return sideA * sideB;
    }

    public static void main(String[] args) {


        // Создаем список с объектами разных фигур
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Квадрат", 5));
        shapes.add(new Square("Квадрат", 4));
        shapes.add(new Rectangle("Прямоугольник", 3, 6));
        shapes.add(new Circle("Круг", 3));
        shapes.add(new Square("Квадрат", 5));
        shapes.add(new Rectangle("Прямоугольник", 4, 4));

        // Создаем объект, который хотим найти в списке
        Shape target = new Square("Квадрат", 4);

// Перебираем список и сравниваем каждый элемент с целевым объектом
        for (Shape shape : shapes) {
            if (shape.equals(target)) {
                // Если нашли эквивалентный объект, выводим его имя и площадь
                System.out.println("Найден эквивалентный объект: " + shape.name + ", площадь: " + shape.area());
            }
        }
    }
}