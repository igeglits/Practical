package homework_15_exception.level_5_middle.level_1_intern;

/*
Воспользуйтесь документацией Java (javadoc)
и найдите информацию о классе java.lang.Exception.

Напишите класс ExceptionDemo, в котором продемонстрируйте
разные способы создания экземпляра класса Exception.*/
class ExceptionDemo extends Exception{
    ExceptionDemo(String message){
        super(message);
    }
void method (String message) throws ExceptionDemo {
        if (message.equals("123")){
        throw new ExceptionDemo("wrong ID" + message);}
        else {
            System.out.println("correct ID");
        }
}
void method2 (String message){
        try{
            if(message.equals("123")){
            throw new ExceptionDemo("wrong ID"+message);}
            else {
                System.out.println("correct ID");
            }
        }
        catch (ExceptionDemo e){
            System.out.println(e.getMessage());
        }
}

}