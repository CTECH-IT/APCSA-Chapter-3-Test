import java.util.Scanner;  // Import the Scanner class

class Main {

  public static void main(String[] args) {
    // Do not edit the following lines. They just run the tests
    System.out.println("Welcome to the Unit 3 Test!");
    System.out.println("You have 4 coding problems to answer.");
    System.out.println("\n***************************\n*** Starting problem 1! ***\n***************************\n");
    problem1(); // 25 points
    System.out.println("\n***************************\n*** Starting problem 2! ***\n***************************\n");
    problem2(); // 25 points
    System.out.println("\n***************************\n*** Starting problem 3! ***\n***************************\n");
    problem3(); // 25 points
    System.out.println("\n***************************\n*** Starting problem 4! ***\n***************************\n");
    problem4(); // 25 points    

  }

  static public void problem1() {
    /*
    * Your task is to create a die-rolling simulator
    * Print out a random number from 1 - 6 inclusive
    */

    // End of problem 1
  }

  static public void problem2() {
    /*
     * Your assignment is to create a dice-game simulator
     * IT MUST BE ACCURATE FOR TWO SIX-SIDED DICE!!!!!
     * When you roll two dice, the probabilities are not just evenly spread out for 2-12
     * You can also think of it as rolling a single die twice
     * 
     * The user will enter an integer between 2 and 12
     * You must first compare the integer that they entered to 2 and 12 
     *    - if it's not in the correct range, print an error
     *
     * Then compare the guess to a roll of two dice 
     *    - if the guess is too high, print "too high!"
     *    - if the guess is too low, print "too low!"
     *    - if the guess is too correct, print "you guessed it!"
     *
     * (optional extra challenge) - use a "while" loop to allow the user to keep guessing until they get it
     */

    Scanner s = new Scanner(System.in);
    System.out.println("Please enter a number between 2 and 12:");
    int guess = s.nextInt();  // Read the user input into the variable "guess"

    // your code here

    // End of problem 2
  }


  static public void problem3() {
    /* 
    * Your task is to take an integer input from the user and
    * if the number is divisible by three only, print "fizz"
    * if the number is divisible by five only, print "buzz"
    * if the number is divisible by three AND five, print "fizzbuzz"
    * if the number is not divisible by three or five, don't print anything
    */

    Scanner s = new Scanner(System.in);
    System.out.println("Please enter an integer:");
    int number = s.nextInt();  // Read the user input into the variable "number"

    // your code here


    // End of problem 3
  }


  static public void problem4() {
    /*
    * Your assignment is to implement a trivia game
    * The user is given three questions
    * If they get at least two of them correct, they win!
    */


    Scanner s = new Scanner(System.in);
    System.out.println("What is the capital of Canada?");
    String guess1 = s.nextLine();  // Read the user input into the variable "guess1"
    String answer1 = "Ottawa";

    System.out.println("Canada's official languages are English and ____?");
    String guess2 = s.nextLine();  // Read the user input into the variable "guess2"
    String answer2 = "French";

    System.out.println("Who is the prime minister of Canada?");
    String guess3 = s.nextLine();  // Read the user input into the variable "guess3"
    String answer3 = "Justin Trudeau";



    s.close();

    // End of problem 4
  }
}
