import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random someRandom = new Random();

    System.out.println("Enter your player name: ");
    String readPlayerName = scanner.nextLine();
    System.out.println("Describe your character: ");
    String readPlayerDescription = scanner.nextLine();
    System.out.println(readPlayerDescription + " is a great attribute to have!");
    System.out.println(readPlayerName + " you must defeat the BBEG! Your " + readPlayerDescription + " will be helpful.");

    for (int i = 0; i < 5; i++) {

      if (someRandom.nextBoolean()) {
        System.out.println("There is a boulder in front of you, you must be strong to pass.");
        if (Objects.equals(readPlayerDescription, "strong")) {
          System.out.println("You push the boulder aside!");
        } else {
          System.out.println("You failed to move the boulder.");
        }
      } else if (someRandom.nextBoolean()) {
        System.out.println("There is a wet log you must traverse.");
        if (Objects.equals(readPlayerDescription, "fast")) {
          System.out.println("You successfully cross the log!");
        } else {
          System.out.println("You fall into the river.");
        }
      } else {
        System.out.println("A wizard blocks your way.");
        if (Objects.equals(readPlayerDescription, "smart")) {
          System.out.println("You tactfully confuse the wizard.");
        } else {
          System.out.println("The wizard zaps you unmercifully.");
        }
      }

    }


    System.out.println(readPlayerName + " And You Dead");
  }

}



