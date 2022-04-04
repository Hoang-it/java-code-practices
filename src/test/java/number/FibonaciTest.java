package number;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonaciTest {

    @Test
    void solve() {
        Problem problem = new Fibonaci();
        problem.description();
        problem.solve();
    }
}