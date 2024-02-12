package codingQuestions.array.easy;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int number = 5;
        int num = findMissingNumber(arr,number);
        System.out.println("missing number = "+ num);
    }

    private static int findMissingNumber(int[] arr, int number) {
        int num = 0;
        int total = (number*(number+1))/2;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        int diff = total - sum;
        return diff;
    }
}
