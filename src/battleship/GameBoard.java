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
    
    public void missAt(int letter, int num) {
      map[letter][num] = 'o';  
    }
    
    public void hitAt(int letter, int num) {
        map[letter][num] = '#';
    }

    public boolean confirmHit(int letter, int num) {

      if (map[letter][num]=='w'|| map[letter][num]=='o') {
        return false;
      } else {
        return true;
      }
    }
    
    public void setShipDownFrom(int y, int x) {
        for (int i=0;i<3;i++) {
        map[y + i][x] = '|';
        }
    }
    
    public void setShipRightFrom(int y, int x) {
        for (int i=0;i<3;i++) {
        map[y][x+i] = '-';
        }
    }
}
