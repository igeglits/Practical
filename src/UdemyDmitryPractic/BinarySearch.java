package UdemyDmitryPractic;

import java.util.Arrays;

class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 5, 3, 19, 23, 89, 74, 9};
        int key = 100;
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
        var arraySwapped = binarySearch.swap(array, 1, 2);
        System.out.println(Arrays.toString(arraySwapped));
    }

    private int getBinarySearch(int[] array, int key, int low, int high) {
        int index = -1;
        while (low <= high) {
            var mid = (low + high) / 2;
            if (array[mid] == key) {
                index = mid;
                break;
            }
            if (array[mid] < key) {
                low = mid + 1;
            }
            if (array[mid] > key) {
                high = mid - 1;
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
    private int[] swap(int[] array, int i, int j){
        array = Arrays.stream(array).map(x -> x == i ? j : x == j ? i : x).toArray();
        return array;
    }
}
