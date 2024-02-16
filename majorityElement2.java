import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] nums1 = { 3, 2, 3 };
        System.out.println(majority(nums1)); // Output: [3]

        int[] nums2 = { 1 };
        System.out.println(majority(nums2)); // Output: [1]

        int[] nums3 = { 1, 2 };
        System.out.println(majority(nums3)); // Output: [1, 2]
    }

    public static List<Integer> majority(int[] arr) {
        List<Integer> result = new ArrayList<>();

        if (arr == null && arr.length == 0) {
            return result;
        }
        // Initialize candidates and their counters
        int can1 = 0, can2 = 1, count1 = 0, count2 = 0;

        // First pass: Find potential candidates
        for (int num : arr) {
            if (num == can1) {
                count1++;
            } else if (num == can2) {
                count2++;
            } else if (count1 == 0) {
                can1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                can2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass: Verify candidates
        count1 = 0;
        count2 = 0;

        for (int num : arr) {
            if (num == can1) {
                count1++;
            } else if (num == can2) {
                count2++;
            }
        }

        // Check if candidates meet the criteria
        if (count1 > arr.length / 3) {
            result.add(can1);
        }
        if (count2 > arr.length / 3) {
            result.add(can2);
        }

        return result;

    }

}
