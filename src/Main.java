import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      System.out.println("Welcome to Random Number Game");
      Scanner input=new Scanner(System.in);
      int random=(int)(Math.random()*100+1);
      Game RG_Game=new Game(random);
      System.out.println("select the Number between 1 to 100 for win");
      int user_Input=input.nextInt();
       RG_Game.userInput(user_Input);
       while (!RG_Game.checkNumber()){
           System.out.println("Guess the number again (•_•) ");
           RG_Game.n= input.nextInt();
       }
       input.close();
    }
}