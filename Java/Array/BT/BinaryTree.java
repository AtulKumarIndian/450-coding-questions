package BT;

public class BinaryTree {
    public int data;

    @Override
    public String toString() {
        return "BinaryTree{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public BinaryTree left;
    public BinaryTree right;
    public BinaryTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
