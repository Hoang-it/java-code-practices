package string;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {

    @Test
    void solve() {
        Problem problem = new CheckPalindrome();
        problem.description();
        problem.solve();
    }
}