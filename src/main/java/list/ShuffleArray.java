package list;

import interfaces.Problem;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray implements Problem {
    @Override
    public void description() {
        System.out.println("How to Shuffle an Array in Java?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a array");
        System.out.println("Output: shuffled array");
    }

    @Override
    public void solve() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + Arrays.toString(shuffle(array)));
    }

    public int[] shuffle(int[] arr){
        Random random = new Random();
        for (int i=0; i < arr.length; i++){
            int randomIndexToSwap = random.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
