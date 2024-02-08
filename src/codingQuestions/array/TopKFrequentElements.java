package codingQuestions.array;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 4, 5, 2, 6, 1 };
        int frequent = 2;
        int[] value = topKFrequent(nums,frequent);
        for (int val:value ) {
            System.out.print(val + ", ");
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list,(o1,o2) -> o2.getValue().compareTo(o1.getValue()));
        for(int i = 0 ; i < k ; i++){
            arr[i] = list.get(i).getKey();
        }
        return arr;
    }
}
