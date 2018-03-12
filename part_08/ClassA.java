package part_08;

public class ClassA {

    public static void main(String[] args) {
        ClassB classb = new ClassB();
        try {
            classb.generateException();
        } catch (Exception e) {
            System.out.println("Class B Exception catch");
        }
    }
}
