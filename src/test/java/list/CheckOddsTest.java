package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckOddsTest {

    @Test
    void solve() {
        Problem problem = new CheckOdds();
        problem.description();
        problem.solve();
    }
}