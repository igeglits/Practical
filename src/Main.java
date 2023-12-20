
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Создаем 3 группы по 8 массивов размером 5
        int[][][] groups = new int[3][8][5];

        // Называем группы по порядку
        String[] groupNames = {"первый Раунд", "второй Раунд", "третий Раунд"};

        // Называем массивы в группе по порядку на основе названий групп
        String[][] arrayNames = new String[3][8];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                arrayNames[i][j] = groupNames[i] + " " + (j + 1);
            }
        }

        // Заполняем массивы числами из файла с помощью метода readNumbersFromFile
        try {
            // Создаем объект File для нашего файла
            File file = new File("C:\\Users\\igegl\\Documents\\Toshchakov, Igor\\lottery.xlsx");

            // Создаем объект FileInputStream для чтения байтов из файла
            FileInputStream fis = new FileInputStream(file);

            // Создаем объект Scanner для чтения строк из файла
            Scanner sc = new Scanner(fis);

            // Пропускаем первую строку, так как она содержит заголовки
            sc.nextLine();

            // Создаем переменную для хранения индекса группы
            int groupIndex = 2; // Начинаем с группы "третий Раунд"

            // Создаем переменную для хранения индекса массива в группе
            int arrayIndex = 7; // Начинаем с восьмого массива в группе

            // Читаем строки из файла, пока они есть
            while (sc.hasNextLine()) {
                // Считываем строку из файла
                String line = sc.nextLine();

                // Вызываем метод readNumbersFromFile, который возвращает массив из пяти чисел
                int[] numbers = readNumbersFromFile(line);

                // Помещаем массив чисел в соответствующий массив в группе
                groups[groupIndex][arrayIndex] = numbers;

                // Уменьшаем индекс массива на 1
                arrayIndex--;

                // Если индекс массива стал меньше нуля, то переходим к следующей группе
                if (arrayIndex < 0) {
                    // Уменьшаем индекс группы на 1
                    groupIndex--;
                    if (groupIndex < 0) {
                        break;
                    }
                    // Сбрасываем индекс массива на 7
                    arrayIndex = 7;
                }
            }

            // Закрываем Scanner и FileInputStream
            sc.close();
            fis.close();

        } catch (Exception e) {
            // Выводим сообщение об ошибке
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }

        // Выводим на консоль все массивы с их названиями
        System.out.println("Все массивы:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Группа " + groupNames[i] + ":");
            for (int j = 0; j < 8; j++) {
                System.out.println(arrayNames[i][j] + ": " + Arrays.toString(groups[i][j]));
            }
        }

        // Проанализируем семь заполненных массивов из группы "первый Раунд"
        // Создаем три новых массива для хранения чисел, которые встречаются один, два или три и более раз
        int[] singles = new int[35]; // Массив для "одиночек"
        int[] doubles = new int[35]; // Массив для "двойек"
        int[] triples = new int[35]; // Массив для "тройек"
        int singlesCount = 0; // Счетчик для "одиночек"
        int doublesCount = 0; // Счетчик для "двойек"
        int triplesCount = 0; // Счетчик для "тройек"

        // Создаем массив для подсчета частоты встречаемости каждого числа от 1 до 35 в семи массивах группы "первый Раунд"
        int[] frequency = new int[36]; // Массив для частоты, индекс 0 не используется

        // Проходим по семи массивам группы "первый Раунд" и увеличиваем частоту соответствующего числа на 1
        for (int j = 1; j < 8; j++) {
            for (int k = 0; k < 5; k++) {
                int number = groups[0][j][k]; // Берем число из массива
                frequency[number]++; // Увеличиваем частоту на 1
            }
        }

        // Проходим по массиву частоты и добавляем числа в соответствующие массивы в зависимости от их частоты
        for (int i = 1; i < 36; i++) {
            int freq = frequency[i]; // Берем частоту числа i
            if (freq == 1) { // Если частота равна 1, то это "одиночка"
                singles[singlesCount] = i; // Добавляем число в массив "одиночек"
                singlesCount++; // Увеличиваем счетчик "одиночек" на 1
            } else if (freq == 2) { // Если частота равна 2, то это "двойка"
                doubles[doublesCount] = i; // Добавляем число в массив "двойек"
                doublesCount++; // Увеличиваем счетчик "двойек" на 1
            } else if (freq >= 3) { // Если частота больше или равна 3, то это "тройка"
                triples[triplesCount] = i; // Добавляем число в массив "тройек"
                triplesCount++; // Увеличиваем счетчик "тройек" на 1
            }
        }

        // Выводим на консоль массивы "одиночек", "двойек" и "тройек"
        System.out.println("Одиночки: " + Arrays.toString(Arrays.copyOf(singles, singlesCount)));
        System.out.println("Двойки: " + Arrays.toString(Arrays.copyOf(doubles, doublesCount)));
        System.out.println("Тройки: " + Arrays.toString(Arrays.copyOf(triples, triplesCount)));

        // Числа от 1 до 35, которые не представлены в семи массивах группы "первый Раунд" сложить в новый массив "уникальные"
        int[] unique = new int[35]; // Массив для "уникальных" чисел
        int uniqueCount = 0; // Счетчик для "уникальных" чисел

        // Проходим по всем числам от 1 до 35 и проверяем, есть ли они в массиве частоты
        for (int i = 1; i < 36; i++) {
            int freq = frequency[i]; // Берем частоту числа i
            if (freq == 0) { // Если частота равна 0, то это "уникальное" число
                unique[uniqueCount] = i; // Добавляем число в массив "уникальных"
                uniqueCount++; // Увеличиваем счетчик "уникальных" на 1
            }
        }

        // Выводим на консоль массив "уникальных" чисел
        System.out.println("Уникальные: " + Arrays.toString(Arrays.copyOf(unique, uniqueCount)));

        // Числа из массива "уникальные" сравнить с числами в массивах из группы "второй Раунд" и вывести количество совпадений на консоль
        int matches2 = 0; // Счетчик для совпадений с группой "второй Раунд"

        // Проходим по массиву "уникальных" чисел и сравниваем их с числами в массивах из группы "второй Раунд"
        for (int i = 0; i < uniqueCount; i++) {
            int number = unique[i]; // Берем "уникальное" число
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 5; k++) {
                    if (number == groups[1][j][k]) { // Если число совпадает с числом в массиве из группы "второй Раунд"
                        matches2++; // Увеличиваем счетчик совпадений на 1
                    }
                }
            }
        }

        // Выводим на консоль количество совпадений с группой "второй Раунд"
        System.out.println("Совпадения с группой \"второй Раунд\": " + matches2);

        // Числа из массива "уникальные" сравнить с числами в массивах из группы "третий Раунд" и вывести количество совпадений на консоль
        int matches3 = 0; // Счетчик для совпадений с группой "третий Раунд"

        // Проходим по массиву "уникальных" чисел и сравниваем их с числами в массивах из группы "третий Раунд"
        for (int i = 0; i < uniqueCount; i++) {
            int number = unique[i]; // Берем "уникальное" число
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 5; k++) {
                    if (number == groups[2][j][k]) { // Если число совпадает с числом в массиве из группы "третий Раунд"
                        matches3++; // Увеличиваем счетчик совпадений на 1
                    }
                }
            }
        }

        // Выводим на консоль количество совпадений с группой "третий Раунд"
        System.out.println("Совпадения с группой \"третий Раунд\": " + matches3);

