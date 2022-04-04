package number;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNumberTest {

    @Test
    void solve() {
        Problem problem = new SwapNumber();
        problem.description();
        problem.solve();
    }
}