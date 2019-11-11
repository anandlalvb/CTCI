package nonlinear.tree;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

 class Node {
       int data;
       Node left;
       Node right;

       public Node(int num) {
         this.data = num;
         this.left = null;
         this.right = null;
       }

}

class BST {
public static void main(String[] args) {

    BST sol = new BST();

    //Node root = sol.insert(null, 8);

    /*sol.insert(root, 10);
    sol.insert(root, 9);
    sol.insert(root, 2);
    sol.insert(root, 3);
    sol.insert(root, 1);
    sol.insert(root, 7);
    sol.insert(root, 6);*/


    /*Node root = sol.insert(null, 100);
    int[] elements = {20, 15, 200, 25, -5, 0,  20, 12, 126, 1000, -150};//100,
    for(int element:elements){
      sol.insert(root, element);
    }*/
    Node root = sol.insert(null, 2);
    int[] elements = {1, 3};
    for(int element:elements){
      sol.insert(root, element);
    }

    System.out.println("DFS");
    System.out.print("IN   ORDER: ");
    sol.traverseInOrder(root);
    System.out.println();
    System.out.print("PRE  ORDER: ");
    sol.traversePreOrder(root);
    System.out.println();
    System.out.print("POST ORDER: ");
    sol.traversePostOrder(root);
    System.out.println();

    System.out.println("BFS");
    System.out.println("LEVEL ORDER: ");
    sol.traverseLevelOrder(root);
  }

  public Node insert(Node root, int data){
    if(root == null ) {
      root = new Node(data);
      //System.out.print(data + " ");
    }else{
      if(data < root.data){
        root.left = insert(root.left, data);
      }else{
        root.right = insert(root.right, data);
      }
    }
    return root;
  }

  public void traverseInOrder(Node root){
    if(root != null){
      traverseInOrder(root.left);
      System.out.print(root.data + " ");
      traverseInOrder(root.right);
    }
  }

  public void traversePreOrder(Node root){
    if(root != null){
      System.out.print(root.data + " ");
      traversePreOrder(root.left);
      traversePreOrder(root.right);
    }
  }

  public void traversePostOrder(Node root){
    if(root != null){
      traversePreOrder(root.left);
      traversePreOrder(root.right);
      System.out.print(root.data + " ");
    }
  }


  public void traverseLevelOrder(Node root){
    if(root != null){
      ArrayList<Node> nodes = new ArrayList<>();
      nodes.add(root);
      ArrayList<Integer> inOrderList = printAndChilds(nodes);
      System.out.println("Traverse LevelOrder ");
      for(int data: inOrderList){
        System.out.println(data);
      }
    }
  }

  private ArrayList<Integer> printAndChilds(ArrayList<Node> nodes){
    ArrayList<Integer> inOrderList = new ArrayList<>();
    ArrayList<Node> childs = new ArrayList<>();
    if(nodes != null && !nodes.isEmpty()){
      for(Node node: nodes){
        if(node != null){
          //System.out.println(node.data);
          inOrderList.add(node.data);
          childs.add(node.left);
          childs.add(node.right);
        }
      }
      if(!childs.isEmpty()) inOrderList.addAll(printAndChilds(childs));
    }
    return inOrderList;
  }


}

/*
Your previous Plain Text content is preserved below:

This is a sandbox to experiment with CoderPad's execution capabilities.
It's a temporary, throw-away session only visible to you.

This is just a simple shared plaintext pad, with no execution capabilities.

When you know what language you'd like to use for your interview,
simply choose it from the dropdown in the top bar.

You can also change the default language your pads are created with
in your account settings: https://coderpad.io/settings

Enjoy your interview!

 */
