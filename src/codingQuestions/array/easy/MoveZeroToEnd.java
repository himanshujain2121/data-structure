package codingQuestions.array.easy;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] movarr = move(arr);
        for(int i = 0; i < movarr.length ; i++){
            System.out.print(arr[i]+", ");
        }
    }

    private static int[] move(int[] arr) {

        int zero = 0;
        int nonZero = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int value = arr[i];
            if(value != 0){
                int temp = arr[zero];
                 arr[zero] = arr[nonZero];
                arr[nonZero] = temp;
            nonZero = nonZero + 1;
            zero = zero + 1;
            }
            else if(value == 0){
                nonZero = nonZero + 1;
            }
        }
        return arr;
    }
}
