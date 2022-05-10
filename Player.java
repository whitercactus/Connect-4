public interface Player{
  public String getName();
  public double getCash();
  public double win(double cashWinnings, int score);
  public int getWinCount();
  public Ledger trackWinnings(String ledgerName);
}