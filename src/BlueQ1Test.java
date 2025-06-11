import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlueQ1Test {

    @Test
    public void testExampleFromJavadoc() {
        /*
         *            12
         *          /    \
         *         6      18
         *        / \    /  \
         *       4   8  16   20
         *      /              \
         *     3                22
         * Leaf nodes: 3, 8, 16, 22
         * Even leaf sum: 8 + 16 + 22 = 46
         */
        TreeNode root = new TreeNode(12,
            new TreeNode(6,
                new TreeNode(4,
                    new TreeNode(3), null),
                new TreeNode(8)
            ),
            new TreeNode(18,
                new TreeNode(16),
                new TreeNode(20,
                    null,
                    new TreeNode(22)
                )
            )
        );
        assertEquals(46, BlueQ1.evenLeafSum(root));
    }

    @Test
    public void testOddBranchNodesIgnored() {
        /*
         *            13    ← odd branch
         *          /    \
         *         7      19   ← odd branches
         *        / \    /  \
         *       4   8  16   20
         *      /              \
         *     3                22
         * Leaf nodes: 3, 8, 16, 22
         * Even leaf sum: 8 + 16 + 22 = 46
         */
        TreeNode root = new TreeNode(13,
            new TreeNode(7,
                new TreeNode(4,
                    new TreeNode(3), null),
                new TreeNode(8)
            ),
            new TreeNode(19,
                new TreeNode(16),
                new TreeNode(20,
                    null,
                    new TreeNode(22)
                )
            )
        );
        assertEquals(46, BlueQ1.evenLeafSum(root));
    }

    @Test
    public void testAllEvenLeaves() {
        /*
         *            12
         *          /    \
         *         6      18
         *        / \    /  \
         *       4   8  16   20
         *      /              \
         *     2                24
         * Leaf nodes: 2, 8, 16, 24
         * Even leaf sum: 2 + 8 + 16 + 24 = 50
         */
        TreeNode root = new TreeNode(12,
            new TreeNode(6,
                new TreeNode(4,
                    new TreeNode(2), null),
                new TreeNode(8)
            ),
            new TreeNode(18,
                new TreeNode(16),
                new TreeNode(20,
                    null,
                    new TreeNode(24)
                )
            )
        );
        assertEquals(50, BlueQ1.evenLeafSum(root));
    }

    @Test
    public void testAllOddLeaves() {
        /*
         *            12
         *          /    \
         *         6      18
         *        / \    /  \
         *       4   7  15   21
         *      /              \
         *     3                23
         * Leaf nodes: 3, 7, 15, 23
         * Even leaf sum: 0
         */
        TreeNode root = new TreeNode(12,
            new TreeNode(6,
                new TreeNode(4,
                    new TreeNode(3), null),
                new TreeNode(7)
            ),
            new TreeNode(18,
                new TreeNode(15),
                new TreeNode(21,
                    null,
                    new TreeNode(23)
                )
            )
        );
        assertEquals(0, BlueQ1.evenLeafSum(root));
    }

    @Test
    public void testSingleNodeEven() {
        /*
         *    10
         * Leaf node: 10
         * Even leaf sum: 10
         */
        TreeNode root = new TreeNode(10);
        assertEquals(10, BlueQ1.evenLeafSum(root));
    }

    @Test
    public void testSingleNodeOdd() {
        /*
         *     9
         * Leaf node:  9
         * Even leaf sum: 0
         */
        TreeNode root = new TreeNode(9);
        assertEquals(0, BlueQ1.evenLeafSum(root));
    }

    @Test
    public void testNullRoot() {
        /*
         *    (empty tree)
         * Even leaf sum: 0
         */
        assertEquals(0, BlueQ1.evenLeafSum(null));
    }

    @Test
    public void testFourLevelTree() {
        /*
         *             15
         *            /  \
         *           8    12
         *          / \   / \
         *         4   7 9  20
         *        / \      / \
         *       2   3    18  21
         * Leaf nodes: 2,3,7,9,18,21
         * Even leaf sum: 2 + 18 = 20
         */
        TreeNode root = new TreeNode(15,
            new TreeNode(8,
                new TreeNode(4,
                    new TreeNode(2),
                    new TreeNode(3)
                ),
                new TreeNode(7)
            ),
            new TreeNode(12,
                new TreeNode(9),
                new TreeNode(20,
                    new TreeNode(18),
                    new TreeNode(21)
                )
            )
        );
        assertEquals(20, BlueQ1.evenLeafSum(root));
    }
}
