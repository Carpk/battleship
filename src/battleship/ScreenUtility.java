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
}
