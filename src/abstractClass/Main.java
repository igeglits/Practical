package abstractClass;

public class Main{
    public static void main(String[] args) {
        System.out.println("Программа скомпилировалась.");
    }

    public abstract class MyAbstractClass {
        public abstract void methodOne(); // абстрактный метод
        protected abstract void methodTwo(); // абстрактный метод
        private void methodThree(){}; // абстрактный метод
        public void methodFour(){}; // не абстрактный метод
    }
}

