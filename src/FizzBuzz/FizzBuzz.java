package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {

        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    res.add("FizzBuzz");
                } else {
                    res.add("Fizz");
                }
                continue;
            }
            if (i % 5 == 0) {
                res.add("Buzz");
                continue;
            }
            res.add(String.valueOf(i));
        }

        return res;
    }

    public static void main(String args[]) {

        System.out.println(fizzBuzz(100));
    }
}
