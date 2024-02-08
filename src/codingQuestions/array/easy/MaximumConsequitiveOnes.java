package codingQuestions.array.easy;

public class MaximumConsequitiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        int count = findConecuitiveOnes(arr);
        System.out.println("consecutive one ="+ count);
    }

    private static int findConecuitiveOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else{
                maxCount = count;
                count = 0;
            }
        }
        return maxCount;
    }
}
