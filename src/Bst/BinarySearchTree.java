package Bst;

public class BinarySearchTree {

    Node node;
    public BinarySearchTree(){
        node=null;
    }
    void insert(int key){
       node=insertRec(node,key);
    }
    Node insertRec(Node node,int key){
        if(node==null){
            node= new Node(key);
        }
        if(node.data> key){
            node.left=insertRec(node.left,key);
        }
        else if(node.data< key){
            node.right=insertRec(node.right,key);
        }
        return node;

    }
    void inOrder(){
        inOrderedRec(node);
    }
    void inOrderedRec(Node node){
        if(node!=null){
            inOrderedRec(node.left);
            System.out.print(node.data + " ");
            inOrderedRec(node.right);
        }


    }

    boolean search(int key){
        return searchRec(node,key)!=null;
    }
    Node searchRec(Node node, int key){
         if(node==null || node.data==key){
             return node;

         }
         if(key < node.data){
             return searchRec(node.left,key);
         }
         else{
             return searchRec(node.right,key);
         }
    }
    void deleteNode(int b){
        node=delete(node, b);
    }
    public int max(Node A){
        Node temp=A;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp.data;

    }



    Node delete(Node A,int B){
        if (A == null) {
            return null; // base case for null nodes
        }

        if (A.data > B) {
            A.left = delete(A.left, B); // update the left child
        } else if (A.data < B) {
            A.right = delete(A.right, B); // update the right child
        } else { // A.val == B
            if (A.left == null && A.right == null) {
                return null; // if the node is a leaf, return null
            } else if (A.left == null) {
                return A.right; // if the node has only a right child, return the right child
            } else if (A.right == null) {
                return A.left; // if the node has only a left child, return the left child
            } else {
                // if the node has two children
                int v = max(A.left); // find the maximum value in the left subtree
                A.data = v; // replace the value of the node to be deleted with the max value
                A.left = delete(A.left, v); // recursively delete the max value in the left subtree
            }
        }
        return A;
    }



    public static void main(String[] args) {

        BinarySearchTree tree= new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal
        System.out.println("In-order traversal:");
        tree.inOrder();
        tree.deleteNode(50);
        System.out.println("In-order traversal after delete ");
        tree.inOrder();

        int keyToSearch = 40;
        if (tree.search(keyToSearch)) {
            System.out.println("\nKey " + keyToSearch + " found in the BST.");
        } else {
            System.out.println("\nKey " + keyToSearch + " not found in the BST.");
        }
    }
}
