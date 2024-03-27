package udemyDmitryPractic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        var value = new Scanner(System.in).nextInt();
        String finalResult;
        if (value < 0) {
            finalResult = "Value should be >=0";
        } else {
            var result = 1;//здесь мы начинаем хранить результат в переменной от перемножения факториала
            for (var i = 1; i <= value; i++) {
                var oldResult = result;//переменная для хранения данных для применения в проверке переполнения
                result *= i;// result=result*i
                if (oldResult != result / i) {//проверка переполнения
                    result = 0;
                    break;
                }
            }

            finalResult = (result == 0) ? "Int overflow" : String.valueOf(result);
        }
        System.out.println(finalResult);
    }
}

