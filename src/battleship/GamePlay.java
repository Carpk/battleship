package battleship;


public class GamePlay {
    Player player = new Player();
    ComputerAI enemy = new ComputerAI();

    public boolean gameOver() {
        if(player.loserOfGame() || enemy.loserOfGame()) {
            return true;
        } else {
            return false;
        }
    }

    public void setBoard() {
        enemy.generatePositions();
    }


    public void attemptShot(String cords) {
        char[] letters = cords.toCharArray();

        int cordY = (int) letters[0] - 97;
        int cordX = Character.getNumericValue(letters[1]) - 1;
        
        ScreenUtility.lineSpacer();
        if (enemy.confirmIncomingDamage(cordY, cordX)) {
            ScreenUtility.reportHit();
            enemy.assignHit(cordY, cordX);
        } else {
            ScreenUtility.reportMiss();
            enemy.assignMiss(cordY, cordX);
        }
    }
    
    public void enemyTakesTurn() {
    	int cordY = (int) (Math.random() * 6);
    	int cordX = (int) (Math.random() * 6);
        if (player.confirmIncomingDamage(cordY, cordX)) {
            ScreenUtility.reportEnemyHit();
            player.assignHit(cordY, cordX);
        } else {
            ScreenUtility.reportEnemyMiss();
            player.assignMiss(cordY, cordX);
        } 	
    }

    public void showMap() {
        char[][] enemyMap = enemy.showMap();
        ScreenUtility.displayBoard(enemyMap);
        char[][] map = player.showMap();
        ScreenUtility.displayBoard(map);
    }

}