// Выводим на консоль итоговый результат нашего анализа
        System.out.println("Итоговый результат:");
        System.out.println("В группе \"первый Раунд\" есть " + singlesCount + " \"одиночек\", " + doublesCount + " \"двойек\" и " + triplesCount + " \"тройек\".");
        System.out.println("В группе \"второй Раунд\" есть " + matches2 + " совпадений с массивом \"уникальные\".");
        System.out.println("В группе \"третий Раунд\" есть " + matches3 + " совпадений с массивом \"уникальные\".");
    }

    // Метод readNumbersFromFile, который выбирает числа из строки и помещает их в массив
    public static int[] readNumbersFromFile(String line) {
        // Создаем массив для хранения пяти чисел
        int[] numbers = new int[5];

        // Создаем счетчик для хранения количества чисел
        int count = 0;

        // Создаем объект Scanner для чтения чисел из строки
        Scanner sc = new Scanner(line);

        // Устанавливаем разделитель для Scanner в запятую
        sc.useDelimiter(",");

        // Читаем числа из строки, пока они есть и пока счетчик меньше пяти
        while (sc.hasNextInt() && count < 5) {
            // Считываем число из строки
            int number = sc.nextInt();

            // Проверяем, что число в диапазоне от 1 до 35
            if (number >= 1 && number <= 35) {
                // Добавляем число в массив
                numbers[count] = number;

                // Увеличиваем счетчик на 1
                count++;
            }
        }

        // Закрываем Scanner
        sc.close();

        // Сортируем массив по возрастанию
        Arrays.sort(numbers);

        // Возвращаем массив
        return numbers;
    }

}