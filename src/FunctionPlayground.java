import java.sql.SQLOutput;
import java.util.Scanner;

public class FunctionPlayground {

  // f(x) => y;
  // functions have inputs and outputs
  // inputs can be something or nothing
  // outputs can be something or nothing
  public static void main(String[] args) {
    addOne(1040); // evaluates to 1041

    int result = addOne(2048); // evaluates to 2049
    result = addOne(addOne(addOne(3))); // 6

    // use multTen
    int remult = multTen(50);
    System.out.println("The remult was " + remult);


    // 1) I can create variables any time.
    // variables can hold things.
    String foo = "some string value";
    String bar = "another string value ??? ";

    // 2) functions return things of their return type

    // you don't have to use the output (return value) from the function
    // but if you don't, it goes to waste
    personWithAge("some name, doesn't matter", 56789);

    // alternatively, you can use the output from the function
    // here, we store it into a variable.
    String capturedResult = personWithAge("some input name", 58397);


//    String nameWithAge = "some string"; // just a variable
    String nameWithAge = personWithAge("Sam", 34);
    System.out.println(nameWithAge);                            // "Sam34"
    System.out.println(personWithAge("Jared", 33)); // "Jared33"
    System.out.println(personWithAge("Lydia", 29));
  }

  // 0) write a function that takes a number and returns the result of adding 1 to it.
  static int addOne(int someNumber) {
    return someNumber + 1;
  }


  // write a function that multiplies by 10;
  static int multTen(int multiply) {
    return multiply * 10;
  }

  // write a function that takes a person's name and their age
  // and concatenates them
  static String personWithAge(String name, int age) {
    return name + age;
  }



  //  public static void smallestOfThreeRunner() {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Input the first number: ");
//    int firstParameter = scanner.nextInt();
//
//    System.out.print("Input the second number: ");
//    int secondParameter = scanner.nextInt();
//
//    System.out.print("Input the third number: ");
//    int thirdParameter = scanner.nextInt();
//
//    int result = smallestOfThree(firstParameter, secondParameter, thirdParameter);
//
//    System.out.println("The Smallest of the three was " + result);
//  }

  // problem 1: smallest number among three numbers
}
