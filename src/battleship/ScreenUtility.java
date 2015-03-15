/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;


public class ScreenUtility {
    
    public static void targetPrompt() {
        System.out.print("What is your guess? ");
    }
    
    public static void failPrompt() {
        System.out.println("input was invalid");
    }
    
    public static void successPrompt() {
        System.out.println("input was valid");
    }
    
    public static void displayBoard(char[][] board) {
        for (int i=0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i=0; i < 9; i++){
            char ch = (char) (i + 97);
            System.out.print(ch);
            System.out.println(board[i]);
        }
    }
    
    public static void reportHit() {
        System.out.println("You hit their ship");
    }
    
    public static void reportMiss() {
        System.out.println("You did not land a hit");
    }
    
    public static void invalidData() {
        System.out.println("Data is out of bounds");
    }
}
