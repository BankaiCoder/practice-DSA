
public class rotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;
        // first reverse the whole array so the output will be
        // [5,4,3,2,1]
        reverse(arr, 0, arr.length - 1);

        // calculate whether the value of k is greater then the array size or not
        k = k % arr.length;
        // then reverse the array upto the desired length
        // the otput after this will be
        // [3,4,5,2,1]
        reverse(arr, 0, k - 1);

        // reverse the array from the desired length to the length of the array
        // the output will be [3,4,5,1,2]
        reverse(arr, k, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
