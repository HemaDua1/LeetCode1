package Trees;

import java.util.Scanner;

public class Binary_tree{
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    private Node root=null;
    private static Scanner sc=new Scanner(System.in);
    public Node createTree(){
        int data=sc.nextInt();
        Node node=new Node(data);
        int doesleftchildpresent=sc.nextInt();
        if(doesleftchildpresent==1){
            node.left=createTree();
        }

    }   
}