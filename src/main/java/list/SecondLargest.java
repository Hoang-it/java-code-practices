package list;

import interfaces.Problem;

import java.util.Arrays;

public class SecondLargest implements Problem {
    @Override
    public void description() {
        System.out.println("Find second largest number in an array?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a array");
        System.out.println("Output: second largest number in array");
    }

    @Override
    public void solve() {
        int[] test = {1, 2, 3, 4, 5};
        System.out.println("Input: " + Arrays.toString(test));
        System.out.println("Output: " + findSecondNumber(test));

    }

    public int findSecondNumber(int[] arr){
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i : arr){
            if (i > highest){
                second = highest;
                highest = i;
            } else if (i > second){
                second = i;
            }
        }
        return second;
    }
}
