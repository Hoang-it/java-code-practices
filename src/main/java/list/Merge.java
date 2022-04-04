package list;

import interfaces.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge implements Problem {
    @Override
    public void description() {
        System.out.println("How to merge two lists in java?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: two list");
        System.out.println("Output: a list with elements from two list above");
    }

    @Override
    public void solve() {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        List<String> list2 = new ArrayList<>();
        list2.add("2");

        List<String> mergeList = new ArrayList<>(list1);
        mergeList.addAll(list2);
        System.out.println("Output" + mergeList);
    }
}
