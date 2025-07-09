
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int zero = 0;
        int two = n - 1;

        int i = 0;
        while (i < n) {
            if (nums[i] == 0) {
                swap(nums, zero, i);
                zero++;
                i++;
            } else if (nums[i] == 2) {
                
                swap(nums, two, i);
                two--;
                
            } else {
                i++;
            }
            ArrayList<Integer> list = Arrays.asList(nums);
        }


        
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}