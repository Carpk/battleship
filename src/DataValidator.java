public class DataValidator {

  private boolean validLetter(char letter) {

  }

  private boolean validNum(char letter) {

  }

  public boolean validInput(String userInput) {

    if ( userInput.length == 2 ) {

      char[] letters = userInput.toCharArray();
      char letter = letters[0];
      char num = letters[1];

      if (validLetter(letter) && validNum(num)) {
        return true
      }

    } else {

      return false
    }
  }
}