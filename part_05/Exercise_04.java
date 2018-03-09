package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

public class Exercise_04 {
    //Create multiple instances of Class02
    public static void main(String[] args) {
        Classroom classroom1 = new Classroom("Java Fundamentals");
        Classroom classroom2 = new Classroom("Advanced Java", "Ryan");
        Classroom classroom3 = new Classroom("Super Advanced Java","Profesor X", 10);

        classroom1.setTeacher("Caden");
        classroom2.setStudents(12);
        classroom3.setTeacher("John Johnson");

    }

}

class Classroom{
    private String teacher;
    private String courseName;
    private int students;

    public Classroom(String courseName) {
        this.courseName = courseName;
    }

    public Classroom(String teacher, String courseName) {
        this.teacher = teacher;
        this.courseName = courseName;
    }

    public Classroom(String teacher, String courseName, int students) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.students = students;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }
}