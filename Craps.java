public class Craps
{
    DiceRoll r;
    
    public Craps()
    {
        r = new DiceRoll ( );
    }

    // Returns 0 if lose, otherwise return 1 
    public int play ( ) {
        r.roll(); 
        int die = r.total();
        if(die == 2 || die == 3 || die == 12) {
            return 0;
        }
        else if(die == 1 || die == 4 || die == 5 || die == 6 || die == 8 || die == 9 || die == 10) {
            int die2 = r.total(); 
            while(die2 != 7 || die2 != die) {
                die2 = r.total();
            }
            return 1; 

        }
        return 1; 
    }
    
    //simulate play to see your odds of winning
    public void tester(int howMany)
    {
    	
    }

    public static void main(String[] args) {
        Craps c = new Craps(); 
        c.play(); 
    }
}
