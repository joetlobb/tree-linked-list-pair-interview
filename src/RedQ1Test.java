import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedQ1Test {

    @Test
    public void testExampleFromJavadoc() {
        /*
         * Example:
         *   4 -> 8 -> 15 -> 16 -> 23 -> 42 -> 11 -> 29 -> 34
         * Odd‐index sum = 8 + 16 + 42 + 29 = 95
         */
        ListNode head = new ListNode(4,
            new ListNode(8,
            new ListNode(15,
            new ListNode(16,
            new ListNode(23,
            new ListNode(42,
            new ListNode(11,
            new ListNode(29,
            new ListNode(34)))))))));
        assertEquals(95, RedQ1.oddIndexSum(head));
    }

    @Test
    public void testOddNumberOfNodes() {
        /*
         * List:
         *   5 -> 10 -> 3 -> 8 -> 2
         * Odd‐index sum = 10 + 8 = 18
         */
        ListNode head = new ListNode(5,
            new ListNode(10,
            new ListNode(3,
            new ListNode(8,
            new ListNode(2)))));
        assertEquals(18, RedQ1.oddIndexSum(head));
    }

    @Test
    public void testEvenNumberOfNodes() {
        /*
         * List:
         *   7 -> 14 -> 1 -> 9
         * Odd‐index sum = 14 + 9 = 23
         */
        ListNode head = new ListNode(7,
            new ListNode(14,
            new ListNode(1,
            new ListNode(9))));
        assertEquals(23, RedQ1.oddIndexSum(head));
    }

    @Test
    public void testNullHead() {
        /*
         * List:
         *   (empty)
         * Odd‐index sum = 0
         */
        assertEquals(0, RedQ1.oddIndexSum(null));
    }

    @Test
    public void testSingleNode() {
        /*
         * List:
         *   42
         * Odd‐index sum = 0
         */
        ListNode head = new ListNode(42);
        assertEquals(0, RedQ1.oddIndexSum(head));
    }

    @Test
    public void testNegativeValues() {
        /*
         * List:
         *   2 -> -5 -> 8 -> -1 -> 3 -> -4
         * Odd‐index sum = -5 + -1 + -4 = -10
         */
        ListNode head = new ListNode(2,
            new ListNode(-5,
            new ListNode(8,
            new ListNode(-1,
            new ListNode(3,
            new ListNode(-4))))));
        assertEquals(-10, RedQ1.oddIndexSum(head));
    }
}
