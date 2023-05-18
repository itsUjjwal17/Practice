import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes in the tree: ");
        int n = sc.nextInt();
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of node " + (i + 1) + ": ");
            int val = sc.nextInt();
            root = insert(root, val);
    }
}

    Solution solution = new Solution();
List<Integer> result = solution.postorderTraversal(root);
System.out.println(result);

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(result);
        return result;
    }

    // Example usage with input:

}