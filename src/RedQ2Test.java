import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedQ2Test {

    @Test
    public void testExampleFromJavadoc() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree:
         *           12
         *         /    \
         *        6      18
         *       / \    /
         *      4   8  16
         * Expected: "tree"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(-2,
            new ListNode(9,
            new ListNode(21)))));
        TreeNode root = new TreeNode(12,
            new TreeNode(6,
                new TreeNode(4),
                new TreeNode(8)
            ),
            new TreeNode(18,
                new TreeNode(16),
                null
            )
        );
        assertEquals("tree", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testJavadocShapeListWins() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree (same shape, different values):
         *           5
         *         /   \
         *        3     4
         *       / \   /
         *      1   1 2
         * Expected: "list"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(-2,
            new ListNode(9,
            new ListNode(21)))));
        TreeNode root = new TreeNode(5,
            new TreeNode(3,
                new TreeNode(1),
                new TreeNode(1)
            ),
            new TreeNode(4,
                new TreeNode(2),
                null
            )
        );
        assertEquals("list", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testTreeSingleNodeTreeWins() {
        /*
         * List:
         *    10 -> 5 -> 5
         * Tree:
         *    10
         * Expected: "tree"
         */
        ListNode head = new ListNode(10,
            new ListNode(5,
            new ListNode(5)));
        TreeNode root = new TreeNode(10);
        assertEquals("tree", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testTreeSingleNodeTreeLoses() {
        /*
         * List:
         *    7 -> 8 -> 9
         * Tree:
         *    5
         * Expected: "list"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(9)));
        TreeNode root = new TreeNode(5);
        assertEquals("list", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testListSingleNodeTreeWins() {
        /*
         * List:
         *    5
         * Tree:
         *      10
         *     /  \
         *    8    12
         * Expected: "tree"
         */
        ListNode head = new ListNode(5);
        TreeNode root = new TreeNode(10,
            new TreeNode(8),
            new TreeNode(12)
        );
        assertEquals("tree", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testListSingleNodeTreeLoses() {
        /*
         * List:
         *    50
         * Tree:
         *      1
         *     / \
         *    2   3
         * Expected: "list"
         */
        ListNode head = new ListNode(50);
        TreeNode root = new TreeNode(1,
            new TreeNode(2),
            new TreeNode(3)
        );
        assertEquals("list", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testListExcludeFinalValueChangesAnswer() {
        /*
         * List:
         *    1 -> 2 -> 100
         * Tree:
         *    10
         * Expected: "list"
         *
         * (If you removed 100, list avg would drop below 10)
         */
        ListNode head = new ListNode(1,
            new ListNode(2,
            new ListNode(100)));
        TreeNode root = new TreeNode(10);
        assertEquals("list", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testListExcludeFirstValueChangesAnswer() {
        /*
         * List:
         *    100 -> 2 -> 1
         * Tree:
         *    10
         * Expected: "list"
         *
         * (If you removed 100, list avg would drop below 10)
         */
        ListNode head = new ListNode(100,
            new ListNode(2,
            new ListNode(1)));
        TreeNode root = new TreeNode(10);
        assertEquals("list", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testTreeExcludeRootChangesAnswer() {
        /*
         * List:
         *    10 -> 10 -> 10
         * Tree:
         *      100
         *     /   \
         *    1     1
         * Expected: "tree"
         *
         * (Without the 100, tree avg of 1 would lose to list avg of 10)
         */
        ListNode head = new ListNode(10,
            new ListNode(10,
            new ListNode(10)));
        TreeNode root = new TreeNode(100,
            new TreeNode(1),
            new TreeNode(1)
        );
        assertEquals("tree", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testTreeExcludeLeafChangesAnswer() {
        /*
         * List:
         *    10 -> 10
         * Tree:
         *      1
         *     / \
         *    1   1
         *   /
         * 100
         * Expected: "tree"
         *
         * (If you removed the 100-leaf, tree avg would drop below 10)
         */
        ListNode head = new ListNode(10,
            new ListNode(10));
        TreeNode root = new TreeNode(1,
            new TreeNode(1,
                new TreeNode(100),
                null
            ),
            new TreeNode(1)
        );
        assertEquals("tree", RedQ2.biggerAverage(head, root));
    }

    @Test
    public void testTreeMoreThanThreeLevels() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree:
         *            50
         *          /    \
         *        40      60
         *       /  \
         *     30    45
         *    /  \
         *   10   20
         * Expected: "tree"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(-2,
            new ListNode(9,
            new ListNode(21)))));
        TreeNode root = new TreeNode(50,
            new TreeNode(40,
                new TreeNode(30,
                    new TreeNode(10),
                    new TreeNode(20)
                ),
                new TreeNode(45)
            ),
            new TreeNode(60)
        );
        assertEquals("tree", RedQ2.biggerAverage(head, root));
    }
}
