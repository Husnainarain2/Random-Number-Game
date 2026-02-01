Random Number Game (Java Console Application)

The Random Number Game is a beginner-friendly Java console application where the computer generates a random number and the player tries to guess it. After each guess, the program tells whether the guessed number is greater than, less than, or equal to the computer’s number. The game continues until the correct number is guessed.

📖 Description

This project is designed to practice core Java concepts such as:
 Object-Oriented Programming (OOP)
Conditional statements
Loops
User input handling
Random number generation

It is ideal for Java beginners who want hands-on experience with logic building.

✨ Features

🎲 Random number generation between 1 and 100

⌨ User input using Scanner

🔁 Continuous guessing using a loop

📊 Counts total number of attempts

🧠 Logical hints for each guess

❌ Ends only when the correct number is guessed

🛠 Technologies & Concepts Used

Java

OOP Concepts

Class

Object

Constructor

Methods

Control Flow

if-else

while loop

Utilities

Math.random()

Scanner

📁 Project Structure
Random-Number-Game/
│
├── Game.java      // Game logic and checking mechanism
├── Main.java      // Main execution file
└── README.md      // Project documentation

▶️ How to Run the Project
🔹 Step 1: Clone the Repository
git clone https://github.com/Husnainarain2/Random-Number-Game.git

🔹 Step 2: Move to Project Directory
cd Random-Number-Game

🔹 Step 3: Compile Java Files
javac Game.java Main.java

🔹 Step 4: Run the Program
java Main

🧠 How the Game Works (Logic Explanation)

The computer generates a random number between 1 and 100

The user enters a guess

The program checks:

If guess < random number → Too Low

If guess > random number → Too High

If guess == random number → Correct Guess

Each attempt increases the counter

Game ends after the correct guess

🧪 Sample Output
Welcome to Random Number Game
select the Number between 1 to 100 for win
45
Your Number is Greater then computer Choice
Guess the number again (•_•)
20
Your Number is Less then computer Choice
Guess the number again (•_•)
32
You guessed the right number ^_^
Number of guesses took = 3
