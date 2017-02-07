package com.dhirajsharma.connectfour;

/**
 * Created by Dhiraj Sharma on 05/10/2015.
 */
public class Cell {
  public boolean empty;
  public Board.Turn player;

  public Cell() {
    empty = true;
  }

  public void setPlayer(Board.Turn player) {
    this.player = player;
    empty = false;
  }
}
