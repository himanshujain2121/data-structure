package codingQuestions.array.easy;

import java.util.HashMap;
import java.util.Map;

public class Find_the_number_that_appears_once_and_the_other_numbers_twice {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        int value = getSingleElement(arr);
        System.out.println("number = "+value);
    }

    public static int getSingleElement(int []arr){
        // Write your code here.
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> hq:hm.entrySet()){
            if(hq.getValue() == 1){
                return hq.getKey();
            }
        }
        return 0;
    }
}
