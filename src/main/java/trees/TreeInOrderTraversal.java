package trees;
import java.io.*;
import java.util.*;

/**
* This Class helps to check whether a tree in Symmetric (Mirron) or not
*
*/

class TreeInOrderTraversal {
  public static void main(String[] args) {
    //ArrayList<String> strings = new ArrayList<String>();
    /*for (String string : strings) {
      System.out.println(string);
    }*/


    TreeNode t1 = new TreeNode(1);
    TreeNode t1l = new TreeNode(2);
    TreeNode t1r = new TreeNode(3);
    t1.left = t1l;
    t1.right = t1r;

    TreeNode t2 = new TreeNode(1);
    TreeNode t2l = new TreeNode(2);
    TreeNode t2r = new TreeNode(3);
    t2.left = t2l;
    t2.right = t2r;

    TreeNode t2ll = new TreeNode(4);
    TreeNode t2lr = new TreeNode(5);
    t2l.left = t2ll;
    t2l.right = t2lr;

    TreeNode t2rl = new TreeNode(6);
    TreeNode t2rr = new TreeNode(7);
    t2r.left = t2rl;
    t2r.right = t2rr;

    inOrderTraversal(t2);
  }

  public static void inOrderTraversal(TreeNode a){

    //If root element is null it is Symmetric
    if(a != null) {
      inOrderTraversal(a.left);
      System.out.println(a.val);
      inOrderTraversal(a.right);
    }else{
      //Stop
    }

  }


}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
      val = x;
    }
  }
