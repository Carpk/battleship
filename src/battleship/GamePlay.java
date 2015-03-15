package battleship;


public class GamePlay {
    GameBoard playerBoard = new GameBoard();
    GameBoard enemyBoard = new GameBoard();
    
    public static boolean gameOver() {
        return false;
    }
    
    public void setBoard() {
        enemyBoard.generatePosition();
    }
    
    
    public void attemptShot(String cords) {
        char[] letters = cords.toCharArray();

        int cordY = (int) letters[0] - 97;
        int cordX = Character.getNumericValue(letters[1]) - 1;

        if (playerBoard.shotHitBoat(cordY, cordX)) {
            ScreenUtility.reportHit();
            playerBoard.assignHit(cordY, cordX);
        } else {
            ScreenUtility.reportMiss();
            playerBoard.assignMiss(cordY, cordX);
        }
    }
    
    public void showMap() {
        ScreenUtility.displayBoard(playerBoard.map);
    }
    
}
