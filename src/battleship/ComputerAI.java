
package battleship;

public class ComputerAI {
    GameBoard board = new GameBoard();
    
    public boolean loserOfGame() {
        return board.allShipsSank();
    }
    
    public char[][] showMap() {
        return board.map;
     }
    
    public void generatePositions() {
        int y = board.map.length - 3;
        int x = board.map[0].length - 3;
        int randomY = 3; //(int) (Math.random() * y);
        int randomX = 3; //(int) (Math.random() * x);
        
        if (Math.random() * 2 == 1){
            board.setShipDownFrom(randomY, randomX);
        } else {
            board.setShipRightFrom(randomY, randomX);
        }
    }
    
    public boolean confirmIncomingDamage(int y, int x) {
        return board.confirmHit(y, x);
    }
    
    public void assignMiss(int y, int x) {
        board.assignMissAt(y, x);
    }
    
    public void assignHit(int y, int x) {
        board.hitAt(y, x);
    }
}
