public class Teacher {
    public void answer(){
        System.out.println("Teacher answers to student.");
    }
    public void teach(Student student){
        student.learn();
    }
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Student student1 = new Student();
        teacher1.answer();
        teacher1.teach(student1);

    }
}
