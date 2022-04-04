package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void solve() {
        Problem problem = new MergeSort();
        problem.description();
        problem.solve();
    }
}