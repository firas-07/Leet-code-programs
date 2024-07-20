public class MatchingParanthesis {

    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(validParanthesis(str));
    }
    static boolean validParanthesis(String str){
        int n = str.length();
        char[] stack = new char[n]; // char array act as the stack data structure
        int top = -1; // stack top value is always -1
        for (int i=0;i<n;i++){  //loop to iterate over the string
            char ch = str.charAt(i); // storing each character in the string
            if(ch == '(' || ch == '{' || ch == '['){
                stack[++top] = ch;   //storing character in stack[0] place
            }
            else{
                if (top == -1){
                    return false;
                }
                char topChar = stack[top--]; // stores the top char as the first value of the stack
                if(ch == ')' && topChar != '(' || ch == '}' && topChar != '{' || ch == ']' && topChar != '['){
                    return false;
                }
            }
        }
        return top == -1; // true
    }
}