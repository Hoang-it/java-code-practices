package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleArrayTest {

    @Test
    void solve() {
        Problem problem = new ShuffleArray();
        problem.description();
        problem.solve();
    }
}