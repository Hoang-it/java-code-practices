package string;

import interfaces.Problem;

public class CheckVowel implements Problem {
    @Override
    public void description() {
        System.out.println("Java Program to check if a vowel is present in the string?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a string");
        System.out.println("Output: true if string have vowel");
    }

    public boolean containsVowel(String str){
        return str.matches(".*[aeiou].*");
    }

    @Override
    public void solve() {
        String str = "Hoang";
        System.out.println("======SOVLE=======");
        System.out.println("Input: " + str);
        System.out.println("Output: " + containsVowel(str));
    }
}
