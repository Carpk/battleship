
package battleship;

public class Ship {
    
    public int damage = 0;
    public String[] position = new String[3];
    
    public void generatePosition() {
        
    }

    public boolean destroyed() {
        if (damage == 3) {
            return true;
        } else {
            return false;
        }
    }
    
    public void takeHit() {
        damage += 1;
    }
    
    public void shipSetDown(int cordY, int cordX) {
        for (int i=0; i<position.length; i++){
            position[i] = Integer.toString(cordY + i) + Integer.toString(cordX);
        }
    }
    
    public void shipSetRight(int cordY, int cordX) {
        for (int i=0; i<position.length; i++){
            position[i] = Integer.toString(cordY) + Integer.toString(cordX+i);
        }
    }
}
