package Epam;


    public class MaxMethod {

        static int max(int... values) {
            int max = values[0];
            for (int value : values) {
                if (value > max) {
                    max = value;
                }
            }
            return max;
        }
        public static void main(String[] args){
            int [] array = {1, 2, 3, 4, 5};
            max(array);
        }

    }

