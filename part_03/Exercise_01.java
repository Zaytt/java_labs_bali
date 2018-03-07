package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/


public class Exercise_01{

    public static void main(String[] args) {

        Cohort baliCohort = new Cohort(12, "Bali", "Ryan", 2018);
        Cohort secretCohort = new Cohort(1, "Nowhere", "Rick Sanchez", 2033);
        Student ivan = new Student("Ivan Chavez", 28, "Mexico", baliCohort);
        Student morty = new Student("Morty", 12, "Unknown", secretCohort);

        printStudentCohort(ivan);
        printStudentCohort(morty);

    }

    public static void printStudentCohort(Student student){
        System.out.println(student.getName() + " belongs to the " + student.getCohort().getYear() +
                " " + student.getCohort().getLocation());
    }



}


class Student{

    private String name;
    private int age;
    private  String nationality;
    private  Cohort cohort;

    public Student(String name, int age, String nationality, Cohort cohort) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.cohort = cohort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Cohort getCohort() {
        return cohort;
    }

    public void setCohort(Cohort cohort) {
        this.cohort = cohort;
    }
}


class Cohort{
    private  int members;
    private  String location;
    private  String teacher;
    private  int year;

    public Cohort(int members, String location, String teacher, int year) {
        this.members = members;
        this.location = location;
        this.teacher = teacher;
        this.year = year;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}