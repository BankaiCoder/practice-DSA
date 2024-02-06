
public class maxProduSubArray {
public static void main(String[] args) {
    int[] arr = {2,3,-2,4};
    System.out.println(maxProduct(arr));
}   

public static int maxProduct(int[] arr){
    int n = arr.length;
    int minPro = arr[0];
    int maxPro = arr[0];
    int result = 0;

    for(int i=1;i<n;i++){
        //check if the current value if negative if so then swap the value and store it in min
        if(arr[i]<0){
            int temp = maxPro;
            maxPro = minPro;
            minPro = temp;
        }

        //update maxProduct and minProduct for the current value
        minPro = Math.min(arr[i], minPro*arr[i]);
        maxPro = Math.max(arr[i],maxPro*arr[i]);

        result = Math.max(result, maxPro);
    }
    return result;
}

}
