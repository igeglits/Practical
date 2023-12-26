
// Интерфейс для критериев поиска яблок
interface InterfaceAppleSearchCriteria {
    // Абстрактный метод, который проверяет, подходит ли яблоко по критерию
    boolean test(Apple apple);
}

// Класс для представления яблока
class Apple {
    // Поля для цвета и веса яблока
    private String color;
    private int weight;

    // Конструктор с параметрами
    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    // Геттеры и сеттеры для полей
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

// Реализация интерфейса для выбора зелёных яблок
class GreenInterfaceAppleCriteria implements InterfaceAppleSearchCriteria {
    // Переопределение метода test
    @Override
    public boolean test(Apple apple) {
        // Возвращает true, если цвет яблока зелёный
        return apple.getColor().equals("green");
    }
}

// Реализация интерфейса для выбора красных яблок
class RedInterfaceAppleCriteria implements InterfaceAppleSearchCriteria {
    // Переопределение метода test
    @Override
    public boolean test(Apple apple) {
        // Возвращает true, если цвет яблока красный
        return apple.getColor().equals("red");
    }
}

// Реализация интерфейса для выбора тяжелых яблок
class HeavyInterfaceAppleCriteria implements InterfaceAppleSearchCriteria {
    // Переопределение метода test
    @Override
    public boolean test(Apple apple) {
        // Возвращает true, если вес яблока больше 150 грамм
        return apple.getWeight() > 150;
    }
}

// Реализация интерфейса для выбора лёгких яблок
class LightInterfaceAppleCriteria implements InterfaceAppleSearchCriteria {
    // Переопределение метода test
    @Override
    public boolean test(Apple apple) {
        // Возвращает true, если вес яблока меньше 150 грамм
        return apple.getWeight() < 150;
    }
}
