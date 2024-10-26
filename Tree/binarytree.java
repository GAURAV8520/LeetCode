/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    public Node(int d){
        data=d;
        left=null;
        right=null;
    }
}

public class Main
{
    
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
        
    }
    
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    
    public static Node insertNode(Node root,int d){
        if(root==null){
            return new Node(d);
        }
        
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        
        
        while(!qu.isEmpty()){
            Node root1=qu.poll();
            
            if(root1.left==null){
                root1.left=new Node(d);
                break;
            }else{
                qu.add(root1.left);
            }
            
            if(root1.right==null){
                root1.right=new Node(d);
                break;
            }
            else{
                qu.add(root1.right);
            }
            
        }
        
        return root;
            
            
        
    }
    
    public static void bfs(Node root){
        if(root==null){
            return;
        }
        
        Queue<Node>qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            Node r=qu.poll();
            
            System.out.print(r.data);
            if(r.left!=null){
                qu.add(r.left);
            }
            if(r.right!=null){
                qu.add(r.right);
            }
            
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
        Node root=new Node(2);
        Node lroot=new Node(3);
        Node rroot=new Node(4);
        Node llroot=new Node(5);
        
        root.right=rroot;
        root.left=lroot;
        lroot.left=llroot;
        
        
        //inorder(root);
        //preorder(root);
        //postorder(root);
        insertNode(llroot,6);
        //postorder(root);
        //inorder(root);
        
        bfs(root);
	}
}
