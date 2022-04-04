package string;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllCharacterTest {

    @Test
    void solve() {
        Problem problem = new RemoveAllCharacter();
        problem.description();
        problem.solve();
    }
}