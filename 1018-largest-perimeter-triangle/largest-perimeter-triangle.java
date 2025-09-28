class Solution {
     public static int largestPerimeter(int[] nums) {
     
        Arrays.sort(nums);

        
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
          
            if (b + c > a) {
                return a + b + c; 
            }
        }
        return 0; 
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 1, 2};
        System.out.println(largestPerimeter(nums1));

        int[] nums2 = {1, 2, 1, 10};
        System.out.println(largestPerimeter(nums2));
    }
}
