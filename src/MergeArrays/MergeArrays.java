package MergeArrays;

public class MergeArrays {

    public static int[] mergeArrays(int[] a, int[] b) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] result = new int[a.length + b.length];

        while (j < a.length && k < b.length) {
            if (a[j] <= b[k]) {
                result[i++] = a[j++];
            } else if (b[k] < a[j]) {
                result[i++] = b[k++];
            }
        }
        while (j < a.length) {
            result[i++] = a[j++];
        }
        while (k < b.length) {
            result[i++] = b[k++];
        }

        return result;
    }

    public static void main(String args[]) {
        int[] a = {2, 4, 6, 7};
        int[] b = {4, 5, 6, 7, 7};
        int[] res = mergeArrays(a, b);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
    }
}
