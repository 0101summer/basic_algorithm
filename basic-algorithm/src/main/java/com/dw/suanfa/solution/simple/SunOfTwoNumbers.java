package com.dw.suanfa.solution.simple;

import java.util.HashMap;
import java.util.Map;

public class SunOfTwoNumbers {
    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     * https://leetcode-cn.com/problems/two-sum/
     */
    
    public static void main(String[] args) {
        int[] sumOfTwoNumbers = getSumOfTwoNumbers();
        for (int i : sumOfTwoNumbers) {
            System.out.println(i);
        } 
    }

    private static int[] getSumOfTwoNumbers(){
        /*
            给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
            你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
            你可以按任意顺序返回答案。
        */

        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] getSumOfTwoNumbersHashOfficial() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
