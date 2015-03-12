package battleship;


public class GamePlay {
    GameBoard board = new GameBoard();
    
    public static boolean gameOver() {
        return ((Math.random() * 10) == 4);
    }
    
    
    
    public void takeShot(String cords) {
        char[] letters = cords.toCharArray();
        
        int letter = (int) letters[0] - 97;
        int num = Character.getNumericValue(letters[1]) - 1;
        System.out.println(letter);
        if (board.shotHitBoat(letter, num)) {
            board.assignHit(letter, num);
        } else {
            board.assignMiss(letter, num);
        }
    }
    
    public void showMap() {
        ScreenUtility.displayBoard(board.map);
    }
    
}
