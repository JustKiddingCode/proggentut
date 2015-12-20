package tictactoe;
public class Field {
  public static final int WIDTH = 3;
  public static final int HEIGHT = 3;
  public static final int SIZE = WIDTH * HEIGHT;
  public static final int WIN_ROW_COUNT = Math.min(WIDTH, HEIGHT);
  
  private final Player[] field;
  private int round;
  private Result result;
  
  public Field() {
    field = new Player[SIZE];
  } 
  
  public boolean playersMove(int n) {
    if (n >= 0 && n < SIZE && field[n] == null) {
      field[n] = getActivePlayer();
      if (result == null && checkWinMove(n)) {
        result = new Result(round, getActivePlayer());
      }
      return true;
    } else {
      return false;
    }
  }
  private boolean checkWinMove(int n) {
    if (round > 3) {
      int x = n % WIDTH;
      int y = n / WIDTH;
      return rowCount(x, y, 0, 1) + rowCount(x, y, 0, -1) > WIN_ROW_COUNT
          || rowCount(x, y, 1, 0) + rowCount(x, y, -1, 0) > WIN_ROW_COUNT
          || rowCount(x, y, 1, 1) + rowCount(x, y, -1, -1) > WIN_ROW_COUNT
          || rowCount(x, y, 1, -1) + rowCount(x, y, -1, 1) > WIN_ROW_COUNT;
    }
    return false;
  }
  private int rowCount(int xPos, int yPos, int dx, int dy) {
    int i = 0; 
    int x = xPos;
    int y = yPos;
    while (y >= 0 && y < HEIGHT
        && x >= 0 && x < WIDTH
        && field[y * WIDTH + x] == field[yPos * WIDTH + xPos]) {
      i++;
      x += dx;
      y += dy;
    }
    return i;
  } // [...] 
