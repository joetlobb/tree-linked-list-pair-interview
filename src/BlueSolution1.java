public class BlueSolution1 {
    /**
     * Given a reference to the root of a tree, return the sum of the leaf nodes with even values in the tree.
     * Do not include any odd or branch nodes.
     * 
     * Example:
     *   Tree:
     *            12
     *          /    \
     *         6      18
     *        / \    /  \
     *       4   8  16   20
     *      /              \
     *     3                22 
     *   Expected Answer: 46
     *   The leaf nodes are 3   8   16   22, and the even ones are 8   16   22.
     *   The sum of the even leaf nodes is 8+16+22 = 46
     * 
     * If the root is null, return 0.
     * @param root
     * @return
     */
    public static int evenLeafSum(TreeNode root) {
        // If the tree is empty, return 0
        if (root == null) return 0;

        // If this is a leaf node
        if (root.left == null && root.right == null) {
            // Only add its value if it's even
            if (root.data % 2 == 0) {
                return root.data;
            } else {
                return 0;
            }
        }

        // Recurse on left and right subtrees
        int leftSum = evenLeafSum(root.left);
        int rightSum = evenLeafSum(root.right);

        return leftSum + rightSum;
    }

}
