package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void solve() {
        Problem problem = new Sum();
        problem.description();
        problem.solve();
    }
}