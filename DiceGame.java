import java.util.Scanner;
public class DiceGame
{
  public static void main(String[] args)
  {
    Die player1 = new Die();
    Die player2 = new Die();
    Scanner dnD = new Scanner(System.in);
    //advantage disadvantage roll
    System.out.println("Does player 1 have advantage?")
    String adv1 = dnD.nextLine();
    if adv1 == no
    System.out.println("does player 1 have disadvantage?")
    String dis1 = dnD.nextLine();
    if dis1 == no
    else 
    // //advantage disadvantage rol p2
    System.out.println("Does player 2 have advantage?")
    String adv2 = dnD.nextLine();
    if adv2 == no
    else 
    System.out.println("does player 2 have disadvantage?")
    String dis2 = dnD.nextLine();
    if dis2 == no
    else 
    
    // add mod if any player 1 
    System.out.println("does player 1 have a modifier?")
    String mod1 = dnD.nextLine();
    if mod1 == yes System.out.println("what is your modifier?")
    int modNum1 = dnD.nextInt();
    int dieroll1 = player1.roll() + modNum1;
    else int dieroll1 = player1.roll();
    
    //add mod if any player 2 
    System.out.println("does player 2 have a modifier?")
    String mod2 = dnD.nextLine();
    if mod2 == yes System.out.println("what is your modifier?")
    int modNum2 = dnD.nextInt();
    int dieroll2 = player2.roll()+ modNum2;
    else int dieroll2 = player2.roll();
 
    System.out.println("Player 1 rolled a " + dieroll1);
    System.out.println("Player 2 rolled a " + dieroll2);
 
    if (dieroll1 > dieroll2) System.out.println("Player 1 wins!");
    else
    if (dieroll2 > dieroll1) System.out.println("Player 2 wins!");
    else System.out.println("Attacker wins!");
 
  }
}