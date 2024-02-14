import java.util.HashMap;

public class pairSum {
    public static void main(String[] args) {
        int[] arr = {8,9,1,-2,4,5,11,-8,7};
        System.out.println(pair(arr, -4));
    }

    public static boolean pair(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]) == true) {
                int temp = map.get(arr[i]);
                map.put(arr[i], temp + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Now travel the array and check if a and b are equal or not and the map
        // already contains the index

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int b = k - a; // if u want b you should subtract a from k that how you get to make a+b = k
            if (a != b && map.containsKey(b) == true) {
                return true;
            } else if (a == b && map.containsKey(b) == true && map.get(b) > 1) {
                return true;
            }
        }
        return false;
    }
}
