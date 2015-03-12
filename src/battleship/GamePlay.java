/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;


public class GamePlay {
    GameBoard board = new GameBoard();
    
    public static boolean gameOver() {
        return ((Math.random() * 10) == 4);
    }
    
    
    
    public void takeShot(String cords) {
        char[] letters = cords.toCharArray();
        char letter = letters[0];
        char num = letters[1];
        if (board.shotHitBoat(letter, num)) {
            
        } else {
            board.assignMiss(letter, num);
        }
    }
    
    public void showMap() {
        ScreenUtility.displayBoard(board.map);
    }
    
}
