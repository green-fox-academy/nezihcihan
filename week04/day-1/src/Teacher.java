public class Teacher {
    public void answer(){
        System.out.println("Teacher answers to student.");
    }
    public void teach(){
        Student student = new Student();
        student.learn();
    }
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.answer();
        teacher1.teach();

    }
}
