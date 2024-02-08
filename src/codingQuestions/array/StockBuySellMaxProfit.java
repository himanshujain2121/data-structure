package codingQuestions.array;

public class StockBuySellMaxProfit {
    public static void main(String[] args) {
        // time complexity  O(N)
        // space complexity O(1)
        //int[] arr = {3,1,4,8,7,2,5};
        int[] arr = {5,2,6,1,4};
        int profit = maxProfit(arr);
        System.out.println("Max profit = "+profit);
    }

    private static int maxProfit(int[] arr) {
        int maxProfit = 0;
        int minSoFar = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            minSoFar = Math.min(minSoFar,arr[i]);
            int currProfit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit,currProfit);
        }
        return maxProfit;
    }
}
