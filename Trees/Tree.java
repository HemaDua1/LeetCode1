package Trees;
import java.util.*;
public class Tree {
   Scanner sc=new Scanner(System.in); 
public class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val=val;
    }
    public Node(){
        this.val=0;
    }
}
private Node root=null;
public void createTree(){
    root=createTree(this.root);
}
private Node createTree(Node root){
int data=sc.nextInt();
Node nn=new Node(data);
boolean hls=sc.nextBoolean();
if(hls){
  nn.left=createTree(nn);
}
boolean hrs=sc.nextBoolean();
if(hrs){
    nn.right=createTree(nn);
}
return nn;
}
public void Display(){
    // display(this.root);
    System.out.println("PreOrder");
    preorder(this.root);
    System.out.println();
    System.out.println("PostOder");
    postorder(this.root);
    System.out.println();
    System.out.println("Inorder");
    inorder(this.root);
}
//preorder using recursion
private void display(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.val+" ");
    display(root.left);
    display(root.right);
}
//preorder using loop
public void preorder(Node root){
if(root==null){
    return;
}
Stack<Node> st=new Stack<>();
st.push(root);
while(!st.isEmpty()){
    Node n=st.pop();
    System.out.print(n.val+" ");
    if(n.right!=null)
    st.push(n.right);
    if(n.left!=null)
    st.push(n.left);
}
}
public void postorder(Node root){
    if(root==null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.val+" ");
}
public void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.val+" ");
    inorder(root.right);
}
}