
package battleship;
import java.util.Scanner;

public class Battleship {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    while (GamePlay.gameOver() == false) {
      String userInput;
      ScreenUtility.targetPrompt();
      userInput = input.next();

      if (DataValidator.validInput(userInput)) {
        ScreenUtility.successPrompt();
      } else {
        ScreenUtility.failPrompt();
      }
    }
  }

}
