public class BlackBox {

    public int findIndexOfLetter(String word, String letter) {
        for(int x = 0; x < word.length(); x++)
            if(word.substring(x, x+1).equals(letter))
                return x;
       return -1;
    }
    

}
