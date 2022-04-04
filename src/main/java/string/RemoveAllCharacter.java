package string;

import interfaces.Problem;

public class RemoveAllCharacter implements Problem {
    @Override
    public void description() {
        System.out.println("remove all occurrences of a given character from input String?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a String, a character");
        System.out.println("Output: a String without character");
    }

    @Override
    public void solve() {
        String str1 = "abcdABCDabcdABCD";
        System.out.println("Input: " + str1);
        str1 = str1.replace("a", "");
        System.out.println("Ouput: " + str1);
    }
}
