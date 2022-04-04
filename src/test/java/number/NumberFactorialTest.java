package number;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFactorialTest {

    @Test
    void solve() {
        Problem problem = new NumberFactorial();
        problem.description();
        problem.solve();
    }
}