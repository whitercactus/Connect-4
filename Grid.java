public class Grid {
    private char[][] _grid;

    public Grid(int w, int h) {
        _grid = new char[w][h];
    }

    public char get(int x, int y) {
        return _grid[x][y];
    }

    public void set(int x, int y, char token) {
        _grid[x][y] = token;
    }

    public char getNeighbors(int x, int y) {

        return ' ';
    }

    public void printBoard() {
        for (int i = 0; i < _grid.length; i++) {
            for (int j = _grid[i][0]; j < _grid[i][1]; j++) {

            }
        }
    }
}
