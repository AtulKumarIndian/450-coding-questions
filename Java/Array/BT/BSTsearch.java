package BT;

public class BSTsearch {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(10);
        bt.left = new BinaryTree(8);
        bt.right = new BinaryTree(12);
        bt.left.left = new BinaryTree(6);
        bt.left.right = new BinaryTree(9);
        bt.right.left = new BinaryTree(11);
        bt.right.right = new BinaryTree(18);

//        preorder(bt);   //10  8  6  9  12  11  18
//        inorder(bt);    //6  8  9  10  11  12  18
//        postorder(bt);  //6  9  8  11  18  12  10
//        BinaryTree node = bstSearch(bt, 11);
//        System.out.println(findCeil(bt, 7)); // 8
//        BinaryTree ans = insertIntoBST(bt, 35);
    }

    //    LTR
    public static void inorder(BinaryTree root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    //    TLR
    public static void preorder(BinaryTree root) {
        if (root == null) return;
        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);
    }

    //    LRT
    public static void postorder(BinaryTree root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + "  ");
    }

    //search in a BST
    public static BinaryTree bstSearch(BinaryTree bt, int target) {
        while (bt != null && bt.data != target) {
            bt = bt.data > target ? bt.left : bt.right;
        }
        return bt;
    }
    //next great number
    public static int findCeil(BinaryTree bt, int value){
        int ceil = -1;
        while(bt != null){
            if(bt.data == value) return value;
            if(bt.data < value) bt = bt.right;
            else{
                ceil = bt.data; // data is bigger than value
                bt = bt.left; // sent the bt to smaller node
            }
        }
        return ceil;
    }
    public static BinaryTree insertIntoBST(BinaryTree bt, int value){
        if (bt == null) return new BinaryTree(value); //when the root is null
        BinaryTree node = bt; // we are returning root node so
        while(true){
            //if the node.data > value -- it should traverse left
            if(node.data >= value){
                //if the left is null - point the left with new Node with data = val
                if(node.left != null) node = node.left;
                else{
                    node.left = new BinaryTree(value);
                    break; // break out of loop
                }
            }
            else{
                //if node.data < val  - traverse right
                if(node.right != null) node = node.right;
                else {
                    //add the node at right and break out of loop to return root
                    node.right = new BinaryTree(value);
                    break;
                }
            }
        }
        return bt;
    }
}