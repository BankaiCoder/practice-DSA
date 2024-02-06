
public class kadanesAlgo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, 3, 5, -2, 6 };
        int sum = algo(arr);
        System.out.println(sum);
    }

    public static int algo(int[] arr) {
        int max = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
            if (max > maxSum)
                maxSum = max;
            if (max < 0)
                max = 0;
        }
        return maxSum;
    }
}
