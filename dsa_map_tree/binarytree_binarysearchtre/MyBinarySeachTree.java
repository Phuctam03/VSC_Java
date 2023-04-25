package dsa_map_tree.binarytree_binarysearchtre;

public class MyBinarySeachTree {
    private TreeNode mroot;

    public MyBinarySeachTree() {
    }

    public TreeNode getMroot() {
        return mroot;
    }

    public TreeNode add(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        } else {
            TreeNode temp = root;
            while (true) {
                if (val > temp.val) {
                    if (temp.right == null) {
                        temp.right = new TreeNode(val);
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left == null) {
                        temp.left = new TreeNode(val);
                        break;
                    } else {
                        temp = temp.left;

                    }
                }
            }
            return root;
        }
    }

    // tim node con trai cung cua root (ton tai 2 node tro len)
    TreeNode findLeftNode(TreeNode root) {
        if (root == null)
            return null;
        TreeNode leftNode = root;
        while (leftNode != null) {
            leftNode = leftNode.left;
        }
        return leftNode;
    }

    public TreeNode deleteNode(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.val) {
            root.left = deleteNode(root.left, val);
        } else if (val > root.val) {
            root.right = deleteNode(root.right, val);
        } else {
            // th1 : root la node leaf;
            if (root.left == null && root.right == null)
                return null;
            // th2 : chi co 1 child root
            if (root.left != null && root.right == null) {
                return root.left;
            }
            if (root.left == null && root.right != null) {
                return root.right;
            }
            // th3 : ton tai 2 node
            TreeNode leftModeNode = findLeftNode(root.right);
            root.val = leftModeNode.val;
            root.right = deleteNode(root.right, leftModeNode.val);
        }
        return root;
    }

    TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        } else if (val > root.val) {
            return searchBST(root.right, val);
        } else {
            return root;
        }
    }

    static void preOder(TreeNode root) {
        // Node - left _ rigt
        if (root == null)
            return;
        System.out.print(root.val + " ");

        // duyet ben Trai
        preOder(root.left);
        preOder(root.right);
    }

    static void in_order(TreeNode root) {
        // Left - Node - Right
        if (root == null)
            return;

        in_order(root.left);
        System.out.print(root.val + " ");
        in_order(root.right);
    }

    static void postOrder(TreeNode root) {
        // left - right - node
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");

    }

    static int maxDepth(TreeNode root) {
        int result;
        if (root == null)
            return 0;
        else {
            int heightLeft = maxDepth(root.left);
            int heightRight = maxDepth(root.right);

            result = Math.max(heightLeft, heightRight);
        }
        return result;
    }

   
}
