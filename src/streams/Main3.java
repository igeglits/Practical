package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<City> cities = Arrays.asList(
                new City("Russia", "Moscow"),
                new City("Belarus", "Minsk"),
                new City("Ukraine", "Kiev"),
                new City("Russia", "Tver"),
                new City("Russia", "Smolensk"));

        String result = cities.stream()
                .filter(city -> "Russia".equals(city.country)) // Фильтрация по стране
                .sorted(Comparator.comparingInt(city -> -city.name.length())) // Сортировка по длине названия в убывающем порядке
                .map(city -> city.name) // Преобразование в названия городов
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }

    static class City {
        private String country;
        private String name;

        public City(String country, String name) {
            this.country = country;
            this.name = name;
        }
    }
}
