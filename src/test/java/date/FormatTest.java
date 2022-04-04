package date;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatTest {

    @Test
    void solve() {
        Problem problem = new Format();
        problem.description();
        problem.solve();
    }
}