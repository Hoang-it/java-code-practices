package string;

import interfaces.Problem;

public class RemoveTrailingSpace implements Problem {
    @Override
    public void description() {
        System.out.println("How to remove leading and trailing whitespaces from a string?");
        System.out.println("https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a string");
        System.out.println("Output: a string without space");
    }

    @Override
    public void solve() {
        String test = " Tôi tên\t ";
        System.out.println("Input: " + test);
        System.out.println("Output: " + test.strip());
    }
}
