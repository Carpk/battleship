
package battleship;
import java.util.Scanner;

public class Battleship {



  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    while (GamePlay.gameOver() == false) {
      String userInput;
      System.out.print("What is your guess? ");
      userInput = input.next();

      if (DataValidator.validInput(userInput)) {
        System.out.println("input was valid");
      } else {
        System.out.println("input was invalid");
      }
    }
  }

}
