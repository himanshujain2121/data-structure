package codingQuestions.array.basic;

public class checkArrayIsSorted {
    public static void main(String[] args) {
        //int[] arr = {5,2,6,1,4,10,7};
        int[] arr = {1,2,3,4,5};
        Boolean value = isSorted(arr);
        System.out.println("array is sorted :"+ value);
    }

    private static Boolean isSorted(int[] arr) {
        boolean status = true;
        for (int i = 0 ; i < arr.length - 1 ;i++){
            int current = arr[i];
            int next = arr[i+1];
            if(current != (next -1)){
                status = false;
                return false;
            }
        }
        return status;
    }
}
