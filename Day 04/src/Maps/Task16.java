package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task16 {
    public static void main(String[] args) {
        String[] strings = {"code","bug"};
        System.out.println(pairs(strings));
    }
    public static Map<String,String> pairs (String[] strings){
        Map<String, String> temp = new LinkedHashMap<String, String>();
        for (String word: strings) {
            //считывает буквы
            String firstLetter = word.substring(0,1);
            String lastLetter = word.substring(word.length()-1);

            //проверяет наличие слов
            if(temp.get(firstLetter)==null){
                temp.put(firstLetter,lastLetter);
            } else{
                temp.put(firstLetter,temp.get(firstLetter)+lastLetter);
            }

        }
        return temp;
    }
}
