package engine;

import chess.ChessController;
import chess.ChessView;
import chess.PieceType;
import chess.PlayerColor;

import engine.Case;

public class ChessGame implements ChessController {

  private ChessView view;

  private Case[] board;

  public ChessGame() {
    board = new Case[]{
      // White pawns
      new Case(new Position(0, 0), new Rook(PlayerColor.WHITE)),
      new Case(new Position(0, 1), new Knight(PlayerColor.WHITE)),
      new Case(new Position(0, 2), new Bishop(PlayerColor.WHITE)),
      new Case(new Position(0, 3), new Queen(PlayerColor.WHITE)),
      new Case(new Position(0, 4), new King(PlayerColor.WHITE)),
      new Case(new Position(0, 5), new Bishop(PlayerColor.WHITE)),
      new Case(new Position(0, 6), new Knight(PlayerColor.WHITE)),
      new Case(new Position(0, 7), new Rook(PlayerColor.WHITE)),
      new Case(new Position(1, 0), new Pawn(PlayerColor.WHITE)),
      new Case(new Position(1, 1), new Pawn(PlayerColor.WHITE)),
      new Case(new Position(1, 2), new Pawn(PlayerColor.WHITE)),
      new Case(new Position(1, 3), new Pawn(PlayerColor.WHITE)),
      new Case(new Position(1, 4), new Pawn(PlayerColor.WHITE)),
      new Case(new Position(1, 5), new Pawn(PlayerColor.WHITE)),
      new Case(new Position(1, 6), new Pawn(PlayerColor.WHITE)),
      new Case(new Position(1, 7), new Pawn(PlayerColor.WHITE)),

      // Empty Cases
      new Case(new Position(0, 2)),
      new Case(new Position(1, 2)),
      new Case(new Position(2, 2)),
      new Case(new Position(3, 2)),
      new Case(new Position(4, 2)),
      new Case(new Position(5, 2)),
      new Case(new Position(6, 2)),
      new Case(new Position(7, 2)),
      new Case(new Position(0, 3)),
      new Case(new Position(1, 3)),
      new Case(new Position(2, 3)),
      new Case(new Position(3, 3)),
      new Case(new Position(4, 3)),
      new Case(new Position(5, 3)),
      new Case(new Position(6, 3)),
      new Case(new Position(7, 3)),
      new Case(new Position(0, 4)),
      new Case(new Position(1, 4)),
      new Case(new Position(2, 4)),
      new Case(new Position(3, 4)),
      new Case(new Position(4, 4)),
      new Case(new Position(5, 4)),
      new Case(new Position(6, 4)),
      new Case(new Position(7, 4)),
      new Case(new Position(0, 5)),
      new Case(new Position(1, 5)),
      new Case(new Position(2, 5)),
      new Case(new Position(3, 5)),
      new Case(new Position(4, 5)),
      new Case(new Position(5, 5)),
      new Case(new Position(6, 5)),
      new Case(new Position(7, 5)),

      // Black pawns
      new Case(new Position(6, 0), new Pawn(PlayerColor.BLACK)),
      new Case(new Position(6, 1), new Pawn(PlayerColor.BLACK)),
      new Case(new Position(6, 2), new Pawn(PlayerColor.BLACK)),
      new Case(new Position(6, 3), new Pawn(PlayerColor.BLACK)),
      new Case(new Position(6, 4), new Pawn(PlayerColor.BLACK)),
      new Case(new Position(6, 5), new Pawn(PlayerColor.BLACK)),
      new Case(new Position(6, 6), new Pawn(PlayerColor.BLACK)),
      new Case(new Position(6, 7), new Pawn(PlayerColor.BLACK)),
      new Case(new Position(7, 0), new Rook(PlayerColor.BLACK)),
      new Case(new Position(7, 1), new Knight(PlayerColor.BLACK)),
      new Case(new Position(7, 2), new Bishop(PlayerColor.BLACK)),
      new Case(new Position(7, 3), new Queen(PlayerColor.BLACK)),
      new Case(new Position(7, 4), new King(PlayerColor.BLACK)),
      new Case(new Position(7, 5), new Bishop(PlayerColor.BLACK)),
      new Case(new Position(7, 6), new Knight(PlayerColor.BLACK)),
      new Case(new Position(7, 7), new Rook(PlayerColor.BLACK))
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
    System.out.println("Hi, I'm at index " + (toX * 8 + toY));
    return false; // TODO
  }

  @Override
  public void newGame() {
    view.displayMessage("new game (TO REMOVE)"); // TODO
    view.putPiece(PieceType.KING, PlayerColor.BLACK, 3, 4); // TODO exemple uniquement
  }
}
