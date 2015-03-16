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
    
    public void assignMiss(int letter, int num) {
      map[letter][num] = 'o';  
    }
    
    public void assignHit(int letter, int num) {
        map[letter][num] = '#';
    }

    public boolean shotHitBoat (int letter, int num) {

      if (map[letter][num]=='w'|| map[letter][num]=='o') {
        return false;
      } else {
        return true;
      }
    }
    
    public void setShipDownFrom(int y, int x) {
        
    }
    
    public void setShipRightFrom(int y, int x) {
        
    }
}
