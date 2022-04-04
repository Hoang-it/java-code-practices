package string;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveTrailingSpaceTest {

    @Test
    void solve() {
        Problem problem = new RemoveTrailingSpace();
        problem.description();
        problem.solve();
    }
}