# Snake-and-Ladder-Game-Design
<b><i>Low level Design for Snake and Ladder game</i></b>

![Game](https://github.com/19PA1A0569/pictures/blob/main/snakes-and-ladders.jpg)


# Design of Snake and Ladder game

  * Create a Snake and Ladder application.
  
  * The application should take input n from the user.
  
  * The game should have a board size of n x n.
 
  * There should be n snakes and l ladders placed randomly in the board.
   
  * Each snake will have its head at some number and its tail at a smaller number than its head position.
  
  * Each ladder will have its start position at some number and end position at a larger number than its start position.
  
  * There can be multiple players in the game.

# Rules of the game


 * The board has numbers from 1 to n^2.
 
 * The players will make there move turn-by-turn.
 
 * The game will have a six sided dice numbered from 1 to 6 and will always give a random number on rolling it.
 
 * Each player has a piece which is initially kept outside the board (i.e., at position 0).
 
 * Each player rolls the dice when their turn comes.
 
 * Based on the dice value, the player moves their piece forward that number of cells. Ex: If the dice value is 4 and the player is at position 7, the player will move to position 11 (7+4).
 
 * A player wins if he reached the last cell in the board.
 
 * Whenever a player ends up at a cell with the head of the snake, the player should go down to the cell that has the tail of that snake.
 
 * Whenever a player ends up at a cell with the start of the ladder, the player should go up to the cell that has the end of that ladder.
 
 * The game should continue till there are at least 2 players still playing to win.
 
 * After the dice roll, if a piece is supposed to move outside position 100, it does not move.

 * Snakes and Ladders do not create a cycle.
