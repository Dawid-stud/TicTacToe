package com.company.player;

import com.company.gameElement.Board;

import java.util.Scanner;

public class HumanPlayer extends Player {
    Scanner scan = new Scanner(System.in);

    @Override
    public int makeMove(Board board) {
        return scan.nextInt();
    }
}
