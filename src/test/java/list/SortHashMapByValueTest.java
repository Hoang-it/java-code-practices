package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortHashMapByValueTest {

    @Test
    void solve() {
        Problem problem = new SortHashMapByValue();
        problem.description();
        problem.solve();
    }
}