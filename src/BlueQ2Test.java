import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlueQ2Test {

    @Test
    public void testExampleFromJavadoc() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree:
         *          12
         *        /    \
         *       6      18
         *      / \    /
         *     4   8  16
         * Expected: "list"
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
        assertEquals("list", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testJavadocShapeTreeWins() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree (same structure, values changed):
         *          50
         *        /    \
         *       10     60
         *      / \   /
         *     20  30 55
         * Expected: "tree"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(-2,
            new ListNode(9,
            new ListNode(21)))));
        TreeNode root = new TreeNode(50,
            new TreeNode(10,
                new TreeNode(20),
                new TreeNode(30)
            ),
            new TreeNode(60,
                new TreeNode(55),
                null
            )
        );
        assertEquals("tree", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testTreeSingleNode() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree:
         *    100
         * Expected: "list"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(-2,
            new ListNode(9,
            new ListNode(21)))));
        TreeNode root = new TreeNode(100);
        assertEquals("list", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testListSingleNode() {
        /*
         * List:
         *    42
         * Tree:
         *          12
         *        /    \
         *       6      18
         *      / \    /
         *     4   8  16
         * Expected: "tree"
         */
        ListNode head = new ListNode(42);
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
        assertEquals("tree", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testListFinalValueSmallest() {
        /*
         * List:
         *    7 -> 8 -> 9 -> 21 -> -10
         * Tree:
         *          12
         *        /    \
         *       6      18
         *      / \    /
         *     4   8  16
         * Expected: "list"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(9,
            new ListNode(21,
            new ListNode(-10)))));
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
        assertEquals("list", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testListFinalValueBiggest() {
        /*
         * List:
         *    -5 -> 2 -> 0 -> 1 -> 99
         * Tree:
         *          12
         *        /    \
         *       6      18
         *      / \    /
         *     4   8  16
         * Expected: "list"
         */
        ListNode head = new ListNode(-5,
            new ListNode(2,
            new ListNode(0,
            new ListNode(1,
            new ListNode(99)))));
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
        assertEquals("list", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testTreeRootSmallest() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree:
         *          1
         *        /    \
         *       6      18
         *      / \    /
         *     4   8  16
         * Expected: "list"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(-2,
            new ListNode(9,
            new ListNode(21)))));
        TreeNode root = new TreeNode(1,
            new TreeNode(6,
                new TreeNode(4),
                new TreeNode(8)
            ),
            new TreeNode(18,
                new TreeNode(16),
                null
            )
        );
        assertEquals("list", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testTreeRootBiggest() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree:
         *          30
         *        /    \
         *       6      18
         *      / \    /
         *     4   8  16
         * Expected: "tree"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(-2,
            new ListNode(9,
            new ListNode(21)))));
        TreeNode root = new TreeNode(30,
            new TreeNode(6,
                new TreeNode(4),
                new TreeNode(8)
            ),
            new TreeNode(18,
                new TreeNode(16),
                null
            )
        );
        assertEquals("tree", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testTreeLeafSmallest() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree:
         *          12
         *        /    \
         *       6      18
         *      / \    /
         *     4   8  16
         * (leaf 4 is the smallest)
         * Expected: "list"
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
        assertEquals("list", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testTreeLeafBiggest() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree:
         *          12
         *        /    \
         *       6      18
         *      / \    /
         *     4   8  20   (leaf 20 is the largest)
         * Expected: "list"
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
                new TreeNode(20),
                null
            )
        );
        assertEquals("list", BlueQ2.biggerRange(head, root));
    }

    @Test
    public void testTreeMoreThanThreeLevels() {
        /*
         * List:
         *    7 -> 8 -> -2 -> 9 -> 21
         * Tree:
         *               100
         *              /   \
         *            50     80
         *           /  \
         *         20    75
         *        /
         *       10
         * Expected: "tree"
         */
        ListNode head = new ListNode(7,
            new ListNode(8,
            new ListNode(-2,
            new ListNode(9,
            new ListNode(21)))));
        TreeNode root = new TreeNode(100,
            new TreeNode(50,
                new TreeNode(20,
                    new TreeNode(10),
                    null
                ),
                new TreeNode(75)
            ),
            new TreeNode(80)
        );
        assertEquals("tree", BlueQ2.biggerRange(head, root));
    }
}
