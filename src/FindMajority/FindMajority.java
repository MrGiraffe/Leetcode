package FindMajority;

import java.util.HashMap;
import java.util.Optional;

// M. FWIW I dodn't know Java too well....
public class FindMajority {

    // M. return Optional<Integer>. -1 Is legit integer number.
    //static public int findMajority(int[] arr) {

    static public Optional<Integer> findMajority(int[] arr) {
        int coursor = 0;
        int max = 0;

        // M:  Use "diamond operator" new <>HashMap();
        //Map<Integer, Integer> cntrs = new <Integer, Integer>HashMap();

        HashMap<Integer, Integer> cntrs = new HashMap<>();
        int halfLength = (arr.length / 2);

        // M. for (int i : arr)
        //for (int i = 0; i < arr.length; i++) {

        for (int i : arr) {

            //M: Use HashMap::compute
            //if (cntrs.containsKey(arr[i])) {
            //cntrs.replace(arr[i], cntrs.get(arr[i]), cntrs.get(arr[i]) + 1);

            cntrs.compute(i, (k, v) -> v == null ? 1 : v + 1);
            int counter = cntrs.get(i);

            // M. You can also remember highest value and end early if there is not enough elements for
            // anybody to get to the half. BTW, good style would be to fetch, e.t. c only once in compute.
            //
            if (counter > max) {
                max = counter;
                if (coursor > halfLength && max < 2 * halfLength - coursor) {
                    return Optional.of(-1);
                }
            }

            if (cntrs.get(i) > halfLength) {
                return Optional.of(i);
            }


        }
        return Optional.of(-1);
    }

    public static void main(String args[]) {
        int[] arr = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
        System.out.println(findMajority(arr).get());
    }
}

