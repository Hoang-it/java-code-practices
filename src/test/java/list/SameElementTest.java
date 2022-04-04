package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameElementTest {

    @Test
    void solve() {
        Problem problem = new SameElement();
        problem.description();
        problem.solve();
    }
}