import java.util.Scanner;

public class DieDriver
{
    public static void main(String[]args)
    {

        boolean gameOver = false;
        int goal = 100;
        int location1 = 0;
        int location2 = 0;
        //create players p1 and p2 
        Die p1 = new Die();
        Die p2 = new Die();
        //while game over is flase
        while(gameOver == false);
        {
            System.out.print("plyaer 1 is at" + location1);
        // roll for p1 
        // check to see if p1 has won 
        // if p1 has won set gameOver to true 
            int tempRoll = p1.roll();
            if (location1 + tempRoll == goal);
            {
                System.out.print("player 1 wins!");
                location1 += tempRoll;
                gameOver = true;
            }
            else if (location1 + tempRoll < goal);
            {
                System.out.print("player 1 rolls a" + tempRoll);
            }
            else 
            {
                System.out.print("player 1 rolled a " + tempRoll);
            }
        }
        
        // if not gone over add to location 1 
        // do same for p2 
        Die d = new Die();
        int roll = d.roll();
        System.out.println("you rolled a " + roll);
    }
    public static void pause()
    {
         Scanner in = new Scanner(System.in);
        System.out.println("press any key to continue");
        in.nextLine();
    }
    public static void player()
    {
        //add player push button?
        scanner in = new scanner()
        //scanner for numbers? 
        
        //max of 4 players
        
        //each new player repeat same steps?
    }
}