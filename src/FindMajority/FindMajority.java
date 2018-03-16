package FindMajority;

import java.util.HashMap;
import java.util.Map;

// M. FWIW I dodn't know Java too well....
public class FindMajority {

    // M. return Optional<Integer>. -1 Is legit integer number.
    static public int findMajority(int[] arr) {
        // M:  Use "diamond operator" new <>HashMap();
        Map<Integer, Integer> cntrs = new <Integer, Integer>HashMap();
        // M. for (int i : arr)
        for (int i = 0; i < arr.length; i++) {
            //M: Use HashMap::compute
            if (cntrs.containsKey(arr[i])) {
                cntrs.replace(arr[i], cntrs.get(arr[i]), cntrs.get(arr[i]) + 1);

                // M. You can also remember highest value and end early if there is not enough elements for
                // anybody to get to the half. BTW, good style would be to fetch, e.t. c only once in compute.
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

