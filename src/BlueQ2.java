public class BlueQ2 {
    /**
     * Returns which has a higher range: a given linked list or a given tree.
     * The range of a data structure is the difference between its highest
     * value and its lowest value.
     * 
     * Returns "list" if the list has a higher range and "tree" if the tree has
     * a higher range. You can assume there will not be a tie, and neither head
     * nor root will be null.
     * 
     * Example:
     *   List:
     *      7 -> 8 -> -2 -> 9 -> 21
     *   Tree:
     *            12
     *          /    \
     *         6      18
     *        / \    /  
     *       4   8  16  
     *   Expected Answer: "list"
     * 
     * Explanation:
     *   The largest number in the list is 21 and -2 is the smallest.
     *   Thus the range of the list is 21 - -2 = 23
     *   The largest number in the tree is 18, and 4 is the smallest.
     *   Thus the range of the tree is 18 - 4 = 14
     *   23 is bigger than 14, so the list has the bigger range.
     *    
     * 
     * @param head the head of the list
     * @param root the root of the tree
     * @return "list" if the list has a bigger range, "tree" otherwise
     */
    public static String biggerRange(ListNode head, TreeNode root) {
        ListNode current = head;
        int listMax = head.data;
        int listMin = head.data;
        
        while (current != null) {
            if (current.data > listMax) { 
                listMax = current.data;
            } else if (current.data < listMin) {
                listMin = current.data;
            }
            current = current.next;
        }

        int listRange = listMax - listMin;
        
        int treeMax = treeMax(root);
        int treeMin = treeMin(root);

        int treeRange = treeMax - treeMin;

        return listRange > treeRange ? "list" : "tree";
    }

    private static int treeMax(TreeNode node) {
        if (node == null) return Integer.MIN_VALUE;
        int max = node.data;

        if (node.data > max) max = node.data;
        max = Math.max(max, treeMax(node.left));
        max = Math.max(max, treeMax(node.right));
        return max;
    }

    private static int treeMin(TreeNode node) {
        if (node == null) return Integer.MAX_VALUE;
        int min = node.data;

        if (node.data < min) min = node.data;
        min = Math.min(min, treeMin(node.left));
        min = Math.min(min, treeMin(node.right));
        return min;
    }
}
