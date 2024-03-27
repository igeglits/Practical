package udemyDmitryPractic;

public class Var {
    public static void main(String[] args) {
        var text = "Hello World";//создание переменной, ключевое слово var, это не тип
        // это рекомендация - пусть компилятор автоматически определит тип - без инициализации var нельзя оставлять
        // var s не работает
        // var s=1 - так это работает
        System.out.println(text);//

        text = "I love Java";//создание переменной, ключевое слово var
        System.out.println(text);

        text = "Hello " + System.getProperty("user.name");//ячейка получает динамические данные
        System.out.println(text);
    }
}
