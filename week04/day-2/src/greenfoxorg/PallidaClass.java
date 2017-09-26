package greenfoxorg;
import java.util.ArrayList;
import java.util.List;

public class PallidaClass {
    String className;
    List<Student> students;
    List<Mentor> mentors;


    public PallidaClass(String className) {
        this.className = className;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }
    public void addStudent(Student member) {
        students.add(member);
    }
    public void addMentor(Mentor member) {
        mentors.add(member);
    }
    public void info() {
        System.out.println("Pallida " +  className + " class has " +  students.size() +
                " students and " + mentors.size() + " mentors.");
    }
}
