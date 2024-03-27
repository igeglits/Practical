package udemyDmitryPractic;

public class StringBuilderVsStringConcatenation {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";

        String res1 = s1 + s2 + s3;
        String res2 = new StringBuilder().append(s1).append(s2).append(s3).toString();
        //вообще конкатинация в компиляции автоматически заменяется на стрингбилдер, но конкатинация более читабельна. Идея сама предлагает стрингбилдер заменить на конкатинацию.
        // но объединение в цикле всегда надо использовать стрингбилдер.
        System.out.println(res1);
        System.out.println(res2);
    }
}
