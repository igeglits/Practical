package Factorial;



class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5, 1));
        System.out.println(factorial(1,5, 1));
    }
    //result переменная для обозначения факториалов чисел 0 или 1.

    private static int factorial(int to, int result) {
        if (to==0){
          return result;
        }else{
         return to*factorial(to-1, result);
        }
    }
    private static int factorial(int from,int to, int result){
        if(from>to){
            return result;
        }else{
            return factorial(from+1, to, result*from);
        }
    }
}
