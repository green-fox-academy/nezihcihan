public class Student {
    public void learn() {
        System.out.println("Student is learning.");
    }
    public void question(Teacher teacher) {
        teacher.answer();
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Teacher teacher1 = new Teacher();
        student1.learn();
        student1.question(teacher1);
    }
}
