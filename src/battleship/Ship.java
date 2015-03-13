
package battleship;

public class Ship {
    
    public int[][] position = new int[3][2];
    
    public void shipSetDown(int cordY, int cordX) {
        position[0][0] = cordY;
        position[0][1] = cordX;
        position[1][0] = cordY+1;
        position[1][1] = cordX;
        position[2][0] = cordY+2;
        position[2][1] = cordX;
    }
    
    public void shipSetRight(int cordY, int cordX) {
        position[0][0] = cordY;
        position[0][1] = cordX;
        position[1][0] = cordY;
        position[1][1] = cordX+1;
        position[2][0] = cordY;
        position[2][1] = cordX+2;
    }
}
