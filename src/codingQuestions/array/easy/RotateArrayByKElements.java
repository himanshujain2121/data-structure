package codingQuestions.array.easy;

public class RotateArrayByKElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int position = 7;
        System.out.print("left rotate = ");
        int[] left = leftRotate(arr,position);
        for(int i = 0; i < left.length ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.print("right rotate = ");
        int[] right = rightRotate(arr,position);
        for(int i = 0; i < right.length ; i++){
            System.out.print(arr[i]+", ");
        }
    }

    private static int[] rightRotate(int[] arr, int position) {
        for(int i= 0 ; i< position; i++){
            int[] right = rightRotate(arr);
            arr = right;
        }
        return arr;
    }

    private static int[] rightRotate(int[] arr) {
        int temp = arr[arr.length -1];
        int length = arr.length;
        for(int i = arr.length - 2 ; i >= 0 ; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        return arr;
    }

    private static int[] leftRotate(int[] arr, int position) {
        for(int i = 0 ; i < position ; i++){
            int[] left = leftRotate(arr);
            arr= left;
        }
        return arr;
    }

    private static int[] leftRotate(int[] arr) {
        int temp = arr[0];
        for(int i = 1 ; i < arr.length ;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
