package com.company.player;

import com.company.gameElement.Board;
import com.company.gameElement.Piece;


public abstract class Player {
    private Piece piece;

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public abstract int makeMove(Board board);
}
