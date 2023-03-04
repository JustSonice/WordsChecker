import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.SimpleTimeZone;

public class WordsChecker {

    protected String text;
    protected String word;

    public WordsChecker(String text) {
        this.text = text;
    }

    boolean hasWord(String word) {
        this.word = word;
        HashSet<String> words = new HashSet<>();
        String[] textAlpha = text.split("\\P{IsAlphabetic}+");
        words.addAll(List.of(textAlpha));
        if (words.contains(word)){
            System.out.println("Слово " + word + " присутсвует в тексте");
            return true;
        }
        System.out.println("Слово " + word + " отсутствует в тексте");
        return false;
    }
}