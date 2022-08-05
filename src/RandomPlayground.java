import java.util.Random;

public class RandomPlayground {

  public static void main(String[] args) {
    // if simulating a coinflip, 50/50 %
    Math.random(); // returns [0.0 - 1.0)
    // first half [0 - .5)
    // second half [.5 - 1.0)

    // 0.0 [------------------------------------------------] 1.0
    int numberOfShards = 4;
    double shard = 1.0 / numberOfShards;
    double value = Math.random();
    if (value < shard) { // [0 - .25)
      // case 1
    } else if (value < shard * 2) { // [.25 - .5)
      // case 2
    } else if (value < shard * 3) { // [.5 - .75)
      // case 3
    } else { // [.75 and up)
      // case 4
    }
    // [0.0 - 1.0) / 3
    // [0 - .33): case 1
    // [.33 - .66): case 2
    // [.66 - .99): case 3

    Random someRandom = new Random();
    someRandom.nextBoolean(); // returns true or false, effectively a coin flip

    if (someRandom.nextBoolean()) {
      if ("attribute".equals("fast")) {
        System.out.println("it happened");
      }
    }

  }
}
