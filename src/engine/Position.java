package engine;

public class Position {
    private int row, col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int row() { return this.row; }
    public int col() { return this.col; }

    public void setRow(int newRow) { this.row = newRow; }
    public void setCol(int newCol) { this.col = newCol; }

//    public void move(Position p) { this.row = p.row(); this.col = p.col(); }
}
