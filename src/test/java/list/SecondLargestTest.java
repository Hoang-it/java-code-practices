package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    @Test
    void solve() {
        Problem problem = new SecondLargest();
        problem.description();
        problem.solve();
    }
}