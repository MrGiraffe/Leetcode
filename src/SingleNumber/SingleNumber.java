package SingleNumber;

import java.util.Optional;

public class SingleNumber {

    public static Optional<Integer> singleNumber(int[] arr) {

        int result = 0;
        for (int i : arr) {
            result ^= i;
        }

        return Optional.of(result);
    }

    public static void main(String args[]) {
        int[] arr = {1, 4, 0, 4, 1};
        System.out.println(singleNumber(arr).get());
    }
}


