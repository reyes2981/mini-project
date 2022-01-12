Feature Requirements
Game welcomes the user
Have a main men with options to either "play" or "quit"
* Have a main menu with options to enter 2 players or vs. computer.
    The game requests the user to enter an opponent choice (2 players or computer)
    The user types the selected option
        * If the user enters 2 players, they should be able to play 
          rock–paper–scissors against a human competitor
            The human competitor picks among rock, paper or scissors
        * If the user enters computer, they should be able to play
            rock–paper–scissors against a computer competitor
                 The game picks randomly among rock, paper or scissors
* When the game is over, the winner should be declared
  Calculates the results
  The game updates the total score( how many games you play in total and won games)
  Display the score
  Ask the user if he wants to continue

Technical Requirements
* Use classes to remove repetitive parts of code, and create an abstract Player class to manage the state 
of the player (if they won or lost, how many points they have, what move they made).
* Handle invalid user input.
* Handle incorrect capitalization of otherwise valid user input ("rock," "Rock," "RoCk," "ROCK," and more).
* Each class (including a Player class) should have methods associated with it and be instantiated as an 
object (as opposed to a singleton or an interface).
* Use public, private, and static variables, methods, and members within each class appropriately.
* Incorporate exception handling to make sure your game crashes gracefully if it receives bad input.
* Get standard input with Java using a Scanner, or use Processing to get mouse, keyboard, or other input.
* Use arrays or array lists to store game history (if applicable).

