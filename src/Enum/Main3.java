package Enum;

class Main3 {
    public static void main(String[] args) {
        System.out.printf("%h%n",Color.RED.getColor());
    }
    enum Color {
        RED(0xFFFF0000),
        Green(0xFF00ff00),
        BLUE(0xFF0000FF);
        private final int value;

        Color(int value) {
            this.value = value;
        }

        public int getColor() {
            return value;
        }
    }
}
