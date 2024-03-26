package UdemyDmitryPractic;

public class LogicExpressions {
    public static void main(String[] args) {
        var a = true;
        var b = false;
        var c = 2 > 1;// т.к. это истина в переменную с будет записано значение true
        var d = 2 == 1; //false

//к переменным логического типа могут быть применены логические операнды и первы - это отрицание
        System.out.println(!a);//выведет false
        System.out.println(!b);//true т.е. все наоборот со стороками 5 и 6

        System.out.println(a && b);//это "и". false т.к. хотябы один из переменных false
        System.out.println(a || b);//это "или". и это будет true т.к. хотя бы один оператор true
    }
}
