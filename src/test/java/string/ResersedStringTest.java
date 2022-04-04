package string;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResersedStringTest {

    @Test
    void solve() {
        Problem problem = new ResersedString();
        problem.description();
        problem.solve();
    }
}