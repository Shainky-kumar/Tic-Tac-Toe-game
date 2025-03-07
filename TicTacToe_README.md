
# Tic Tac Toe Game in Java

A simple **Tic Tac Toe** game implemented in **Java**. This is a console-based game where two players can play the classic **3x3 grid** game. Players can choose to play as **X** or **O**, and the first player to align three marks horizontally, vertically, or diagonally wins the game.

## Prerequisites

- **Java 8** or higher installed on your machine.

## How to Run the Game

1. Clone the repository or download the project files.
2. Open a terminal or command prompt and navigate to the folder where the `TicTacToe.java` file is located.
3. Compile the Java file:
   ```bash
   javac TicTacToe.java
   ```
4. Run the game:
   ```bash
   java TicTacToe
   ```

## How to Play

- There are two players: **Player X** and **Player O**.
- The game will prompt each player to select a number (from 1 to 9) corresponding to a position on the 3x3 grid.
- Player **X** always starts, and players take turns until one of them wins or the game results in a draw.
- To win, a player must align three of their marks (X or O) horizontally, vertically, or diagonally.

### Grid Layout
```
 1 | 2 | 3
-----------
 4 | 5 | 6
-----------
 7 | 8 | 9
```

Each player selects a position to place their mark, starting with Player X.

### Example Game Flow

```
Current Board:
 1 | 2 | 3
-----------
 4 | 5 | 6
-----------
 7 | 8 | 9

Player X, make your move: 1
Current Board:
 X | 2 | 3
-----------
 4 | 5 | 6
-----------
 7 | 8 | 9

Player O, make your move: 5
Current Board:
 X | 2 | 3
-----------
 4 | O | 6
-----------
 7 | 8 | 9

Player X, make your move: 3
Current Board:
 X | 2 | X
-----------
 4 | O | 6
-----------
 7 | 8 | 9

...

Player O wins! Congratulations!
```

## Features

- **Two players**: You can play as **X** or **O**.
- **Turn-based gameplay**: Players alternate turns to place their mark.
- **Checks for victory**: The game automatically detects if a player wins.
- **Draw condition**: If all cells are filled and no player wins, the game ends in a draw.

## Game Logic

- The game board is a 3x3 grid represented as an array.
- Players enter a number (1-9) to place their mark on the corresponding position in the grid.
- After each turn, the game checks if there's a winner.
- The game continues until a player wins or all positions are filled, resulting in a draw.

## License

This project is licensed under the MIT License.

## Contact

For any issues or suggestions, feel free to open an issue on the GitHub repository or contact me at **your.email@example.com**.
