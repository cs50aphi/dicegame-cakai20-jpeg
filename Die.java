public class Die
{
    //instance variables
    int sides;
    // constructor
    public Die()
    {
        sides = 20;
    }
   
    //methods
    public int roll()
    {
        int r =(int)(Math.random() * sides) + 1; 
        return r;
    }
     public int roll(int m)
    {
        int r =(int)(Math.random() * sides) + 1; 
        return r+m;
    }
}
