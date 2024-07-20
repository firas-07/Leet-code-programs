class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        // Traverse the string from the end to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanCharToInt(s.charAt(i));

            // If current value is less than previous value, it means we have to subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return total;
    }
    private static int romanCharToInt(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
