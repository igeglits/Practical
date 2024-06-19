package jeneric;

public class Main3<T> {
    private T city;

    public void setCity(Object obj) {
        this.city = (T) obj;
    }

    public void printCity() {
        System.out.println(city);
    }

    public static void main(String[] args) {
        Main3<Integer> main = new Main3<>();
        main.setCity("London");
        main.printCity();
    }
}
