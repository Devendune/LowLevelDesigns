package org.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Timer;

public class TicTacToeGame
{
    Deque<Player>deque;
    Board gameBoard;



    public void initializeGame()
    {
        Player player1=new Player("Devendu",new PlayerX());
        Player player2=new Player("Tushar",new PlayerO());

        gameBoard=new Board(3);

    }


}
