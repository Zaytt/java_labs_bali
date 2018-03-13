package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification, can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.

import java.io.File;
import java.text.SimpleDateFormat;

public class Exercise_04 {
    public static void main(String[] args) {
        File file = new File("originalFile.txt");
        System.out.println(file.getName() + " was last modified at: " + FileManager.getFileLastModificationDate(file));
        FileManager.canWrite(file);
        FileManager.setToReadOnly(file);

    }


}

class FileManager{


    public static String getFileLastModificationDate(File file){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return sdf.format(file.lastModified());
    }

    public static boolean canWrite(File file){
        boolean canWrite = file.canWrite();
        System.out.println((canWrite) ? "You can write into " + file.getName() : "You cannot write into " + file.getName());
        return canWrite;
    }

    public static void setToReadOnly(File file){
        file.setReadOnly();
        System.out.println("You've set the file " +  file.getName() + " to read only.");
    }
}








