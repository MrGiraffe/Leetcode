package MissingNumber;

public class MissingNumber {

    static public int missingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i = i + 3) {
            if (!(arr[i] == arr[i + 2])) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {0, 0, 0, 1, 1, 2, 2, 2};
        System.out.println(missingNumber(arr));

    }
}
