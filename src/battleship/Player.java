/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

public class Player {
    GameBoard board = new GameBoard();
    
    public char[][] showMap() {
       return board.map;
    }
    
    public boolean successfulShot(int y, int x) {
        return board.shotHitBoat(y, x);
    }
    
    public void assignMiss(int y, int x) {
        
    }
    
    public void assignHit(int y, int x) {
        
    }
    
}
