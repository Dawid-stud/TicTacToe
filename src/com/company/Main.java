package com.company;

import com.company.gameElement.OPiece;
import com.company.gameElement.XPiece;
import com.company.player.AIPlayer;
import com.company.player.HumanPlayer;
import com.company.player.Player;


public class Main {
    final static String NEW_GAME_WITH_HUMAN = "Graj z człowiekiem";
    final static String NEW_GAME_WITH_AI = "Graj z AI";

    public static void main(String[] args) {
        Menu menu = new Menu(
                NEW_GAME_WITH_AI,
                NEW_GAME_WITH_HUMAN
        );

        Player playerOne = new AIPlayer();
        Player playerTwo = new AIPlayer();

        switch (menu.printMenuAndGetChoice()) {
            case NEW_GAME_WITH_AI:
                playerOne = new HumanPlayer();
                playerOne.setPiece(new XPiece());

                playerTwo.setPiece(new OPiece());

                break;
            case NEW_GAME_WITH_HUMAN:
                System.out.println("Nowa gra z człowiekiem");
                playerOne = new HumanPlayer();
                playerOne.setPiece(new XPiece());

                playerTwo = new HumanPlayer();
                playerTwo.setPiece(new OPiece());

                break;
            default:
                System.out.println("Coś poszło nie tak");
        }

        TicTacToeEngine game = new TicTacToeEngine(playerOne, playerTwo);
        game.run();
    }
}
