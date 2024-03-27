package udemyDmitryPractic;

public class InfiniteOrLongCycle {
    public static void main(String[] args) {
        long time = System.nanoTime();//сохраняем время перед вычислением кода

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.currentTimeMillis();//запрашивает текущее время
            if (i % 1_000_000 == 0) {//контрольные точки, отображение на каждую миллионную итерацию выводит результат
                System.out.println(i);
            }
        }

        long result = System.nanoTime() - time;
        System.out.println((double) result / 1_000_000_000 + " seconds");//переводит миллисекунды в секунды
    }
}
