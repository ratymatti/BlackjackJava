# Blackjack Game

## Overview

This Java program is a simple console-based implementation of the popular card game Blackjack. The game allows the user to play multiple rounds against a computerized dealer. The user is prompted to decide whether to "hit" or "stay" to reach a hand value as close to 21 as possible without exceeding it. The dealer follows a set of rules to determine its actions.

## Files

### 1. `Blackjack.java`

This file contains the main logic of the Blackjack game. It includes the game loop, user input handling, and the interaction between the player and the dealer. The game continues until the user decides to quit.

### 2. `BlackjackFunctions.java`

This file contains several utility functions used in the main game file. These functions include:

- **hitOrStay(Scanner scanner):** Asks the user to "hit" or "stay" and validates the input.
- **drawRandomCard():** Generates a random number between 1 and 13, simulating drawing a playing card.
- **isBust(int userHandValue):** Checks if the player's hand value exceeds 21, indicating a bust.

### 3. `GetCardString.java`

This class is responsible for generating a visual representation of playing cards based on their numerical value. The `cardString(int cardNumber)` function takes a card number as input and returns a string representing the graphical depiction of the corresponding playing card.

#### `cardString(int cardNumber)`

- **Input:** `cardNumber` - An integer representing the numerical value of the playing card.
- **Output:** A string containing an ASCII art representation of the playing card.

The function uses a switch statement to handle different card numbers from 1 to 13, each representing a unique playing card. The ASCII art depicts the card's face, and the function returns the string representation.

- Example:
  ```java
     _____ 
    |5    |
    | o o |
    |  o  |
    | o o |
    |____S|



## How to Play

1. Run the `Blackjack.java` file.
2. Follow the on-screen instructions to start the game.
3. During your turn, decide whether to "hit" or "stay" based on your current hand value.
4. The dealer will then play its turn according to the rules.
5. The winner is determined based on the total hand value without exceeding 21.
6. After each round, the game prompts if you want to play a new game or quit.

## Customization

Feel free to extend or modify the game. Possible enhancements include:

- Implementing additional rules for the dealer.
- Introducing betting mechanisms.
- Adding multiplayer support.
- Improving the graphical representation of playing cards.

## Dependencies

- The game relies on the `Scanner` class for user input.


## Acknowledgments

This Blackjack game is a simplified version and may not cover all the rules and variations found in traditional Blackjack games. It serves as a starting point for further development and customization. Enjoy playing and experimenting with the code!

