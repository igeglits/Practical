package VarArgs;

class VarArgs {
    static void summa(String s, int ...a){
        int summa = 0;
        for(int i = 0; i<a.length; i++)
        {summa+=a[i];}
        System.out.println(s);
        System.out.println(summa);

    }

    public static void main(String[] args) {
        summa("5", 7, 6, 9);
    }
}
