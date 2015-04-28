package nyc.c4q.ramonaharrison;

import java.util.ArrayList;
import java.util.List;

/**
 * Access Code 2.1
 * Ramona Harrison
 * WordsWithout.java
 *
 *
 Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

 wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
 wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
 wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}
 *
 */

public class WordsWithout {
    public static List wordsWithoutList(String[] words, int len) {
        ArrayList<String> wordsWithout = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                wordsWithout.add(words[i]);
            }
        }
        return wordsWithout;
    }

    public static void main(String[] args) {
        String[] list = {"a", "bb", "b", "ccc"};

        System.out.println(wordsWithoutList(list, 1));
        System.out.println(wordsWithoutList(list, 3));
        System.out.println(wordsWithoutList(list, 4));
    }

}
