The Number Game starts when user enters "ready". As the numbers are infinite, this game has defined boundaries, so users are 
requested to pick a number between 1 to 100. After game starts, use can only input "higher" or "lower" depending on the number chosen.
Once the system guesses the correct number, user enters "yes" or "end" to end the game.

to build the program at command line...use following command....at the project folder..

mvn clean package

to run the program ..use following command 

java -cp target/GuessNumber-0.0.1-SNAPSHOT.jar games.NumberGame