package tictactoe;

public enum Player {
  
  Player1(0, 'x'), Player2(1, 'o');
  
  private final int number;
  private final char symbol;
  
  private Player(int number, char symbol) {
    this.number = number;
    this.symbol = symbol;
  }
  
  public int getNumber() {
    return number;
  }
  
  public String toString() {
    return String.valueOf(symbol);
  }
  
  public static String toString(Player player) {
    if (player != null) {
      return player.toString();
    } else {
      return " ";
    }
  }

}
