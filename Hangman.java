import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Hangman {
    char[] word;
    char[] hidden;
    int triesLeft;
    public Hangman(String word){
        this.word = word.toCharArray();
        this.hidden = new char[word.length()];
        Arrays.fill(hidden, '_');
        triesLeft = 6;
    }

    public boolean cCheck(char C){
        for(char c : word){
            if(c == C){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("I've thought of a word...");
        while(true){
            System.out.println("What's your first character guess?");
            String c = scanner.nextLine();

        }
    }
}
