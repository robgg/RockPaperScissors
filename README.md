# RockPaperScissors
Rock, Paper, Scissors

Rock, Paper, Scissors is a simulator of the game [rock, paper, scissors](https://en.wikipedia.org/wiki/Rock-paper-scissors).
It simulates 100 iterations, prints the individual games and their outcome to the cl, as well as a summary of those 100 iterations.

A couple of thoughts on the implementation: 

* A bet is represented by the enum Bet, a game by the class Game. 

* Since the is no 'real' evaluation logic involved, the Game class is designed as a VO representing one game. The eval() method has been added to simulate a 'play', since the outcome is essentially determined at creation time (e.g. as soon as both players have chosen their respective bets).

* For a lack of requirement, a game instance is not designed to be persisted, or 'recognized' in any way. This would likely not be the case for anything but demonstration code.

* For the same reason, factory methods, repositories, etc. have been omitted.
