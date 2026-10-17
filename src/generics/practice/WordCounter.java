package generics.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> wordCountMap;
    private int count;
    private String word;

    public static Map<String, Integer> countWord(List<String> words) {
        Map<String, Integer> count = new HashMap<>();

        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Map<String, Integer> wordCount = countWord(List.of("apple", "banana", "apple", "orange", "banana", "apple"));
        System.out.println(wordCount);
    }
}
