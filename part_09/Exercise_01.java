package part_09;

import java.io.*;

/**
 *  Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 *  Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
public class Exercise_01{

    public static void main(String[] args) {
        copyFileByte("originalFile.txt", "copied.txt");
        copyFileCharacter("originalFile.txt", "copied2.txt");



    }

    public static void copyFileByte(String filename, String fileDest){
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream(filename);
            fout = new FileOutputStream(fileDest);

            do{
                i = fin.read();
                fout.write((i == ' ') ? '-': i );
            } while(i != -1);

        }catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }finally {
            try {
                fin.close();
                fout.close();
            } catch(IOException exc) {
                System.out.println("Error closing file.");
            }
        }




    }

    public static void copyFileCharacter(String filename, String fileDest){

        int i;


        try (   FileReader fin = new FileReader(filename);
                FileWriter fout = new FileWriter(fileDest)){

            do{
                i = fin.read();
                fout.write((i == ' ') ? '-': i );
            } while(i != -1);

        }catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

    }

}

class ThreadCom {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        MyThread mt1 = new MyThread("Tick", tt);
        MyThread mt2 = new MyThread("Tock", tt);

        try {
            mt1.thread.join();
            mt2.thread.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
class MyThread implements Runnable{
    Thread thread;
    TickTock ticktock;

    public MyThread(String name, TickTock ticktock) {
        thread = new Thread(this, name);
        this.ticktock = ticktock;
        thread.start();
    }

    @Override
    public void run() {
        if(thread.getName().compareTo("Tick") == 0) {
            for(int i=0; i<5; i++)
                ticktock.tick(true);
            ticktock.tick(false);
        }
        else {
            for(int i=0; i<5; i++)
                ticktock.tock(true);
            ticktock.tock(false);
        }
    }
}

// Make the TickTock class actually keep time.
class TickTock {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if (!running) { // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.print("Tick ");

        // wait 1/2 second
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }

        state = "ticked"; // set the current state to ticked

        notify(); // let tock() run
        try {
            while (!state.equals("tocked"))
                wait(); // wait for tock() to complete
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // stop the clock
            state = "tocked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.println("Tock");

        // wait 1/2 second
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }

        state = "tocked"; // set the current state to tocked

        notify(); // let tick() run
        try {
            while (!state.equals("ticked"))
                wait(); // wait for tick to complete
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}
