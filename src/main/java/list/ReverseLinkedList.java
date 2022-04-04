package list;

import interfaces.Problem;

import java.util.LinkedList;

public class ReverseLinkedList implements Problem {
    @Override
    public void description() {
        System.out.println("Revese a Linked List?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a list");
        System.out.println("Output: list reversed");
    }

    @Override
    public void solve() {
        LinkedList<Integer> test = new LinkedList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        LinkedList<Integer> reverseTest = new LinkedList<>();
        System.out.println("Input: " + test);
        test.descendingIterator().forEachRemaining(reverseTest::add);
        System.out.println("Output: " + reverseTest);
    }
}
