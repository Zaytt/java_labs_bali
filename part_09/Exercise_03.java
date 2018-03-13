package part_09;

import java.io.*;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

public class Exercise_03 {

    public static void main(String[] args) {
        String filename = "originalFile.txt";
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            System.out.print("Using read(): " + br.read());
            System.out.println();
            System.out.println("Using readLine():");
            while((line = br.readLine()) != null){

                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
