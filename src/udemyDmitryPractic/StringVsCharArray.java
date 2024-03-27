package udemyDmitryPractic;

public class StringVsCharArray {
    public static void main(String[] args) {
        char [] s1={'h','e','l','l','o'};
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);
        }
        System.out.println();
        String s2="hello";//строка
        for (int i = 0; i < s2.length(); i++) {//скобки в s2.length() указывают на метод длины строки
            System.out.print(s2.charAt(i));//здесь тоже метод s2.charAt(i) и здесь индекс начинается с нуля тоже
        }
        System.out.println();
    }// массив можно видоизменять, строку же нельзя.Т.е. можно в индекс массива задать какое-то изменение. В строке так сделать нельзя.
}
