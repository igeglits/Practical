package multithreading;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.concurrent.*;

class Callable_Future {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Factorial factorial = new Factorial(5);
        //executorService.execute(factorial); // или
        //Future без дженерика future = executorService.submit(new factorial(5)); // метод get всегда будет возвращать null здесь,
        // ведь Runnable ничего не возвращает
        //  System.out.println(future.get); == null
        // Но Future позволит узнать закончилось ли задание, можно остановить потоки, если они не закончились
        Future<Integer> future = executorService.submit(factorial); // submit возвращает Future, а execute нет
        // (Future - это интерфейс, который позволяет получить результат работы потока)
        try {
            System.out.println(""+future.isDone());//
            System.out.println("Waiting for result");
            factorialResult = future.get(); // get - метод, который возвращает результат работы потока
            System.out.println("Result is received");
        } catch (ExecutionException e) {
            System.out.println(e.getCause());// getCause - метод, который возвращает причину исключения
            // (Throwable) в потоке factorial  throw new Exception("f <= 0");
            return;
        }
        finally {
            executorService.shutdown();
        }
        //executorService.shutdown();
        //executorService.awaitTermination(10, TimeUnit.SECONDS); // ждем 10 секунд и останавливаем пул потоков,
        // без ожидания main завершится раньше чем поток и не выведет результат, а выведет 0.
        System.out.println(future.isDone());
        System.out.println(factorialResult);
    }
}

@NoArgsConstructor
@AllArgsConstructor
class Factorial implements Callable<Integer> {// Callable - интерфейс,
    // который позволяет получить результат работы потока (возвращает значение)
    // и выбрасывать исключения (throws Exception). С Thread thread не работает, только с ExecutorService
    int f;

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("f <= 0");
        } else {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
                Thread.sleep(1000);
            }
            return result;
        }
    }

}
/*@AllArgsConstructor//
@NoArgsConstructor // lombok - плагин, который генерирует геттеры, сеттеры, конструкторы и т.д. автоматически
class factorial implements Runnable {// Runnable - интерфейс, который позволяет создать поток

    int f;

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("result = 1");;
            return;
        } else {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
            }
            Callable_Future.factorialResult = result;
        }
    }
}*/
