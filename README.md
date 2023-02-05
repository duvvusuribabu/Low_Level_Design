# Low_Level_Design

By using SOLID principles we can design low level programs.Snake and is also one of the low level design.

# snake-and-ladder-using-java

PROBLEM STATEMENT:
1)Desiging of a snake and ladder application. The application should take as input from the command line.
2)Number of snakes (s) followed by s lines each containing 2 numbers denoting the head and tail positions of the snake.
3)Number of ladders (l) followed by l lines each containing 2 numbers denoting the start and end positions of the ladder.
4)Number of players (p) followed by p lines each containing a name.
5)After taking these inputs, you should print all the moves in the form of the current player name followed by a -
   random number between 1 to 6*NoOfDices denoting the dice roll and the initial and final position based on the move.

Rules of the game:
i)  The board will have 100 cells numbered from 1 to 100.
ii) The game will have a dice and will always give a random number on rolling it.
iii)Each player has a place which is initially kept outside the board (i.e., at position 0).
iv) Based on the number on random scroll dice player will movie to the next position.
v)  Snake will have a head and tail and head is always have greater value than tail.
vi) Ladder will have a start and end position and start position will have low value than end.

Optional Requirements
i)  The game is played more than one dice.
ii) The board size can be customizable and can be taken as input before other input (snakes, ladders, players).
iii) On getting a 6, you get another turn and on getting 3 consecutive 6s, all the three of those get cancelled.
