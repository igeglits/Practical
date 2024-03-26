package UdemyDmitryPractic;

public class FunctionsReturnResult {
    private static int function01() {
        return 2 + 4;
    }

    private static int function02() {
        if (2 > 3) {
            return 2;
        }
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                return 8;
            }
        }
        return function01();
    }
    private static void function03(){//void значит, что функция ничего не возвращает. Ретурн здесь не нужен.
        //такими функциями является те, что выполняют действия с другими результатами и выводят на консоль, например.
        //или эта функция записывает результат в глобальную переменную, как следующая функция.

    }
    private static void function4(){
        int a = 0;
        if (a>2){
            return;//здесь ретурн значит, что надо прервать выполнение функции и дальше не проверять условия ниже.
        }
        //продолжение условий.
    }

    public static void main(String[] args) {
        function03();
        function4();

        function01();
        function02();//подсвечивается логическая ошибка - зачем функция, которая возвращает результат, а результат не используется.
        
        System.out.println(function01());
        System.out.println(function02());

        int a = function01();
        if (a>0){
            //
        }
        int b = function02();
        int c = b +function01();
        if (function01()>0){
            //
        }
        if (function02()%12<0) {
            //
        }
    }
}

