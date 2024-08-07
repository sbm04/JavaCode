package Bst;

public class NodeInRange {
    public static int solveHelper(Node A, int B, int C) {
        if (A == null) {
            return 0;
        }

        int count = 0;
        int data = A.data;

        if (data >= B && data <= C) {
            count = 1; // Node value is within range

        }

        count += solveHelper(A.left, B, C);
        count += solveHelper(A.right, B, C);

        return count;
    }

    public static void main(String[] args) {
        Node A = new Node(15);
        A.left = new Node(12);
        A.right = new Node(20);
        A.left.left = new Node(10);
        A.left.right = new Node(14);
        A.left.left.left = new Node(8);
        A.right.left = new Node(16);
        A.right.right = new Node(27);


        int ans=solveHelper(A,12,20);
        System.out.println(ans);
    }
}
