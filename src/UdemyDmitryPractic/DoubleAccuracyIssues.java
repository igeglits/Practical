package UdemyDmitryPractic;

import java.math.BigDecimal;

public class DoubleAccuracyIssues {
    public static void main(String[] args) {
        {
            var a = 2;
            var b = 1.1;
            var c = a - b;
            System.out.println(c); //результат 0.8999999,а не 0.9. Тип дабл для точных вычислений не подходит
            //дабл эффективен, когда не совсем важна точность при вычислении
        }
        {
            BigDecimal a = new BigDecimal("2");
            BigDecimal b = new BigDecimal("1.1");
            BigDecimal c = a.subtract(b);
            System.out.println(c);//результат 0.9

        }

    }
}
