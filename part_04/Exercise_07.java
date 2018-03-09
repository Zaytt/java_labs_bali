package part_04;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

public class Exercise_07{

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        for(char i = 'A'; i <= 'Z'; i++) stack.push(i);
        try{
            while(!stack.isEmpty())
                System.out.println("Pop: " + stack.pop());


        } catch (EmptyStackException e){
            System.out.println("Exception: Stack is empty.");
        }
    }

}

class Stack{
    private char[] array;
    private int index;

    public Stack(int size) {
        this.index = 0;
        this.array = new char[size];
    }

    public char pop(){
        try{
            return this.array[--index];
        } catch (ArrayIndexOutOfBoundsException e){
            throw new EmptyStackException();
        }

    }

    public void push(char c){
        if(index == array.length-2){
            char[] newArray = new char[array.length*2];
            int i = 0;
            for(char x: array) {
                newArray[i] = x;
                i++;
            }
            this.array = newArray;
        }

        this.array[index++] = c;
    }


    public int length(){
        return this.array.length;
    }

    public boolean isEmpty(){
        if(this.index == 0)
            return true;
        else
            return false;
    }
}
