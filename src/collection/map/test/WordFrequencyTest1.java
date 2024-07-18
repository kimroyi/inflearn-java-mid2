package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) +1);
        }

        System.out.println(map);
    }

/*
            내가 푼 내용
            String[] words = text.split(" ");
            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
*/
}
