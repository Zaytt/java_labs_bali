package part_08;


import java.util.Stack;

public class Exercise2_Controller {
    public static void main(String[] args) {
        Character array[] = new Character[25];

        ImprovedStack<Character> stack = new ImprovedStack<>(array);

        //PUSH ELEMENTS INTO THE STACK. THE STACK WILL BE 2 ELEMENTS SHORT
        for(char i = 'A'; i <= 'Z'; i++) {
            try {
                stack.push(i);
            } catch (FullStackException e) {
                //e.printStackTrace();
                System.out.println("Stack full");
            }
        }


        //POP AND KEEP POPPING UNTIL THE STACK IS EMPTY
        while(!stack.isEmpty()){
            try {
                System.out.println("Pop: " + stack.pop());
            } catch (EmptyStackException e) {
                //e.printStackTrace();
                System.out.println("Stack empty");
            }
        }

        //TRY TO POP AN EXTRA ELEMENT FROM THE EMPTY STACK
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            //e.printStackTrace();
            System.out.println("Stack empty");
        }


    }
}
