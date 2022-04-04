package number;

import interfaces.Problem;

public class SwapNumber implements Problem {
    @Override
    public void description() {
        System.out.println("How to swap two numbers without using a third variable?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: two integer numbers");
        System.out.println("Output: two integer swaped");
    }

    @Override
    public void solve() {
        int a = 10;
        int b = 100;
        System.out.println("======SOVLE=======");
        System.out.println("a : " + a + " b : " + b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("a : " + a + " b : " + b);
    }

}
