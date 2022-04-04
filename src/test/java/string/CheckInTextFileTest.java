package string;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckInTextFileTest {

    @Test
    void solve() {
        Problem problem = new CheckInTextFile();
        problem.description();
        problem.solve();
    }
}