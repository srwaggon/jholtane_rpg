import java.util.Scanner;

public class LoopPlayground {

  public static void loopExample1() {
    // the following loops are identical
    int x = 0;
    while(x < 3) {
      System.out.println("while loop iteration");
      x++;
    }

    // no loop setup here
    for (int i = 0; i < 3; i++) {
      System.out.println("for loop iteration");
      // no loop iteration variable manipulation here
    }
  }

  public static void loopExample2_infinite_looping() {
    // the following loops are identical.

    // example: I have game that I want to run until the user quits
    while(true) {
      String userInput = "";
      if (userInput.equals("QUIT")) {
        break;
      }
    }

    // this loop is identical to the above loop
    for(; true;) {
      String userInput = "";
      if (userInput.equals("QUIT")) {
        break;
      }
    }

    // what's with the for loop's definition?
    // for(; true;) { ...

    // a for loop's definition is composed of these parameters
    /*

    for (<variable init>; <loop condition>; <iteration actions>) {
      <loop body>
    }

    */

    // meanwhile a while loop looks like this:

    /*

    <variable init>
    while (<loop condition>) {
      <loop body>
      <iteration actions>
    }

     */

  }
}
