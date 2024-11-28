package engine;

import chess.ChessController;
import chess.ChessView;
import chess.PieceType;
import chess.PlayerColor;

public class ChessGame implements ChessController {

  private ChessView view;

  private Piece[] pieces;

  public ChessGame() {
    pieces = new Piece[]{
            new Bishop(), new Bishop(),
            new King(), new Queen(),
            new Knight(), new Knight(),
            new Rook(), new Rook(),
            new Pawn(), new Pawn(), new Pawn(), new Pawn(),
            new Pawn(), new Pawn(), new Pawn(), new Pawn(),
    };
  }

  @Override
  public void start(ChessView view) {
    this.view = view;
    view.startView();
  }

  @Override
  public boolean move(int fromX, int fromY, int toX, int toY) {
    System.out.println(String.format("TO REMOVE : from (%d, %d) to (%d, %d)", fromX, fromY, toX, toY)); // TODO remove
    return false; // TODO
  }

  @Override
  public void newGame() {
    view.displayMessage("new game (TO REMOVE)"); // TODO
    view.putPiece(PieceType.KING, PlayerColor.BLACK, 3, 4); // TODO exemple uniquement
  }
}
