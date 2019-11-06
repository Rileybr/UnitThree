/*
By Brandon Riley
11/1/19
simulates a game of rock paper scissors
 */

import java.util.Scanner;

public class RockPaperScissors {
    public static String getUserChoice(){
        // gets user's choice
        System.out.println("Please choose either rock, paper, or scissors.");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        return user.toLowerCase();
    }
    public static String getComputerChoice(){
        // randomly calculates computer's choice
        int temp = (int)(Math.random()*3) + 1;
        String computer = "";
        if (temp == 1){
            computer = "rock";
        }
        else if (temp == 2){
            computer = "paper";
        }
        else if (temp == 3){
            computer = "scissors";
        }
        return computer;
    }
    public static String whoWins(String computer, String user){
        // compares two values and determines winner
        String winner = "";
        String computer_wins = "The computer wins!";
        String user_wins = "You win!";
        if (user.equals(computer)){
            winner = "You tied!";
        }
         else if (user.equals("rock") && computer.equals("scissors")){
            winner = user_wins;
        }
        else if (user.equals("paper") && computer.equals("rock")){
            winner = user_wins;
        }
        else if (user.equals("scissors") && computer.equals("paper")){
            winner = user_wins;
        }
        else if (user.equals("paper") && computer.equals("scissors")){
            winner = computer_wins;
        }
        else if (user.equals("scissors") && computer.equals("rock")){
            winner = computer_wins;
        }
        else if (user.equals("rock") && computer.equals("paper")){
            winner = computer_wins;
        }
        return "You chose " + user + ".\n" + "The computer chose " + computer + ".\n" + winner;

    }
    public static void main(String[] args){
        String user = getUserChoice();
        String computer = getComputerChoice();
        System.out.println(whoWins(computer, user));
    }
}
