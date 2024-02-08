package codingQuestions.array.basic;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {5,6,1,4,10,7,8};
        int[] rotateArr = rotate(arr);
        for(int i = 0; i < rotateArr.length ; i++){
            System.out.print(arr[i]+", ");
        }
    }

    private static int[] rotate(int[] arr) {
        int temp = arr[0];
        for(int i = 0 ; i < arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
