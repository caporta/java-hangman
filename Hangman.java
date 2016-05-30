public class Hangman {
  public static void main(String[] argv) {
    Game game = new Game("octocat");
    Prompter prompter = new Prompter(game);
    prompter.play();
  }
}
