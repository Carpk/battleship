
package battleship;
import java.util.Scanner;

public class Battleship {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    GamePlay game = new GamePlay();

    game.setBoard();
    while (game.gameOver() == false) {
      String userInput;
      game.showMap();
      ScreenUtility.targetPrompt();
      userInput = input.next();

      if (DataValidator.validInput(userInput)) {
        game.attemptShot(userInput);
      } else {
          ScreenUtility.invalidData();
      }
    }
  }

}
