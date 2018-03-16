package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static public int[] findSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer, Integer> mp = new <Integer, Integer>HashMap();
        for (int i = 0; i < nums.length; i++) {

            if (mp.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = mp.get(target - nums[i]);
                return result;
            }

            mp.put(nums[i], i);
        }

        return result;

    }


    public static void main(String args[]) {
        int[] arr = {2, 3, 1, 7, 0, 12, 4, 5};

        System.out.println(Arrays.toString(findSum(arr, 9)));

    }
}