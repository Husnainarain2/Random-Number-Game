public class Game {
    int n,x;    int noOfTrails=0;
    public Game(int comNumber){
        this.x=comNumber;
    }
    public int userInput(int userInput){
        this.n=userInput;
        return userInput;
    }

    public boolean checkNumber() {
        if (n<x) {
            System.out.println("Your Number is Less then computer Choice");
            noOfTrails=noOfTrails+1;
            return false;
        }
        else if (n>x){
            System.out.println("Your Number is Greater then then computer Choice");
            noOfTrails=noOfTrails+1;
            return false;
        }
        else {
            System.out.println("You guessed the right number ^_^ ");
            noOfTrails=noOfTrails+1;
            System.out.println("Number of guesses took = "+noOfTrails);
            return true;
        }
    }

}
