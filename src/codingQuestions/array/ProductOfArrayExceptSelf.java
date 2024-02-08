package codingQuestions.array;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = { -1,1,0,-3,3 };
        int[] value = productExceptSelf(nums);
        for (int val:value ) {
            System.out.print(val + ", ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        for(int i = 0 ; i <nums.length; i++){
            product = product * nums[i];
        }
        for(int i = 0 ;i< nums.length; i++){
            nums[i] = product / nums[i];
        }
        return nums;


    }
}
