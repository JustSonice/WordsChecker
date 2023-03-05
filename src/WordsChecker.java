import java.util.*;

public class WordsChecker {

    protected Set<String> text;


    public WordsChecker(String text) {
        this.text = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    boolean hasWord(String word) {
        System.out.println(text.contains(word));
        return text.contains(word);

    }
}