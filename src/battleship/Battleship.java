
package battleship;
import java.util.Scanner;

public class Battleship {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    GamePlay game = new GamePlay();
// next stop, place fired shots on board
    while (GamePlay.gameOver() == false) {
      String userInput;
      game.showMap();
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
