/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

public class Player {
    GameBoard board = new GameBoard();
    
    public boolean loserOfGame() {
        return board.allShipsSank();
    }
    
    public char[][] showMap() {
       return board.map;
    }
    
    public boolean successfulShot(int y, int x) {
        return board.confirmHit(y, x);
    }
    
    public void assignMiss(int y, int x) {
        board.assignMissAt(y, x);
    }
    
    public void assignHit(int y, int x) {
        board.hitAt(y, x);
    }

	public boolean confirmIncomingDamage(int cordY, int cordX) {
		// TODO Auto-generated method stub
		return false;
	}
    
}
