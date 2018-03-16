package ReverseString;

public class ReverseString {

    static public String reverseString(String str) {

        if (str.length() <= 1) {
            return str;
        }

        char[] arr = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return String.valueOf(arr);

    }

    public static void main(String args[]) {
        String str = "hello";
        System.out.println(reverseString(str));

    }
}
