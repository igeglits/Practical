package UdemyDmitryPractic;
/*
Дана строка: "Hello world!"

Реализовать программу ReverseStringBuilder, которая преобразовывает данную строку в строку с обратным порядком символов:

!dlrow olleH
Главное отличие от программы PrintReverseString в том, что строка с обратным порядком формируется за счет использования StringBuilder, а не за счет посимвольного вывода строки на консоль. После формирования результат записывается в переменную res и уже потом выводится на консоль. Данное отличие позволяет использовать переменную res, которая содержит строку в обратном порядке дальше в программе.

В случае если выводить строку посимвольно с помощью System.out.print в консоль как выполняется в программе  PrintReverseString, то выведенную таким образом строку дальше в программе использовать НЕВОЗМОЖНО, потому что в Java нет возможности считывать с консоли данные, которые выводятся с помощью System.out.print!

-----------------------------------------------------------------------------------

Структурно данная программа должна содержать все три секции стандартной консольной программы: считывание исходных данных, обработка и отображение результата!

-----------------------------------------------------------------------------------
 */
public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Hello World!";
        StringBuilder helloWorld=new StringBuilder(s);
        helloWorld.reverse();
        String result = helloWorld.toString();
        System.out.println(result);

    }

}
/*вариант препода
// read source data
        String s = "Hello world!";

        // processing САМЫЙ ЭФФЕКТИВНЫЙ И ОПТИМАЛЬНЫЙ СПОСОБ С ПОЗИЦИИ ИСПОЛЬЗОВАНИЯ РЕСУРСОВ ПАМЯТИ.
        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }

        /*
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builder.insert(0, s.charAt(i));
        }
         */

        /*
        StringBuilder builder = new StringBuilder();
        builder.append(s).reverse();
         */

// display results
/*
        System.out.println(builder.toString());

        САМАЯ ПЛОХАЯ РЕАЛИЗАЦИЯ
        // read source data
        String s = "Hello world!";

        // processing
        String res = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            // Use StringBuilder instead!
            res = res + s.charAt(i);
        }

        // display results
        System.out.println(res);

 */