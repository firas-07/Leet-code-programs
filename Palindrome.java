public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        int digit, temp = x;
        int reverse = 0;
        while(x>0){
            digit = x%10;
            reverse = reverse*10 + digit;
            x = x/10;
        }
        if(temp == reverse){
            return true;
        }
        else{
            return false;
        }
    }
}
