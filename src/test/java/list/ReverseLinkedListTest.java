package list;

import interfaces.Problem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void solve() {
        Problem problem = new ReverseLinkedList();
        problem.description();
        problem.solve();
    }
}