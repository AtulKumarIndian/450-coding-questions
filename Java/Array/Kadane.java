public class Kadane {
    public static void main(String[] args) {
        int inputArr [] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = Kadane(inputArr);
        System.out.println(result);
    }

    private static int Kadane(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum  += arr[i];
            maxSum = Integer.max(maxSum, sum);
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }
}
