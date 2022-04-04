package string;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckVowelTest {

    @Test
    void solve() {
        Problem problem = new CheckVowel();
        problem.description();
        problem.solve();
    }
}