package dsa_map_tree.binarytree_binarysearchtre;

public class TestTree {

    public static void main(String[] args) {
        MyBinaryTree myTree = new MyBinaryTree();

        myTree.init();

        System.out.println("Done");
        MyBinarySeachTree myBST = new MyBinarySeachTree();

        // myBST.add(myBST.getMroot(), 5);
        // myBST.add(myBST.getMroot(), 1);
        // myBST.add(myBST.getMroot(), 6);
        // myBST.add(myBST.getMroot(), 0);
        // myBST.add(myBST.getMroot(), 3);
        // myBST.add(myBST.getMroot(), 7);
        // myBST.add(myBST.getMroot(), 2);
        // myBST.add(myBST.getMroot(), 4);

        // myBST.deleteNode(myBST.getMroot(), 1);

        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n0.left = n1;
        n0.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.right = n5;

        MyBinarySeachTree.preOder(n0);
        System.out.println();
        MyBinarySeachTree.in_order(n0);
        System.out.println();
        MyBinarySeachTree.postOrder(n0);
        System.out.println();
        System.out.println(MyBinarySeachTree.maxDepth(n0));

        System.out.println("DONE");

    }

}
