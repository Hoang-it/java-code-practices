package thread;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateDeadlockTest {

    @Test
    void solve() {
        Problem problem = new CreateDeadlock();
        problem.description();
        problem.solve();
    }
}