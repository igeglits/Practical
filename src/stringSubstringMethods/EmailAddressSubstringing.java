package stringSubstringMethods;

import java.util.Arrays;

class EmailAddressSubstringing {
    public static void main(String[] args) {
        extractEmailDomain(emails);
       // otZaura(emails);
    }

    public static String emails = "ya123@yahoo.com; on456@mail.ru; ona@gmail.com;";

    static void extractEmailDomain(String emails) {
        int[] indexes = new int[6];
        for (int i = 0, j = 0; i < emails.length(); i++) {
            if ('@' == (emails.charAt(i))) {
                indexes[j] = i + 1;
                j++;
            }
            if ('.' == (emails.charAt(i))) {
                indexes[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(indexes));
        System.out.println(emails.length());
        String[] domains = {emails.substring(indexes[0], indexes[1]), emails.substring(indexes[2], indexes[3]), emails.substring(indexes[4], indexes[5])};
        toPrint(domains);

    }

    static void toPrint(String[] array) {
        int i = 0;
        while (i < array.length){
            System.out.println(array[i]);
            i++;
        }
    }

    static void otZaura(String string) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < string.length() - 1) {
            a = string.indexOf('@', c);
            b = string.indexOf('.', c);
            c = string.indexOf(';', c + 1);
            System.out.println(string.substring(a + 1, b));
        }
    }
}

