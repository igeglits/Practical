package stringBuilderMethods;

class Ravenstvo {
    static StringBuilder sb1 = new StringBuilder("abc");
    static StringBuilder sb2 = new StringBuilder("abc");
    static StringBuilder sb3 = sb1;
    static StringBuilder sb4 = new StringBuilder("123");


    static boolean stringBEquals(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        sb2.append(12);
        sb2.insert(5, 3);
        sb2.replace(5,6,"45");
        sb2.deleteCharAt(6);


        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(stringBEquals(sb1, sb2));
    }
}
/*
Список методов

Класс StringBuilder имеет два десятка полезных методов, вот самые важные из них:

Метод	Описание
StringBuilder append(obj)
Преобразовывает переданный объект в строку и добавляет к текущей строке
StringBuilder insert(int index, obj)
Преобразовывает переданный объект в строку и вставляет в текущую строку
StringBuilder replace(int start, int end, String str)
Заменяет часть строки, заданную интервалом start..end на переданную строку
StringBuilder deleteCharAt(int index)
Удаляет из строки символ под номером index
StringBuilder delete(int start, int end)
Удаляет из строки символы, заданные интервалом
int indexOf(String str, int index)
Ищет подстроку в текущей строке
int lastIndexOf(String str, int index)
Ищет подстроку в текущей строке с конца
char charAt(int index)
Возвращает символ строки по его индексу
String substring(int start, int end)
        Возвращает подстроку, заданную интервалом
StringBuilder reverse()
Разворачивает строку задом наперед.
void setCharAt(int index, char)
Изменяет символ строки, заданный индексом на переданный
int length()
Возвращает длину строки в символах
Вот краткое описание каждого метода

2. Краткое описание методов
Добавление к строке

Чтобы что-то добавить к изменяемой строке (StringBuilder), нужно воспользоваться методом append(). Пример:

Код	Описание
StringBuilder builder = new StringBuilder("Привет");
builder.append("Пока");
builder.append(123);
Привет
        ПриветПока
ПриветПока123
Преобразование к стандартной строке

Чтобы преобразовать объект StringBuilder к строке типа String, нужно просто вызвать у него метод toString(). Пример

Код	Вывод на экран
StringBuilder builder = new StringBuilder("Привет");
builder.append(123);
String result = builder.toString();
System.out.println(result);
Привет123
Как удалить символ?

Чтобы удалить символ в изменяемой строке, вам нужно воспользоваться методом deleteCharAt(). Пример:

Код	Вывод на экран
StringBuilder builder = new StringBuilder("Привет");
builder.deleteCharAt(2);
String result = builder.toString();
System.out.println(result);
Првет
Как заменить часть строки на другую?

Для этого есть метод replace(int begin, int end, String str). Пример:

Код	Вывод на экран
StringBuilder builder = new StringBuilder("Привет");
builder.replace(2, 5, "Hello!");
String result = builder.toString();
System.out.println(result);
ПрHello!т
*/


