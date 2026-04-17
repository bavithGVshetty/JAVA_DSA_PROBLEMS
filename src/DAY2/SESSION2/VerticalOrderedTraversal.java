package DAY2.SESSION2;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class VerticalOrderedTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(1);
        root.right.left = new TreeNode(15);

    }
}
