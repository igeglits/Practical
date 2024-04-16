package encapsulation;

class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public void setCourse(int course) {
        if (1 <= course && course <= 4){
            this.course = course;
        }
    }

    public void setGrade(int grade) {
        if(1<=grade && grade<=10){
            this.grade = grade;
        }
    }

   /* public Student(StringBuilder name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }*/

    public void showInfo(){
        System.out.println("Name: " + getName() + " Course: " + getCourse() + " Grade: " + getGrade());
    }
}
class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("John"));
        student.setCourse(2);
        student.setGrade(8);
        student.showInfo();
    }
}
