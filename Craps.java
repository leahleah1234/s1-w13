public class Craps {
    DiceRoll r;

    public Craps() {
        r = new DiceRoll();
    }

    // Returns 0 if lose, otherwise return 1
    public int play() {
        r.roll();
        int die = r.total();
        if (die == 2 || die == 3 || die == 12) {
            return 0;
        } else if (die == 7 || die == 11) {
            return 1;
        }
        int die2 = r.total();
        while (die2 != 7 || die2 != die) {
            die2 = r.total();
        }
        return 1;
    }

    // simulate play to see your odds of winning
    public void tester(int howMany) {
        int k = 0;
        while (k < howMany) {
            System.out.println(play());
            k = k + 1;
        }
    }

    public static void main(String[] args) {
        Craps c = new Craps(); 
        c.tester(1000); 
    }
}
