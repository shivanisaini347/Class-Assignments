import java.util.*;

public class Afbau
{
    static Node root;

    class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }

    public Node insert(Node node, int data)
    {
        if(node==null)
        {
            return new Node(data);
        }

        if(data<node.data)
        {
            if(node.left!=null)
            {
                insert(node.left, data);
            }
            else
                node.left=new Node(data);
        }
        else if(data>node.data)
        {
            if(node.right!=null)
            {
                insert(node.right, data);
            }
            else
                node.right=new Node(data);
        }
        return node;
    }

    public void add(int data)
    {
        root=insert(root, data);
    }

    public void display(Node node)
    {
        if(node!=null)
        {
			System.out.print(" "+node.data);
            display(node.left);
            display(node.right);
        }
    }

    public static void main(String args[])
    {
        Afbau bt = new Afbau();
         
        bt.add(40);
        bt.add(30);
        bt.add(20);
        bt.add(35);
        bt.add(70);
		bt.add(50);
		bt.add(80);
		
        bt.display(root);
    }
}
