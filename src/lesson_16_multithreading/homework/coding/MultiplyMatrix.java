package lesson_16_multithreading.homework.coding;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultiplyMatrix {

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) throws InterruptedException {
        // Получаем количество строк и столбцов для матриц
        int rows1 = matrix1.length; // Количество строк в первой матрице
        int columns1 = matrix1[0].length; // Количество столбцов в первой матрице (и количество строк во второй матрице)
        int columns2 = matrix2[0].length; // Количество столбцов во второй матрице

        // Создаем массив для результирующей матрицы
        int[][] result = new int[rows1][columns2];

        // Создаем пул потоков с количеством потоков, равным количеству доступных процессорных ядер

        /*int availableProcessors = Runtime.getRuntime().availableProcessors();:
        Метод availableProcessors() класса Runtime возвращает количество доступных процессорных ядер в системе.

        ExecutorService executor = Executors.newFixedThreadPool(availableProcessors);:
        Мы создаем пул потоков с фиксированным количеством потоков, равным количеству доступных процессорных ядер.
        Для этого используется метод newFixedThreadPool() класса Executors.

        executor.execute(task);:
        Задача представлена в виде Runnable, и мы передаем ее в пул потоков для выполнения методом execute().

        executor.shutdown();: После завершения всех задач мы вызываем метод shutdown(),
        чтобы завершить работу пула потоков. Это важно сделать после выполнения всех задач,
        чтобы освободить ресурсы и завершить выполнение программы корректно.
*/
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        // Создаем счетчик, который будет сигнализировать о завершении всех задач
        CountDownLatch latch = new CountDownLatch(rows1 * columns2);

        // Запускаем вычисления для каждой ячейки результирующей матрицы
        for (int i = 0; i < rows1; i++) {
            int row = i;
            for (int j = 0; j < columns2; j++) {
                int col = j;
                // Выполняем каждое умножение в отдельном потоке
                executor.execute(() -> {
                    int sum = 0;
                    // Вычисляем скалярное произведение строки из первой матрицы и столбца из второй матрицы
                    for (int k = 0; k < columns1; k++) {
                        sum += matrix1[row][k] * matrix2[k][col];
                    }
                    // Записываем результат в соответствующую ячейку результирующей матрицы
                    result[row][col] = sum;
                    // Уменьшаем счетчик, указывающий на завершение задачи
                    latch.countDown();
                });
            }
        }

        // Ожидаем завершения всех задач
        latch.await();
        // Завершаем работу пула потоков
        executor.shutdown();
        // Возвращаем результирующую матрицу
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        // Создаем исходные матрицы
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Выполняем умножение матриц
        int[][] result = multiply(matrix1, matrix2);

        // Выводим результат на экран
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}






/*
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Получаем количество доступных процессорных ядер
        int availableProcessors = Runtime.getRuntime().availableProcessors();

        // Создаем пул потоков с фиксированным количеством потоков,
        // равным количеству доступных процессорных ядер
        ExecutorService executor = Executors.newFixedThreadPool(availableProcessors);

        // Запускаем 10 задач
        for (int i = 0; i < 10; i++) {
            // Создаем задачу, представленную в виде Runnable
            Runnable task = () -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task executed by thread: " + threadName);
            };

            // Передаем задачу в пул потоков для выполнения
            executor.execute(task);
        }

        // Завершаем работу пула потоков после завершения всех задач
        executor.shutdown();
    }
}
*/
