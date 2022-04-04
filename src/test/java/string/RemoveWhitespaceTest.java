package string;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveWhitespaceTest {

    @Test
    void solve() {
        Problem problem = new RemoveWhitespace();
        problem.description();
        problem.solve();
    }
}