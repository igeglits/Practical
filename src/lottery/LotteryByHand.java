package lottery;

import java.util.Arrays;

public class LotteryByHand {
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

        // Заполняем массивы данными вручную
        // Группа "первый Раунд"
        groups[0][0] = new int[]{0, 0, 0, 0, 0}; // Первый Раунд 1
        groups[0][1] = new int[]{4, 18, 23, 24, 35}; // Первый Раунд 2
        groups[0][2] = new int[]{21, 24, 25, 29, 35}; // Первый Раунд 3
        groups[0][3] = new int[]{1, 19, 27, 28, 33}; // Первый Раунд 4
        groups[0][4] = new int[]{2, 3, 20, 23, 32}; // Первый Раунд 5
        groups[0][5] = new int[]{2, 4, 11, 32, 34}; // Первый Раунд 6
        groups[0][6] = new int[]{3, 7, 12, 28, 30}; // Первый Раунд 7
        groups[0][7] = new int[]{16, 26, 29, 31, 32}; // Первый Раунд 8

        // Группа "второй Раунд"
        groups[1][0] = new int[]{3, 12, 19, 20, 23}; // Второй Раунд 1
        groups[1][1] = new int[]{1, 26, 27, 28, 31}; // Второй Раунд 2
        groups[1][2] = new int[]{3, 4, 11, 16, 35}; // Второй Раунд 3
        groups[1][3] = new int[]{1, 8, 9, 10, 26}; // Второй Раунд 4
        groups[1][4] = new int[]{7, 19, 22, 28, 35}; // Второй Раунд 5
        groups[1][5] = new int[]{16, 18, 24, 29, 34}; // Второй Раунд 6
        groups[1][6] = new int[]{2, 6, 8, 19, 32}; // Второй Раунд 7
        groups[1][7] = new int[]{16, 19, 27, 29, 33}; // Второй Раунд 8

        // Группа "третий Раунд"
        groups[2][0] = new int[]{22, 29, 30, 31, 35}; // Третий Раунд 1
        groups[2][1] = new int[]{15, 18, 22, 27, 31}; // Третий Раунд 2
        groups[2][2] = new int[]{5, 21, 22, 31, 32}; // Третий Раунд 3
        groups[2][3] = new int[]{11, 12, 17, 23, 32}; // Третий Раунд 4
        groups[2][4] = new int[]{3, 11, 23, 26, 28}; // Третий Раунд 5
        groups[2][5] = new int[]{5, 13, 14, 25, 26}; // Третий Раунд 6
        groups[2][6] = new int[]{5, 6, 11, 33, 35}; // Третий Раунд 7
        groups[2][7] = new int[]{12, 17, 25, 28, 34}; // Третий Раунд 8


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
                doubles[doublesCount] = i; // Добавляем число в массив "двоек"
                doublesCount++; // Увеличиваем счетчик "двоек" на 1
            } else if (freq >= 3) { // Если частота больше или равна 3, то это "тройка"
                triples[triplesCount] = i; // Добавляем число в массив "троек"
                triplesCount++; // Увеличиваем счетчик "троек" на 1
            }
        }

        // Выводим на консоль массивы "одиночек", "двойек" и "тройек"
        System.out.println("Одиночки: " + Arrays.toString(Arrays.copyOf(singles, singlesCount)) +'\n'+ " колличество="+ singlesCount);
        System.out.println("Двойки: " + Arrays.toString(Arrays.copyOf(doubles, doublesCount))+'\n'+ " колличество="+ doublesCount);
        System.out.println("Тройки: " + Arrays.toString(Arrays.copyOf(triples, triplesCount))+'\n'+ " колличество="+ triplesCount);

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
        System.out.println("Уникальные: " + Arrays.toString(Arrays.copyOf(unique, uniqueCount))+'\n'+ " колличество="+ uniqueCount);

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

        // Выводим на консоль количество совпадений с группой "второй Раунд"
        System.out.println("Совпадения с группой \"второй Раунд\": " + matches2);

        // Выводим на консоль количество совпадений с группой "третий Раунд"
        System.out.println("Совпадения с группой \"третий Раунд\": " + matches3);
// Проверяем числа из массива "уникальные" с числами из массивов группы "второй Раунд"
// Создаем новый массив для хранения чисел, которые совпадают с группой "второй Раунд"
        int[] unique2 = new int[35]; // Массив для "уникальных из второго Раунда"
        int unique2Count = 0; // Счетчик для "уникальных из второго Раунда"

// Проходим по массиву "уникальных" чисел и сравниваем их с числами в массивах из группы "второй Раунд"
        for (int i = 0; i < uniqueCount; i++) {
            int number = unique[i]; // Берем "уникальное" число
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 5; k++) {
                    if (number == groups[1][j][k]) { // Если число совпадает с числом в массиве из группы "второй Раунд"
                        unique2[unique2Count] = number; // Добавляем число в массив "уникальных из второго Раунда"
                        unique2Count++; // Увеличиваем счетчик "уникальных из второго Раунда" на 1
                        break; // Выходим из внутреннего цикла
                    }
                }
            }
        }

        // Выводим на консоль массив "уникальных из второго Раунда"
        System.out.println("Уникальные из второго Раунда: " + Arrays.toString(Arrays.copyOf(unique2, unique2Count)));

        // Проверяем числа из массива "уникальные" с числами из массивов группы "третий Раунд"
        // Создаем новый массив для хранения чисел, которые совпадают с группой "третий Раунд"
        int[] unique3 = new int[35]; // Массив для "уникальных из третьего Раунда"
        int unique3Count = 0; // Счетчик для "уникальных из третьего Раунда"

        // Проходим по массиву "уникальных" чисел и сравниваем их с числами в массивах из группы "третий Раунд"
        for (int i = 0; i < uniqueCount; i++) {
            int number = unique[i]; // Берем "уникальное" число
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 5; k++) {
                    if (number == groups[2][j][k]) { // Если число совпадает с числом в массиве из группы "третий Раунд"
                        unique3[unique3Count] = number; // Добавляем число в массив "уникальных из третьего Раунда"
                        unique3Count++; // Увеличиваем счетчик "уникальных из третьего Раунда" на 1
                        break; // Выходим из внутреннего цикла
                    }
                }
            }
        }

        // Выводим на консоль массив "уникальных из третьего Раунда"
        System.out.println("Уникальные из третьего Раунда: " + Arrays.toString(Arrays.copyOf(unique3, unique3Count)));
    }
}
