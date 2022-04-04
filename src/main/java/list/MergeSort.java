package list;

import interfaces.Problem;

import java.util.Arrays;

public class MergeSort implements Problem {
    @Override
    public void description() {
        System.out.println("Merge Sort in Java?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: an array");
        System.out.println("Output: sorted array");
    }

    @Override
    public void solve() {
        int[] arr = { 70, 50, 30, 10, 20, 40, 60 };
        System.out.println("Input: " + Arrays.toString(arr));
        int[] merged = mergeSort(arr, 0, arr.length - 1);
        System.out.println("Output: " + Arrays.toString(arr));

    }

    public int[] mergeTwoSortedArray(int[] one, int[] two){
        int[] sorted = new int[one.length + two.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < one.length && j < two.length){
            if (one[i] < two[j]){
                sorted[k] = one[i];
                k++;
                i++;
            } else {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        if (i == one.length){
            while (j < two.length){
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        if (j == two.length){
            while (i < one.length){
                sorted[k] = one[i];
                k++;
                i++;
            }
        }
        return sorted;
    }

    public int[] mergeSort(int[] arr, int lo, int hi){
        if (lo == hi){
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }
        int mid = (lo + hi) / 2;

        int[] fh = mergeSort(arr, lo, mid);
        int[] sh = mergeSort(arr, mid + 1, hi);
        int[] merge = mergeTwoSortedArray(fh, sh);

        return merge;

    }
}
