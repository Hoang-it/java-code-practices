package list;

import interfaces.Problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SameElement implements Problem {
    @Override
    public void description() {
        System.out.println("Check if two arrays contains same elements?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: two arrays");
        System.out.println("Output: boolean");
    }

    @Override
    public void solve() {
        Integer[] a = {1,2,3,4,5};
        Integer[] b = {1,2,3,4,5};
        Integer[] c = {3,4,5};
        System.out.println("Input: " + Arrays.toString(a) + ", " + Arrays.toString(b));
        System.out.println("Output: " + sameElement(a, b));
        System.out.println("Input: " + Arrays.toString(a) + ", " + Arrays.toString(c));
        System.out.println("Output: " + sameElement(a, c));
    }

    public boolean sameElement(Object[] object1, Object[] object2){
        Set<Object> uniElement1 = new HashSet<>(Arrays.asList(object1));
        Set<Object> uniElement2 = new HashSet<>(Arrays.asList(object2));

        if (uniElement1.size() != uniElement2.size()) return false;
        for (Object obj : uniElement1){
            if (!uniElement2.contains(obj)) return  false;
        }
        return true;
    }
}
