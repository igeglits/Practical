package encapsulation;

public class Human {
    final String sex;

    public Human(String sex) {
        this.sex = sex;
    }
    private String name;
    private int age;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if(weight>0) {
            this.weight = weight;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}

class Test{
    public static void main(String[] args) {
        Human human = new Human("male");
        human.setName("John");
        human.setAge(25);
        human.setWeight(70);
    }
}