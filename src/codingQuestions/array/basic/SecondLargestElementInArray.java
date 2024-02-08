package codingQuestions.array.basic;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,6,1,4,10,7,8};
        int num = secondLargest(arr);
        System.out.println("second largest element = "+ num);
        int secondMin = secondMinimum(arr);
        System.out.println("second minimum element = "+ secondMin);
    }

    private static int secondMinimum(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < first){
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }

    private static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i =0 ; i < arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }
}
