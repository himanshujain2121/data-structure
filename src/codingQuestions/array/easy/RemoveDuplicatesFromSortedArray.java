package codingQuestions.array.easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,4,5};
        Set<Integer> remove = removeDuplicate(arr);
        System.out.println(remove);
    }

    private static Set<Integer> removeDuplicate(int[] arr) {
        Set<Integer> se = new HashSet<>();
        for (int i = 0 ; i < arr.length ; i++){
            se.add(arr[i]);
        }
        return se;
    }
}
