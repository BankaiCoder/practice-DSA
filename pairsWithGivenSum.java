public class pairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int sum = 8;

        int ans = countPair(arr, n, sum);
        System.out.println(ans);
    }
    public static int countPair(int[] arr, int n, int sum){
        int i=0;
        int j=n-1;
        int k=0;
        int ans=0;

        while(i<j){
            k = arr[i]+arr[j];
            if(k == sum){
                ans++;
                i++;
                j--;
            }
            else if(k > sum){
                j--;
            }else{
                i++;
            }
        }
        if(ans == 0) return -1;
        return ans;
    }
}
