package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTest {

    @Test
    void solve() {
        Problem problem = new Merge();
        problem.description();
        problem.solve();
    }
}