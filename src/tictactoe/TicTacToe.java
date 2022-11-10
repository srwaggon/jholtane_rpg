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

    System.out.println("Player 1 choose a column: ");
    int playerColumn = scanner.nextInt();

    System.out.println("Player 1 choose a row: ");
    int playerRow = scanner.nextInt();


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
    }

    // print the current game state
    System.out.println(
        board00 + " " + board01 + " " + board02 + "\n" +
        board03 + " " + board04 + " " + board05 + "\n" +
        board06 + " " + board07 + " " + board08 + "\n");

  }
}


