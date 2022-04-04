package list;

import interfaces.Problem;

import java.util.Arrays;

public class SortArray implements Problem {
    @Override
    public void description() {
        System.out.println("Sorting an array in Java?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a array");
        System.out.println("Output: sorted array");
    }

    @Override
    public void solve() {
        int[] array = {1, 5, 2, 4, 1};
        System.out.println();
        System.out.println("Input: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Output: " + Arrays.toString(array));
    }
}
