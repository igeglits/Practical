package udemyDmitryPractic;

import java.util.Random;

public class FindMinElement {
    public static void main(String[] args) {
        var i = new Random().nextInt();

        var i1 = new Random().nextInt();

        var i2 = new Random().nextInt();

        var i3 = new Random().nextInt();

        var i4 = new Random().nextInt();

        int[] array = {i, i1, i2, i3, i4};
        FindMinElement findMinElement = new FindMinElement();
        var min = findMinElement.getMin(array);
        System.out.println(findMinElement.getMin(array));
        System.out.println(findMinElement.getMin(array, 1, array[0]));
        System.out.println(findMinElement.getMin(array, 0));
    }

    protected int getMin(int[] array) {
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                //}else{min=min;
            }
        }
        return min;
    }

    protected int getMin(int[] array, int i, int min) {
        if (i == array.length) {
            return min;
        } else {
            //           if (array[i] < min) {
            //            return getMin(array, i+1, array[i]);
            //        }else{
            //            return getMin(array,i+1,min);
            //          }

            return getMin(array, i + 1, Math.min(array[i], min));//return getMin(array, i+1,array[i]<min ? array[i] : min);
        }
    }

    public int getMin(int[] array, int i) {
        if (i == array.length - 1) {//т.е. i = Последнему элементу в массиве
            return array[array.length - 1]; // возвращаем последний элемент как минимальный
        } else {
            var min = getMin(array, i + 1);
//            if (array[i] < min) {
//                return array[i];
//            } else {
//                return min;
//            }
        return Math.min(array[i], min);//return array[i]<min ? array[i] : min;
        }
    }
}


