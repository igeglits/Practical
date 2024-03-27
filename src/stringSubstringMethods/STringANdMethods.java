package stringSubstringMethods;

import java.util.Arrays;
import java.util.List;

class STringANdMethods {
    public static void main(String[] args) {
separatorANdSubstring();
    }

    static void joinToStringPrint() {
        List<String> people = Arrays.asList(
                "Philip J. Fry",
                "Turanga Leela",
                "Bender Bending Rodriguez",
                "Hubert Farnsworth",
                "Hermes Conrad",
                "John D. Zoidberg",
                "Amy Wong"
        );

        String peopleString = String.join("; ", people);
        System.out.println(peopleString);
    }

    static void splitToArray() {
        String people = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth; Hermes Conrad; John D. Zoidberg; Amy Wong";

        String[] peopleArray = people.split("; ");
        for (String human : peopleArray) {
            System.out.println(human);
        }
    }
    static void separatorANdSubstring() {
        String filePath = "D:\\Movies\\Futurama.mp4";
        int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
        String fileName = filePath.substring(lastFileSeparatorIndex + 1);
        System.out.println(fileName);
    }
}
/*Определение позиции элемента в строке
В языке Java String предоставляет набор методов для определения позиции символа/подстроки в строке:
indexOf(int ch)
indexOf(int ch, int fromIndex)
indexOf(String str)
indexOf(String str, int fromIndex)
lastIndexOf(int ch)
lastIndexOf(int ch, int fromIndex)
lastIndexOf(String str)
lastIndexOf(String str, int fromIndex)
Где:
ch — искомый символ (char)
str — искомая строка
fromIndex — позиция с которой нужно искать элемент
методы indexOf — возвращают позицию первого найденного элемента
методы lastIndexOf — возвращают позицию последнего найденного элемента
Если искомый элемент не найден, методы вернут в строке -1.
Извлечение подстроки из строки
Для извлечения подстроки из строки класс String в Java предоставляет методы:
substring(int beginIndex)
substring(int beginIndex, int endIndex)
Перевод строки в верхний/нижний регистр:
Класс String предоставляет методы для перевода строки в верхний и нижний регистры:
toLowerCase()
toUpperCase()
*/

