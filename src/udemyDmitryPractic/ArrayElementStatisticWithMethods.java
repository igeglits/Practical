package udemyDmitryPractic;

public class ArrayElementStatisticWithMethods {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var result = calculateStatistics(array);

        /*заменим блок кода который отображает результат.
        for (int i = 0; i < count; i++) {
            System.out.println(unique[i] + "=" + ((double) counts[i] * 100 / array.length) + "%");
            }
         */
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "=" + ((double) result[i][1] * 100 / array.length) + "%");
        }

    }

    private static int[][] calculateStatistics(int[] array) {
        int[] unique = new int[array.length];//массив будет содержать все данные из заданного массива в случае, если все числа в нем уникальные
        int[] counts = new int[array.length];// хранение результата счетчика для уникальных элементов, тоже может быть равен заданному, если все элементы уникальные, тогда все значения буду = 1
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            var element = array[i];
            var exists = isAllReadyProcessed(count, unique, element);
            if (!exists) { //а здесь мы обрабатываем уникальный элемент на счетчике.
                var number = calculateElementCount(array, i, element);
                count = addToResult(unique, count, element, counts, number);
            }
        }
        return convertResult(count, unique, counts);
    }

    private static boolean isAllReadyProcessed(int count, int[] unique, int element) {
        var exists = false;//проверяем, если ли такой элемент в созданном массиве unique, если есть то тру и брейк.
        for (int j = 0; j < count; j++) {//На первой итерации у нас count=0, не проверяем массив unique т.к. j=0 и условие j меньше count=0 выполняется. На второй итерации count 1, будет проверен индекс j=0 и т.д.
            if (unique[j] == element) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    private static int calculateElementCount(int[] array, int i, int element) {
        var number = 1;//элемент уникальный и ему присваивают счет равный 1.
        for (int j = i + 1; j < array.length; j++) //i+1 здесь потому, что слева от текущей позиции элемент уже был проверен и его там нет. Значит надо просмотреть элементы на повторение справа
        {
            if (element == array[j]) {
                number++;//счетчик
            }
        }
        return number;
    }

    private static int addToResult(int[] unique, int count, int element, int[] counts, int number) {
        unique[count] = element;
        counts[count] = number;
        count++;
        return count;
    }

    private static int[][] convertResult(int count, int[] unique, int[] counts) {
        //создадим из переменной unique, count,counts двумерный массив после цикла ФОР
        int[][] result = new int[count][2];//Количество строк будет count, количество столбцов 2. В первом столбце будем хранить
        //уникальные результаты, а во втором будет отображаться счетчик вхождений данных уникальных результатов.
        for (int i = 0; i < count; i++) {
            result[i][0] = unique[i];//в нудевой столбец записываем unique по индексу i
            result[i][1] = counts[i];//в первый столбец записываем counts по индексу i
        }
        return result;
    }
}

