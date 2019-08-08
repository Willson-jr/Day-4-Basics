package Maps;

import java.lang.reflect.Array;
import java.util.*;

public class Task14 {
    public static void main(String[] args) {

        String[] elements = {"fuck", "shite", "fagot", "cunt", "idiot", "cunt", "idiot", "fuck"};
        System.out.println(wordCount(elements));

    }

    public static Map<String, Integer> wordCount(String[] elements) {
        Map<String, Integer> temp = new HashMap<String, Integer>();
        for (String word: elements) {
            Integer oldCount = temp.get(word);
            if(oldCount == null){
                oldCount = 0;
            }
            temp.put(word,oldCount +1);

        }
        return temp;
    }
}
