package codingQuestions.array;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3 };
       // int[] arr = {5,-4,-2,6,-1};
        int value = findMaxSum(arr);
        System.out.println("Max sum in subarray= "+value);
    }

    private static int findMaxSum(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0; i < arr.length ;i++){
            currentSum = currentSum +arr[i];
            if(currentSum >= maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
