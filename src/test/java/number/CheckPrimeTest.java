package number;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPrimeTest {

    @Test
    void solve() {
        Problem problem = new CheckPrime();
        problem.description();
        problem.solve();
    }
}