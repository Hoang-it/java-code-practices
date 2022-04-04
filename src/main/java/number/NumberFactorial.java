package number;

import interfaces.Problem;

public class NumberFactorial implements Problem {
    @Override
    public void description() {
        System.out.println("Find factorial of an integer?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a number");
        System.out.println("Output: a factorial number");
    }

    @Override
    public void solve() {
        long test = 5;
        System.out.println("Input: " + test);
        System.out.println("Output: " + factorial(test));

    }

    public long factorial(long num){
        if (num == 1){
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
