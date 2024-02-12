package codingQuestions.array.easy;

import java.util.LinkedList;
import java.util.List;

public class Merge_2_Sorted_Array {
    public static void main(String[] args) {
        int[] arr1 = {1 ,2 ,3 ,3};
        int[] arr2 = {2 ,3 ,4};
        List<Integer> ll = sortedArray(arr1,arr2);
        System.out.println(ll);
    }

    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int first = 0;
        int second = 0;
        int max = a.length+ b.length;
        List<Integer> ll = new LinkedList<>();
        for(int i = 0 ; i < max; i++){
            int firstValue = a[first];
            int secondValue = b[second];
          //  System.out.println("firstValue = "+ firstValue+",secondValue = "+secondValue);
            if(firstValue > secondValue && !ll.contains(secondValue)){
                ll.add(secondValue);
                second++;
            }
            if(firstValue < secondValue && !ll.contains(firstValue)){
                ll.add(firstValue);
                first++;
            }
            if(firstValue == secondValue && !ll.contains(secondValue)){
                ll.add(firstValue);
                first++;
                second++;
            }
         //   System.out.println(ll);
        }
        return ll;
    }
}
