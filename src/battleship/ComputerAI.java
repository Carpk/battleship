/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

public class ComputerAI {
    GameBoard board = new GameBoard();
    
    public void generatePositions() {
        //can I simplify this?
        int y = board.map.length - 3;
        int x = board.map[0].length - 3;
        int randomY = (int) (Math.random() * y);
        int randomX = (int) (Math.random() * x);
        
        if (Math.random() * 2 == 1){
            board.setShipDownFrom(randomY, randomX);
        } else {
            board.setShipRightFrom(randomY, randomX);
        }
    }
    
}
