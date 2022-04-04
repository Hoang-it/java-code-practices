package number;

import interfaces.Problem;

public class Fibonaci implements Problem {
    @Override
    public void description() {
        System.out.println("Fibonacci Series using recursion");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a number");
        System.out.println("Output: Sum of A series of Fibonacci less than number");
    }

    @Override
    public void solve() {
        int a = 10;
        System.out.println("======SOVLE=======");
        System.out.println("Input: " + a);
        System.out.println("Output: " + fibonacci(a));
    }
    public int fibonacci(int n){
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
