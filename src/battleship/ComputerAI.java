
package battleship;

public class ComputerAI {
    GameBoard board = new GameBoard();
    
    public boolean loserOfGame() {
        return board.allShipsSank();
    }
    
    public void generatePositions() {
        //can I simplify this?
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
    
    public boolean successfulShot(int y, int x) {
        return board.confirmHit(y, x);
    }
    
}
