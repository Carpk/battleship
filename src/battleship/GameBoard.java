package battleship;

public class GameBoard {
    Ship boat = new Ship();

    public char[][] map = {
        {'~','~','~','~','~','~','~','~','~'},
        {'~','~','~','~','~','~','~','~','~'},
        {'~','~','~','~','~','~','~','~','~'},
        {'~','~','~','~','~','~','~','~','~'},
        {'~','~','~','~','~','~','~','~','~'},
        {'~','~','~','~','~','~','~','~','~'},
        {'~','~','~','~','~','~','~','~','~'},
        {'~','~','~','~','~','~','~','~','~'},
        {'~','~','~','~','~','~','~','~','~'}
    };
    
    public boolean allShipsSank() {
        if (boat.destroyed()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void assignMissAt(int letter, int num) {
      map[letter][num] = 'o';  
    }
    
    public void hitAt(int letter, int num) {
        boat.takeHit();
        map[letter][num] = 'x';
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
