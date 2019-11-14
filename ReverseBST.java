import java.util.*;
class ReverseBST{
    Node root;
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
        ReverseBST(){
            root = null;
        }
        void insert(int data){
            root = insertRec(root,data);
        }
        Node insertRec(Node root, int data){
            if(root == null){
                root = new Node(data);
                return root;
            }
            else if(data > root.data){
                root.left = insertRec(root.left,data);
            }
            else if(data < root.data){
                root.right = insertRec(root.right,data);
            }
            return root;
        }
        public int height(Node root){
            if(root == null){
                return 0;
            }
            else{
            int lh = height(root.left); 
            int rh = height(root.right);
            if(lh > rh){
                return lh+1;
            } else{
                return rh+1;
            }
        }
    }
     void inorder()  { 
            inorderRec(root); 
         } 
       void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(" "+root.data); 
            inorderRec(root.right); 
        } 
    } 
    void printOrder(){
        int h = height(root);
        for(int i = h; i >= 1; i--){
            printLevel(root,i);
        }
    }
    void printLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.println(root.data);
        }
        else if(level > 1){
           printLevel(root.left,level-1);
           printLevel(root.right,level-1);
        }
    }
    public static void main(String args[]){
        ReverseBST tree = new ReverseBST();
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(35);
        tree.insert(70);
        tree.insert(50);
        tree.insert(80);
        System.out.println("Inorder is:");
        tree.inorder();
        System.out.println();
        System.out.println("Reverse tree is:");
        tree.printOrder();
    }
}