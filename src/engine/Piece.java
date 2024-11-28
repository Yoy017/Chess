package engine;

import chess.PlayerColor;

/*
...
 */
public class Piece {
    PlayerColor color;

    public Piece(PlayerColor color) {
        this.color = color;
    }
}

class Bishop extends Piece {

}

class Knight extends Piece {

}

class Queen extends Piece {

}

/*
...
 */
class MovableOncePiece extends Piece {

}

class Pawn extends MovableOncePiece {

}

class King extends MovableOncePiece {

}

class Rook extends MovableOncePiece {

}