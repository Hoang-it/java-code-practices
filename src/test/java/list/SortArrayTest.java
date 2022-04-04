package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    @Test
    void solve() {
        Problem problem = new SortArray();
        problem.description();
        problem.solve();
    }
}