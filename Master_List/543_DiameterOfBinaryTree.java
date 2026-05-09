/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return maxDiameter;
    }

    public int calculateHeight(TreeNode root)
    {

        if(root == null) return 0;

        int HeightLeft = calculateHeight(root.left);
        int HeightRight = calculateHeight(root.right);

        maxDiameter = Math.max(maxDiameter , HeightLeft + HeightRight);

        return Math.max(HeightLeft , HeightRight) + 1;
    }
}