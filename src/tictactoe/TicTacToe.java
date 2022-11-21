package tictactoe;

// example gamestates

// [ ][ ][ ]
// [ ][ ][ ]
// [ ][ ][ ]

// [x][o][x]
// [o][x][x]
// [o][o][x]

import java.util.Scanner;

public class TicTacToe {

  private static String potentialPlayerOneMoves(
      String playerOne, int playerRow, int playerColumn,
      String board00, String board01, String board02,
      String board03, String board04, String board05,
      String board06, String board07, String board08
  ) {
    if (playerRow == 0 && playerColumn == 0) {
      board00 = playerOne;
    } else if (playerRow == 0 && playerColumn == 1) {
      board01 = playerOne;
    } else if (playerRow == 0 && playerColumn == 2) {
      board02 = playerOne;
    } else if (playerRow == 1 && playerColumn == 0) {
      board03 = playerOne;
    } else if (playerRow == 1 && playerColumn == 1) {
      board04 = playerOne;
    } else if (playerRow == 1 && playerColumn == 2) {
      board05 = playerOne;
    } else if (playerRow == 2 && playerColumn == 0) {
      board06 = playerOne;
    } else if (playerRow == 2 && playerColumn == 1) {
      board07 = playerOne;
    } else if (playerRow == 2 && playerColumn == 2) {
      board08 = playerOne;
    } else {
      System.out.println("That is not a valid move");
    }
    return "";
  }

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    String playerOne = "X";
    String playerTwo = "O";

    // the board is nine variables, one for each place a symbol could go
    // the board starts blank
    String board00 = "_";
    String board01 = "_";
    String board02 = "_";
    String board03 = "_";
    String board04 = "_";
    String board05 = "_";
    String board06 = "_";
    String board07 = "_";
    String board08 = "_";


    // print the current game state
    System.out.println(
        board00 + " " + board01 + " " + board02 + "\n" +
            board03 + " " + board04 + " " + board05 + "\n" +
            board06 + " " + board07 + " " + board08 + "\n");

    // game logic
    System.out.println("Player 1 choose a row: ");
    int playerRow = scanner.nextInt();

    System.out.println("Player 1 choose a column: ");
    int playerColumn = scanner.nextInt();


    //  [(0,0)] [(1,0)] [(2,0)] // is in the same row, has a constant y, has a variable column, has a variable x, // row, y = 0
    //  [(0,1)] [(1,1)] [(2,1)] // row, y = 1
    //  [(0,2)] [(1,2)] [(2,2)] // row, y = 2
    //  [(0,3)] [(1,3)] [(2,3)] // row, y = 3
    //    ^        ^       ^
    //    |        |       |
    //    |        |      col, where x = 2
    //    |       col, where x = 1
    //   col, x = 0

    // (x, y)
    // (col, row)

    // when x == 0, it is the first column
    // when x == 1, it is the second column

    // when y = 0, it is the first row
    // when y = 1, it is the second row

    //  -== GOAL ==-
    // when a player plays a move, the gameboard is updated correctly
    // update the first row correctly  - [(0,0), (1,0), (2,0)]
    //   only three positions the player can play -- add (2,0)
    //      only the first two positions in the first row
    //    restrict player1 input to
    //      (0,0), (1,0)
    //    and update the board correctly for either choice.


    // if playerCol == (0,_) then update the gameboard at [the right spot -- board00]
    if (playerRow == 0 && playerColumn == 0) {
      board00 = playerOne;
    } else if (playerRow == 0 && playerColumn == 1) {
      board01 = playerOne;
    } else if (playerRow == 0 && playerColumn == 2) {
      board02 = playerOne;
    } else if (playerRow == 1 && playerColumn == 0) {
      board03 = playerOne;
    } else if (playerRow == 1 && playerColumn == 1) {
      board04 = playerOne;
    } else if (playerRow == 1 && playerColumn == 2) {
      board05 = playerOne;
    } else if (playerRow == 2 && playerColumn == 0) {
      board06 = playerOne;
    } else if (playerRow == 2 && playerColumn == 1) {
      board07 = playerOne;
    } else if (playerRow == 2 && playerColumn == 2) {
      board08 = playerOne;
    } else {
      System.out.println("That is not a valid move");
    }


    // print the current game state
    System.out.println(
        board00 + " " + board01 + " " + board02 + "\n" +
            board03 + " " + board04 + " " + board05 + "\n" +
            board06 + " " + board07 + " " + board08 + "\n");

  }


}

/*
 // When Sam is writing a function
 1. identify the unit of behaviour that I want to be repeatedly callable
 2. Give a name to that concept, or idea, or behaviour.
 3. Identify inputs and outputs
 4. side effects
    a. such as printing to the console
    b. or modifying data that isn't an input
 5. use the above identified things to write the method signature
    a. method name -- potentialPlayerOneMoves
    b. type of return value -- String (player's value, X, or O)
    c. parameters and their types
        int row
        int column
        String board00
        String board01
        String board02
        String board03
        String board04
        String board05
        String board06
        String board07
        String board08
    d. is it static or not? Yes, it's static because it's within this class
         By default, every method is static unless otherwise necessary
            // When might a method not be static?
            // Jared: "static means constant, always be X
            //   in this case (the case of authoring this method),
            //     we want this to be consistent, we're not asking for it to change"
            // Sam: "What's the opposite of static? non-static. Dynamic is not a concept and does not exist.
            //   When might something be static?
            //     To be static means that the static thing is shared by all instances of the class (even no instance).
            //   When might something not be static?"
    e. is it public or not?
       // public means this can be invoked from outside of this class
       // it's not important in this case as we won't invoke this function from the other project files
       // start as private by default
    f. where do I write this method, and start writing its method signature?
       // A method must be within the java file
       // it must also be within a class in that java file
       // it must also be outside of any other methods (it's a sibling, not a child).
       // This includes the main method.
       // method order does not matter.


  // potentialPlayerOneMoves
  //   inputs: row, column, board -- these become the method parameters
  //   outputs: where those inputs go into the board
  //    the board is updated
  //  side effects:
  //    multiple choices for the same point on the board

 */
