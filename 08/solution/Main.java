package tictactoe;

public final class Main {
  
  private Main() {
    
  }

  public static void main(String[] args) {
    Field field = new Field();
    for (int i = 0; i < 9; i++) {
      field.playersMove(Integer.parseInt(args[i]));
      field.nextPlayer();
    }
    System.out.println(field);
  }

}
