package list;

import interfaces.Problem;

import java.util.ArrayList;
import java.util.List;

public class CheckOdds implements Problem {
    @Override
    public void description() {
        System.out.println("Check if a List of integers contains only odd numbers?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a list of number");
        System.out.println("Output: a boolean");
    }

    @Override
    public void solve() {
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("======SOVLE=======");
        System.out.println("Input: " + a.toString());
        System.out.println("Output: " + onlyOddNumber(a));

    }

    public boolean onlyOddNumber(List<Integer> list){
        return list.parallelStream().anyMatch(x -> x % 2 != 0);
    }
}
