import java.util.Arrays;
import java.util.List;

// Класс, который содержит два поля для хранения двух списков объектов
class ListPair {
    // Поле для хранения первого списка
    private List<String> firstList;
    // Поле для хранения второго списка
    private List<Integer> secondList;

    // Конструктор, который принимает два списка в качестве параметров и инициализирует поля
    public ListPair(List<String> firstList, List<Integer> secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    // Геттер для получения первого списка
    public List<String> getFirstList() {
        return firstList;
    }

    // Геттер для получения второго списка
    public List<Integer> getSecondList() {
        return secondList;
    }
}

// Класс, который содержит метод, который возвращает экземпляр класса ListPair
class ListPairExample {
    // Метод, который возвращает экземпляр класса ListPair
    public static ListPair createListPair() {
        // Создаем два списка объектов
        List<String> firstList = Arrays.asList("a", "b", "c");
        List<Integer> secondList = Arrays.asList(1, 2, 3);

        // Создаем экземпляр класса ListPair, передавая ему два списка в качестве параметров
        ListPair listPair = new ListPair(firstList, secondList);

        // Возвращаем экземпляр класса ListPair
        return listPair;
    }

    // Главный метод, который демонстрирует, как использовать метод createListPair
    public static void main(String[] args) {
        // Вызываем метод createListPair и получаем экземпляр класса ListPair
        ListPair listPair = createListPair();

        // Получаем и выводим на экран первый и второй список из экземпляра класса ListPair
        System.out.println("Первый список: " + listPair.getFirstList());
        System.out.println("Второй список: " + listPair.getSecondList());
    }
}