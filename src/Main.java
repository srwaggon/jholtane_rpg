import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void performChallenge(
      String readPlayerDescription,
      String introductionMessage,
      String desiredAttribute,
      String successMessage,
      String failureMessage
  ) {
    System.out.println(introductionMessage);
    if (Objects.equals(readPlayerDescription, desiredAttribute)) {
      System.out.println(successMessage);
    } else {
      System.out.println(failureMessage);
    }
  }

  public static void strengthTest(String readPlayerDescription) {
    String introductionMessage = "There is a boulder in front of you, you must be strong to pass.";
    String desiredAttribute = "strong";
    String successMessage = "You push the boulder aside!";
    String failureMessage = "You failed to move the boulder.";

    performChallenge(readPlayerDescription, introductionMessage, desiredAttribute, successMessage, failureMessage);
  }

  public static void speedTest(String readPlayerDescription) {
    String introductionMessage = "There is a wet log you must traverse.";
    String desiredAttribute = "fast";
    String successMessage = "You successfully cross the log!";
    String failureMessage = "You fall into the river.";

    performChallenge(readPlayerDescription, introductionMessage, desiredAttribute, successMessage, failureMessage);
  }

  public static void charmTest(String readPlayerDescription) {
    String introductionMessage = "A sexy bard is trying to swoon you.";
    String desiredAttribute = "charm";
    String successMessage = "The bard is flaccid";
    String failureMessage = "The bard sexually assaults you.";

    performChallenge(readPlayerDescription, introductionMessage, desiredAttribute, successMessage, failureMessage);
  }

  public static void witTest(String readPlayerDescription) {
    String introductionMessage = "A wizard blocks your way.";
    String desiredAttribute = "smart";
    String successMessage = "You tactfully confuse the wizard.";
    String failureMessage = "The wizard zaps you unmercifully.";

    performChallenge(readPlayerDescription, introductionMessage, desiredAttribute, successMessage, failureMessage);
  }

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

      int sideOfDie = (int) (Math.random() * 4); // gives us the number 0, 1, 2, or 3, exclusively

      // we just need to compare what was rolled on the die (0, 1, 2, etc) for each test to determine
      // if that test is the one that was picked.
      if (sideOfDie == 0) {
        strengthTest(readPlayerDescription);
      } else if (sideOfDie == 1) {
        speedTest(readPlayerDescription);
      } else if (sideOfDie == 2) {
        charmTest(readPlayerDescription);
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



