public class Player {
  
  private int score;
  /* the circle things in the board idk */ 
  private char unit;
  
  public Player(char unit) {
    this.unit = unit;
  }

  public int getScore() {
    return score;
  }

  public char getUnit() {
    return unit;
  }
}