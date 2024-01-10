/*
import java.util.Map;
import java.util.Optional;

public class StreamSearchTraderWithMostTransactions {
    // Метод, который принимает на вход список транзакций
// и находит имя трейдера с наибольшим количеством транзакций
    public static Optional<String> findTraderWithMaxTransactions(List<Transaction> transactions) {
        // Создаем поток из списка транзакций
        return transactions.stream()
                // Применяем операцию reduce, которая принимает аккумулятор, функцию сравнения и начальное значение
                .reduce(
                        // Создаем map, которая будет хранить трейдера и количество его транзакций
                        new HashMap<Trader, Long>(),
                        // Функция аккумулятора, которая обновляет map, увеличивая счетчик для текущего трейдера
                        (map, transaction) -> {
                            // Получаем трейдера из транзакции
                            Trader trader = transaction.getTrader();
                            // Получаем текущее количество транзакций для трейдера из map или 0, если его нет
                            long count = map.getOrDefault(trader, 0L);
                            // Увеличиваем счетчика на 1 и обновляем map
                            map.put(trader, count + 1);
                            // Возвращаем map
                            return map;
                        },
                        // Функция сравнения, которая находит трейдера с максимальным значением в map
                        (map1, map2) -> {
                            // Сливаем две map в одну
                            map1.putAll(map2);
                            // Поиск трейдера с максимальным значением в map, используя операцию maxBy с компаратором
                            return map1.entrySet().stream()
                                    .maxBy(Map.Entry.comparingByValue())
                                    // Применяем операцию map, чтобы получить ключ из entry, то есть трейдера
                                    .map(Map.Entry::getKey)
                                    // Применяем операцию orElse, чтобы вернуть null, если map пустая
                                    .orElse(null);
                        },
                        // Начальное значение, которое будет возвращено, если поток пустой
                        null
                )
                // Применяем операцию map, чтобы получить имя трейдера из объекта Optional<Trader>
                .map(Trader::getName);
    }

}
*/
