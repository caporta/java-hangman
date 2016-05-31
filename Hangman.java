public class Hangman {
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Please enter a word");
      System.exit(0);
    }
    Game game = new Game(argv[0]);
    Prompter prompter = new Prompter(game);
    prompter.play();
  }
}
