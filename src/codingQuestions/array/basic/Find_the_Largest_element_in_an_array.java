package codingQuestions.array.basic;

public class Find_the_Largest_element_in_an_array {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,4,10,7};
        int value = findMax(arr);
        System.out.println("max value = "+value);
    }

    private static int findMax(int[] arr) {
        int maxValue = 0;
        maxValue = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            maxValue = Math.max(maxValue,arr[i]);
        }
        return maxValue;
    }
}
