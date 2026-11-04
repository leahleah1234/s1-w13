public class Dice4Main{
    public static void main(String[] args) {
        Dice4 d = new Dice4();
        d.runTest12In24Rolls(1000);
        d.runTest12In24Rolls(100000);
    }
}