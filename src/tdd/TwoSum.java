package tdd;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> tem = new HashMap();
            for(int i = 0; i < nums.length; i++) {
                tem.put(i, nums[i]);
            }
            int j = 0;
            for (int num:nums) {
                int sum;
                for (int i = 1; i < tem.size(); i++) {
                    sum = num + tem.get(i);
                    if (sum == target & j != i){
                        return new int[]{j, i};
                    }
                }
                j++;
            }
            return new int[]{0, 1};
    }

    public static void main(String[] args) {
        TwoSum n = new TwoSum();
        int[] ar = {2, 5, 5,9};
        System.out.println(Arrays.toString(n.twoSum(ar, 10)));
    }
}
