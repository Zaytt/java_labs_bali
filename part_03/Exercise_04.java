package part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */
//class
public class Exercise_04 {

    //main method
    public static void main(String[] strings) throws java.io.IOException {

        //scanner to enter a number 0-2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        //create int variable "playerHand" that takes user input
        int playerHand = input.nextInt();
        if(playerHand > 2 || playerHand < 0){
            System.out.println("That's not a valid choice!");
            return;
        }


        //create int variable "computerHand" that generates a random number 0-2
        int computerHand = (int)(3*Math.random());

        //call the getHand method for the playerHand
        System.out.println("You chose " + getHand(playerHand));

        //call the getHand method for the computerHand
        System.out.println("The computer chose " + getHand(computerHand));

        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand
        String winner = determineWinner(computerHand, playerHand);

        //print out the winner
        System.out.println(winner);

    }

    // getHand method
    public static String getHand(int hand){

        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper
        String handString;
        switch (hand){
            case 0:
                handString = "Scissors";
                break;
            case 1:
                handString = "Rock";
                break;
            case 2:
                handString = "Paper";
                break;
            default:
                handString = "Scissors";
                break;
        }

        return handString;
    }

    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int computer, int player) {

        String status;

        // determine if the game is a tie
        if(computer == player)
            return "It's a tie!";

        // if it is not a tie, use a switch statement and a turnery operator to determine the winner
        status = (computer > player) ? "You lost!" : "You won!";

        return status;

    }
}





