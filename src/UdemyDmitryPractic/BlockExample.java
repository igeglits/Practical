
package UdemyDmitryPractic;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class BlockExample {

    public static void main(String[] args) {
        int a = 0;
        {
            int b = 0;
            System.out.println(a);
            System.out.println(b);
            {
                int c = 0;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            System.out.println("");
        }

        System.out.println(a);
    }
}
