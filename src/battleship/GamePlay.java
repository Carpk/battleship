package battleship;


public class GamePlay {
    Player player = new Player();
    ComputerAI enemy = new ComputerAI();
    
    public static boolean gameOver() {
        return false;
    }
    
    public void setBoard() {
        enemy.generatePositions();
    }
    
    
    public void attemptShot(String cords) {
        char[] letters = cords.toCharArray();

        int cordY = (int) letters[0] - 97;
        int cordX = Character.getNumericValue(letters[1]) - 1;

        if (player.successfulShot(cordY, cordX)) {
            ScreenUtility.reportHit();
            player.assignHit(cordY, cordX);
        } else {
            ScreenUtility.reportMiss();
            player.assignMiss(cordY, cordX);
        }
    }
    
    public void showMap() {
        // needs a pointer char[][] map = player.showMap();
        ScreenUtility.displayBoard(player.showMap());
    }
    
}
