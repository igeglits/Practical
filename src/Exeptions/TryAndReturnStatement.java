package Exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class TryAndReturnStatement {

    static int abc(){
        try{
            File f = new File("exeptions.txt");
            FileInputStream fileInputStream = new FileInputStream(f);
            return 5;
        }
        catch (FileNotFoundException e){
            System.out.println("exeption пойман" + e);
            return 6;
        }finally {
            System.out.println("это finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
