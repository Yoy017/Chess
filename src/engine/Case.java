package engine;

import chess.PlayerColor;

public class Case {
    private Position position;
    private Piece piece;

    public Case(Position pos, Piece p) {
        this.position = pos;
        this.piece = p;
    }
}
