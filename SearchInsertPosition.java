package Programs;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;  // middle index

            if (nums[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (nums[mid] < target) {
                l = mid + 1;  // search in right half
            } else {
                r = mid - 1;  // search in left half
            }
        }

        // If not found, l is the insert position
        System.out.println("Insert position: " + l);
    }
}
