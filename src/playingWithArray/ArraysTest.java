package playingWithArray;

import java.util.Arrays;

import static java.lang.System.out;
import static java.util.Arrays.sort;

class ArraysTest {
    static int[] array = {1, 6, -8, -4, 9, 45, -3, -34, 0, 88};
    static String array2[][] = {{"apple", "orange"}, {"hello", "buy", "ok"}, {"car"}};


    static void sortirovka(int[] array) {
        sort(array);
        for (int i : array) {
            out.print(i + " ");
        }
        out.println(Arrays.binarySearch(array, -34));

    }

    static void showArray(String[][] array) {
        out.print("{  ");
        for (int i = 0; i < array.length; i++) {
            out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    out.print(array[i][j] + ", ");
                } else {
                    out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                out.print("}, ");
            } else {
                out.print("  }");
            }
        }
        out.print(" }");
    }

    static void array3(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        out.println();
        for (int i : array) {
            out.print(i + " ");
        }
    }

    static void sortDesc(int[] array) {
        int temp;
        for (int i = (array.length - 1); i == 1; i--) {
            for (int j = (array.length - 2); j == 0; j--) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        out.println();
        for (int i : array) {
            out.print(i + " ");
        }
    }

    static void array4(int[] array) {
        Arrays.stream(array)
                .sorted().toArray();
        toPrint(array);
    }

    static void toPrint(int[] array) {
        for (int i : array) {
            out.print(i + " ");
        }
    }

    public static void main(String[] args) {
       sortirovka(array);
       showArray(array2);
       showArray(new String[][]{{"man", "woman"}, {"male", "female"}});
           array3(array);
           out.println();
        array4(array);
        out.println("sort Desc");
        sortDesc(array);
    }
}
