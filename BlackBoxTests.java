public class BlackBoxTests {

    public static void main(String[] args) {
        BlackBox b = new BlackBox();
        int result = b.findIndexOfLetter("witch", "t");
        int result1 = b.findIndexOfLetter("witch", "w");
        int result2 = b.findIndexOfLetter("witch", "h");
        int result3 = b.findIndexOfLetter("witch", "z");
        System.out.println(result + ": 2");
        System.out.println(result1 + ": 0");
        System.out.println(result2 + ": 4");
        System.out.println(result3 + ": -1");

    }
}
