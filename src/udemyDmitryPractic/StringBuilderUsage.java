package udemyDmitryPractic;

public class StringBuilderUsage {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder builder = new StringBuilder();//это ИЗМЕНЯЕМАЯ СТРОЧКА, ее метод
        builder.append("world");//вносим в строку первое слово
        builder.insert(0,"hello");//вносим в строку дополнительную строку с 0 индекса, т.е. перед изначальным ворлд
        builder.insert(5,' ');//вносим пробел между двумя словами в соответствующий индекс
        //append добавляет в конец строки

        String result = builder.toString();//преобразуем строку в неизменяемую.
        System.out.println(result);
//удаляем символ
        builder.deleteCharAt(0);
        System.out.println(builder.toString());
        //удаляем строку
        builder.setLength(0);
        //или
        builder.delete(0, builder.length());
        System.out.println(builder.toString());
        System.out.println("qwerty");
    }
}
