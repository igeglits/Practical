package UdemyDmitryPractic;

import java.util.Arrays;

class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 5, 3, 19, 23, 89, 74, 9};
        int key = 19;
        var arraySorted = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(arraySorted));
        var low = 0;
        var high = array.length - 1;
        var index = binarySearch.getBinarySearch(array, key, low, high);
        System.out.println(index);
        var index2 = binarySearch.recursiveBinarySearch(array, key, low, high);
        System.out.println(index2);
        var index3 = binarySearch.functionBinarySearch(array, key);
        System.out.println(index3);
    }

    private int getBinarySearch(int[] array, int key, int low, int high) {
        int index = 0;
        while (low <= high) {
            var mid = (low + high) / 2;
            if (array[mid] == key) {
                index = mid;
                break;
            }
            if (array[mid] < key) {
                for (int i = mid + 1; i < array.length; i++) {
                    if (array[i] == key) {
                        index = i;
                    }
                }
            }
            if (array[mid] > key) {
                for (int i = 0; i < mid -1; i++) {
                    if (array[i] == key) {
                        index = i;
                    }
                }
            }
            else{
                index = -1;
            }
        }
        return index;
    }

    private int recursiveBinarySearch(int[] array, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (array[mid] == key) {
            return mid;
        } else if (array[mid] < key) {
            return recursiveBinarySearch(array, key, mid + 1, high);
        } else {
            return recursiveBinarySearch(array, key, low, mid - 1);
        }
    }

    private int functionBinarySearch(int[] array, int key) {
        return Arrays.binarySearch(array, key);
    }
}
