
class Person {
    private String name;
    private int age;

    // Конструктор, геттеры и сеттеры

    @Override
    public boolean equals(Object obj) {
        // Проверка на рефлексивность
        if (this == obj) {
            return true;
        }
        // Проверка на null
        if (obj == null) {
            return false;
        }
        // Проверка на принадлежность к тому же классу
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Приведение типов
        Person other = (Person) obj;
        // Сравнение полей по значению
        if (age != other.age) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
}

