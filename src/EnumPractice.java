
// Объявление enum с названием DaysOfWeek
enum DaysOfWeek {
    // Поля enum
    MONDAY("Понедельник") {
        @Override
        public void printInfo() {

        }
    },
    TUESDAY("Вторник") {
        @Override
        public void printInfo() {

        }
    },
    WEDNESDAY("Среда") {
        @Override
        public void printInfo() {

        }
    },
    THURSDAY("Четверг") {
        @Override
        public void printInfo() {

        }
    },
    FRIDAY("Пятница") {
        @Override
        public void printInfo() {

        }
    },
    SATURDAY("Суббота") {
        @Override
        public void printInfo() {

        }
    },
    SUNDAY("Воскресенье") {
        @Override
        public void printInfo() {

        }
    };

    // Приватное поле для хранения названия дня недели
    private final String russianName;

    // Конструктор enum
    DaysOfWeek(String russianName) {
        this.russianName = russianName;
    }

    // Метод для получения русского названия дня недели
    public String getRussianName() {
        return russianName;
    }

    // Абстрактный метод, который должен быть реализован в каждом значении enum
    public abstract void printInfo();
}

// Пример использования enum
class EnumPractice {


    public static void main(String[] args) {
        // Использование enum значений
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day + " на русском: " + day.getRussianName());
            day.printInfo(); // Вызов абстрактного метода
        }
    }
}

