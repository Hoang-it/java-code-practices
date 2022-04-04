package list;

import interfaces.Problem;

import java.util.Arrays;

public class Sum implements Problem {
    @Override
    public void description() {
        System.out.println("Sum of all elements in integer array?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a array");
        System.out.println("Output: sum of all elements");
    }

    @Override
    public void solve() {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + sum(array));
    }

    public int sum(int[] arr){
        int result = 0;
        for(int i: arr){
            result += i;
        }
        return result;
    }
}
