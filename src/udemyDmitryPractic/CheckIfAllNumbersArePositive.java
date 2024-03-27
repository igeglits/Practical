package udemyDmitryPractic;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, -9};
        var allPositive = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {} else {
                allPositive = false;
                break;
            }
        }
        System.out.println(allPositive == true ? "All positive" : "Not all positive");

        //как надо было сделать
        for (int value : array) {
            if(value<0){
                allPositive=false;
                break;
            }
        }
        System.out.println(allPositive ? "All positive" : "Not all positive");
    }
}
