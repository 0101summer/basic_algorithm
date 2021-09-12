package com.dw.suanfa.solution.simple;

public class Search {
    /**
     * 二分查找：给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     * 链接：https://leetcode-cn.com/problems/binary-search
     * 例：
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     * 解释: 9 出现在 nums 中并且下标为 4
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        int search = getSearch(nums, target);
        System.out.println(search);
    }
    
    private static int getSearch(int[] nums, int target){
        // 成倍的缩小查找范围
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            System.out.println(mid);
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
