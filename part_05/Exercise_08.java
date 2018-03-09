package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, access the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int.
 */

class OuterClass{
    // private variable of the outer class
    private int num = 123456;
    private String string = "This is inside the Outer Class";
    InnerClass inner = new InnerClass();

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        outer.inner.getNum();
        outer.inner.getString();
    }

    // inner class
    class InnerClass {
        public int getNum() {
            System.out.print("This is the getnum method of the inner class - ");
            System.out.println(num);
            return num;
        }
        public String getString(){
            System.out.print("This is the getString method of the inner class - ");
            System.out.println(string);
            return string;
        }
    }
}