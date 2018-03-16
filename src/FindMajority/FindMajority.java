package FindMajority;

import java.util.HashMap;
import java.util.Map;

public class FindMajority {

    static public int findMajority(int[] arr) {

        Map<Integer, Integer> cntrs = new <Integer, Integer>HashMap();
        for (int i = 0; i < arr.length; i++) {

            if (cntrs.containsKey(arr[i])) {
                cntrs.replace(arr[i], cntrs.get(arr[i]), cntrs.get(arr[i]) + 1);

                if (cntrs.get(arr[i]) > arr.length / 2) {
                    return arr[i];
                }

            } else {
                cntrs.put(arr[i], 1);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {0, 0, 0, 1, 1, 1, 1, 0, 0};
        System.out.println(findMajority(arr));
    }
}

