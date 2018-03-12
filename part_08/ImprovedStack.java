package part_08;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ImprovedStack <E> {

    private int index;
    private E array[];

    public ImprovedStack(E array[]) {
        this.index = 0;
        this.array = array;
    }

    public E pop(){
        if(this.isEmpty())
            throw new part_08.EmptyStackException();

        return this.array[--index];
    }

    public void push(E e){
        if(this.isFull())
            throw new FullStackException();
        this.array[index++] = e;
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

    public boolean isFull(){
        if(this.index == this.length()-1)
            return true;
        else
            return false;
    }
/*
    public void resizeArray(E array[]){
        if(index == array.length-2){
            E newArray[] = new E[array.length*2];
            int i = 0;
            for(E x: array) {
                newArray[i] = x;
                i++;
            }
            this.array = newArray;
        }
    }
*/
}
