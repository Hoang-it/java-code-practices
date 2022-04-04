package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void solve() {
        Problem problem = new BinarySearch();
        problem.description();
        problem.solve();
    }
}