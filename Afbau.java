import java.util.*;
class Afbau{
    Node root;
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
        Afbau(){
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
            else if(data < root.data){
                root.left = insertRec(root.left,data);
            }
            else if(data > root.data){
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
     void afbau()  { 
           afbauRec(root); 
         } 
       void afbauRec(Node root) { 
        if (root != null) { 
            System.out.print(" "+root.data); 
            afbauRec(root.left);
           afbauRec(root.right);  
        } 
    } 
    
    public static void main(String args[]){
       Afbau tree = new Afbau();
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(35);
        tree.insert(70);
        tree.insert(50);
        tree.insert(80);
        
        tree.afbau();
    }
}