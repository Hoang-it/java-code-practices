package list;

import interfaces.Problem;

import java.util.Arrays;

public class BinarySearch implements Problem {
    @Override
    public void description() {
        System.out.println("How to implement Binary Search?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a array of number and a key");
        System.out.println("Output: sorted array");
    }

    @Override
    public void solve() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int test = 2;
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Output: " + binarySearch(arr, 0, 6, test));
    }

    public int binarySearch(int arr[], int low, int high, int key){
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] < key){
                low = mid + 1;
            } else if (arr[mid] == key){
                return mid;
            } else {
                high = mid - 1;
            }
        }
        if (low < high){
            return -1;
        }
        return -1;
    }
}
