
package battleship;


public class DataValidator {

  private static boolean validLetter(char letter) {
    return (letter >= 'a'  && letter <= 'i');
  }

  private static boolean validNum(char num) {
    return (num >= '1'  && num <= '9');
  }

  public static boolean validInput(String userInput) {

    if ( userInput.length() == 2 ) {

      char[] letters = userInput.toCharArray();
      char letter = letters[0];
      char num = letters[1];

      if (validLetter(letter) && validNum(num)) {
        return true;
      } else {
        return false;
      }
    } else {
        return false;
    }
  }
}
