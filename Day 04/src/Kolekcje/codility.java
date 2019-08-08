package Kolekcje;

import java.util.*;
//отсортировать и найти большше - это предел до которого мотать
public class codility {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};

        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i:A) {
            set.add(i);
        }
        int temp = 0;
        for (int i = 0; i < 100000; i++) {
            if (!set.contains((i))) {
                temp = i;
            }
        }
        return temp;
    }
}

//    Set<Integer> set = new HashSet<>();
//// zamieniam tablice na SET
//        for(int i:A){
//                set.add(i);
//                }
//                int element=1;
//
//                while(true){
//                if(set.contains(element)){
//                element++;
//                }
//                else{
//                return element;
//                }
//                }