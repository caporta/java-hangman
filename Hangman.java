public class Hangman {
  public static void main(String[] argv) {
    Game game = new Game("Hodor");
    Prompter prompter = new Prompter(game);
    prompter.play();
  }
}
