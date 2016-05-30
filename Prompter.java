import java.io.Console;

public class Prompter {
  private Game mGame;

  public Prompter(Game game) {
    mGame = game;
  }

  public void play() {
    while (mGame.getRemainingTries() > 0) {
      displayProgress();
      promptForGuess();
    }
  }

  public boolean promptForGuess() {
    Console console = System.console();
    boolean isHit = false;
    boolean isValidGuess = false;
    while (!isValidGuess) {
      String guessStr = console.readLine("Enter a letter:  ");
      char guess = guessStr.charAt(0);
      try {
        isHit = mGame.applyGuess(guess);
        isValidGuess = true;
      } catch (IllegalArgumentException iae) {
        console.printf("%s. Please try again.\n", iae.getMessage());
      }
    }
    return isHit;
  }

  public void displayProgress() {
    System.out.printf("You have %d tries to solve:  %s\n",
                       mGame.getRemainingTries(),
                       mGame.getCurrentProgress());
  }
}
