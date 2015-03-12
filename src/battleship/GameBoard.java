
package battleship;

public class GameBoard {

    public char[][] map = {
        {'w','w','w','w','w','w','w','w','w'},
        {'w','w','w','w','w','w','w','w','w'},
        {'w','w','w','w','w','w','w','w','w'},
        {'w','w','w','w','w','w','w','w','w'},
        {'w','w','w','w','w','w','w','w','w'},
        {'w','w','w','w','w','w','w','w','w'},
        {'w','w','w','w','w','w','w','w','w'},
        {'w','w','w','w','w','w','w','w','w'},
        {'w','w','w','w','w','w','w','w','w'}
    };
    
    public void assignMiss(char letter, char num) {
      
              
    }

    public boolean shotHitBoat (char letter, char num) {

      if (map[3][6]=='w') {
        return false;
      } else {
        return true;
      }
    }
}
