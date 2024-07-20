import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1,2,9};
        System.out.println(Arrays.toString(plusone(arr)));
    }

    static int[] plusone(int[] digits){
        int n = digits.length;

        // Iterate from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the current digit is 9, set it to 0
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the beginning
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
