package Maps;

import java.util.HashMap;
import java.util.Map;

public class Task15 {
    public static void main(String[] args) {

        String[] strings = {"fuck", "frank","shite", "fagot", "cunt", "idiot", "cunt", "idiot", "fuck"};
        System.out.println(firstChar(strings));

    }
    public static Map<String, String > firstChar(String[] strings){
        Map<String, String> temp = new HashMap<String, String>();
        for (String word: strings) {
            String firstLetter = word.substring(0,1);
            if(temp.get(firstLetter)==null){
                temp.put(firstLetter,word);
            } else{
                temp.put(firstLetter,temp.get(firstLetter)+word);
            }


//            if(word.substring(0,1) == null){
//                firstLetter = word.substring(0,1);
//                temp.put(firstLetter,word);
//            } else {
//
//            }



        }
        return temp;
    }
}
