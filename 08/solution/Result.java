package tictactoe;

public class Result {
  
  private final int round;
  private final Player player;
  
  public Result(int round, Player player) {
    this.round = round;
    this.player = player;
  }
  
  public String toString() {
    return "P" + (player.getNumber() + 1) + " wins " + (round + 1);
  }
  
  public static String toString(Result result) {
    if (result != null) {
      return result.toString();
    } else {
      return "draw";
    }
  }

}
