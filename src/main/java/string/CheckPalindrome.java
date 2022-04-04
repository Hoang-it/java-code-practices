package string;

import interfaces.Problem;

public class CheckPalindrome implements Problem {
    @Override
    public void description() {
        System.out.println("Palindrome Check");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a sting");
        System.out.println("Output: if string is palindrome string");
    }

    public boolean checkPalindromeString(String str){
        boolean result = true;
        int length = str.length();
        for(int i=0; i < length/2; i++){
            if (str.charAt(i) != str.charAt(length-i-1)){
                result = false;
            }
        }
        return result;
    }

    @Override
    public void solve() {
        String a = "abccba";
        System.out.println("Input: " + a);
        System.out.println("Output: " + checkPalindromeString(a));
    }
}
