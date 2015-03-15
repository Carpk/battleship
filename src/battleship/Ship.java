
package battleship;

public class Ship {
    
    public String[] position = new String[3];
    
    public void generatePosition() {
        
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
