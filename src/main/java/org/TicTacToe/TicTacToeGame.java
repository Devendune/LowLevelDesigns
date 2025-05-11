package org.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Timer;

public class TicTacToeGame
{
    Deque<Player>players;
    Board gameBoard;

    public TicTacToeGame()
    {
        initializeGame();
    }

    public void initializeGame()
    {
        players=new LinkedList<>();
        Player firstPlayer=new Player("Devendu",PieceType.X);
        Player secondPlayer=new Player("Shubham",PieceType.O);

        players.add(firstPlayer);
        players.add(secondPlayer);




    }
}
