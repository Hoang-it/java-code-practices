package list;

import interfaces.Problem;

import java.util.*;

public class SortHashMapByValue implements Problem {
    @Override
    public void description() {
        System.out.println("How to Sort HashMap by values?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a list type hash map");
        System.out.println("output: a list type hash map ordered by value");
    }

    @Override
    public void solve() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("David", 35);
        scores.put("Jane", 45);
        scores.put("Mary", 45);
        scores.put("Lisa", 25);

        System.out.println("Input: " + scores);

        scores = sortByValue(scores);

        System.out.println("Output: " + scores);
    }

    public Map<String, Integer> sortByValue(Map<String, Integer> scores){
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();
        Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);

        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));

        for (Map.Entry<String, Integer> e : entryList){
            sortedByValue.put(e.getKey(), e.getValue());
        }
        return sortedByValue;
    }
}
