package number;

import interfaces.Problem;

public class CheckPrime implements Problem {
    @Override
    public void description() {
        System.out.println("Java program to check if the given number is Prime?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a number");
        System.out.println("Output: wether number is prime");
    }

    @Override
    public void solve() {
        int a = 19;
        System.out.println("======SOVLE=======");
        System.out.println("Input: " + a);
        System.out.println("Output: " + isPrime(a));

    }

    public boolean isPrime(int n){
        if (n == 0 || n == 1) return false;
        if (n == 2) return true;
        for (int i = 3; i <= n/2; i++){
            if (n % i == 2) return false;
        }
        return true;
    }
}
