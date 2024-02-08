public class findUniques {
    public static void main(String[] args) {
        int[] arr = {1,1,2,5,5};
        int n = arr.length;

        int ans = unique(arr, n);
        System.out.println(ans);
    }
    public static int unique(int[] arr, int n){
        int ans = 0;

        for(int i=0;i<n;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
}
