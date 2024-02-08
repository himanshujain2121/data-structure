package codingQuestions.array.basic;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,6,1,4,10,7,8};
        int search = 11;
        boolean num = Linear(arr,search);
        System.out.println("linear search value = "+ search +" found = "+ num);
    }

    private static boolean Linear(int[] arr, int search) {
        boolean status = false;
        for(int i = 0; i < arr.length ;i++){
            if(arr[i] == search){
                status = true;
                return status;
            }
        }
        return status;
    }


}
