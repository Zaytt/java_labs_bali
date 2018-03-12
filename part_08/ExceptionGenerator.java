package part_08;

public class ExceptionGenerator {

    public static void main(String[] args) {
        ExceptionGenerator ex = new ExceptionGenerator();

        ex.generayArrayIndexException();
    }

    public void generayArrayIndexException(){
        int array[] = new int[10];
        try{
            for(int i = 0; i<100; i++){
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception catched:");
            e.printStackTrace();
        }
    }
}
