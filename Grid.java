public class Grid {
  private char[][] _grid;
  private int w, h;

  public Grid(int w, int h) {
    this.w = w;
    this.h = h;
    _grid = new char[w][h];
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        _grid[i][j] = ' ';
      }
    }
  }

  public char get(int x, int y) {
    return _grid[x][y];
  }

  public void set(int x, int y, char token) {
    _grid[x][y] = token;
  }

  public char getNeighbors(int x, int y) {
    // TODO: Add win condition
    return ' ';
  }

  public void printBoard() {
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        System.out.print("" + '|' + _grid[i][j] + '|');
      }
      System.out.println();
    }
    System.out.println();
  }
}
