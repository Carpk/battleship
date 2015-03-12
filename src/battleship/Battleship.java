
package battleship;
import java.util.Scanner;

public class Battleship {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    GamePlay game = new GamePlay();

    while (GamePlay.gameOver() == false) {
      String userInput;
      game.showMap();
      ScreenUtility.targetPrompt();
      userInput = input.next();

      game.takeShot(userInput);
    }
  }

}
