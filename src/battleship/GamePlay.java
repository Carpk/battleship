package battleship;


public class GamePlay {
    GameBoard board = new GameBoard();
    
    public static boolean gameOver() {
        return ((Math.random() * 10) == 4);
    }
    
    
    
    public void takeShot(String cords) {
        char[] letters = cords.toCharArray();

        int cordY = (int) letters[0] - 97;
        int cordX = Character.getNumericValue(letters[1]) - 1;

        if (board.shotHitBoat(cordY, cordX)) {
            ScreenUtility.reportHit();
            board.assignHit(cordY, cordX);
        } else {
            ScreenUtility.reportMiss();
            board.assignMiss(cordY, cordX);
        }
    }
    
    public void showMap() {
        ScreenUtility.displayBoard(board.map);
    }
    
}
