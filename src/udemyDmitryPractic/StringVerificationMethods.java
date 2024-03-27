package udemyDmitryPractic;

public class StringVerificationMethods {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println("s.contains(\"world\")=" + s.contains("world"));
        // метод проверяет, содержит ли строка слово "world". возвращает тру или фолс
        System.out.println("s.indexOf('o')=" + s.indexOf('o'));
        System.out.println("s.lastIndexOf('o')=" + s.lastIndexOf('o'));
        // метод определения индекса у символа в текущей строке
        System.out.println("s.indexOf(\"world\")=" + s.indexOf("world")); //индекс начала слова world первый раз в строке
        System.out.println("s.lastIndexOf(\"world\")=" + s.lastIndexOf("world"));//индекс начала слова world последний раз в строке, если оно там есть

        System.out.println("s.startsWith(\"Hello\")=" + s.startsWith("Hello"));//проверка, что строка начинается с этого слова.
        System.out.println("s.endsWith(\"world\")" + s.endsWith("world"));//проверка, что строка заканчивается этим словом

        System.out.println("s.isEmpty()=" + s.isEmpty());//является ли строка пустой ""

        System.out.println("\"\".isEmpty()=" + "".isEmpty());
    }
}
