package homework_15_exception.level_4_junior;

class StackOverFlow {
    public static void main(String[] args) {
        function(0);

    }

    private static void function(int count) {
        while (true) {
            function(count + 1);
        }
    }
}
