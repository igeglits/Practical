package Exeptions;

import java.io.*;


class FileProcess {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\igegl\\IdeaProjects\\Practical\\src\\Exeptions\\exeption2.txt"); //компилятор и рантайм не проверяют. есть ли такой файл на самом деле.
        try (FileInputStream fileInputStream = new FileInputStream(f)) {
            System.out.println("есть такой файл");
            fileInputStream.read();
        } catch (FileNotFoundException e) {
            System.out.println("Был пойман catch 1 " + e);
        } catch (IOException e2) {
            System.out.println("был пойман catch 2 " + e2);
        } finally {
            System.out.println("выполнен finally");
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(f)) {
            fileOutputStream.write(101);
        } catch (FileNotFoundException e) {
            System.out.println("Был пойман catch 3 " + e);
        }
        catch (IOException e2){
            System.out.println("Был пойман 4 catch"+ e2);
        }
    }
}
