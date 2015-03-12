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

      if (map[letter][num]=='w') {
        return false;
      } else {
        return true;
      }
    }
}
