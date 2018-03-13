package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.*;

public class Exercise_02 {

    public static void main(String[] args) {
        String filename = "originalFile.txt";
        int i;
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename))) {
            do{
                i = bis.read();
                System.out.println(i);
            }while(i != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
