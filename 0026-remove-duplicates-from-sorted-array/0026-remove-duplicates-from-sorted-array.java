class Solution {
    public int removeDuplicates(int[] nums) {
          if (nums.length == 0) {
            return 0;
        }
        
        // Pointer for the next unique element position
        int i = 0;
        
        // Start from the second element and iterate through the array
        for (int j = 1; j < nums.length; j++) {
            // If the current element is different from the previous one
            if (nums[j] != nums[i]) {
                i++;  // Move the pointer for unique elements
                nums[i] = nums[j];  // Place the unique element in the next position
            }
        }
        
        // The number of unique elements is i + 1
        return i + 1;
    }
}