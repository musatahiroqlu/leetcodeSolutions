class Solution {
     public static int largestPerimeter(int[] nums) {
        // Əvvəlcə array-ı artan sıralayaq
        Arrays.sort(nums);

        // Sonda ən böyük üçlüyü yoxlayırıq
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            // Üçbucaq şərti: c + b > a
            if (b + c > a) {
                return a + b + c; // perimetr
            }
        }
        return 0; // heç bir üçbucaq mümkün deyilsə
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 1, 2};
        System.out.println(largestPerimeter(nums1)); // 5

        int[] nums2 = {1, 2, 1, 10};
        System.out.println(largestPerimeter(nums2)); // 0
    }
}