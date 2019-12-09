import java.util.ArrayList;

public class Hangman {
    public static String word;
    public static int tries = 0;
    public static boolean hasWord = false;
    public static ArrayList<String> current = new ArrayList<String>();
    public static String guessedLetters = "";

    public static void setWord(String newWord){
        word = newWord;
        for(int i = 0; i < word.length(); i++){
            current.add("_");
        }
        hasWord = true;
    }

    public static void guess(String guess){
        boolean correct = false;

        for(int i = 0; i < word.length(); i++){
            if(guess.charAt(0) == word.charAt(i)){
                current.set(i, guess);
                correct = true;
            }
        }
        if(!correct){
            tries++;
            guessedLetters = guessedLetters + guess + " ";
        }
    }
}