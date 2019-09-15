import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class TreeSameTree {
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

    TreeNode t2rl = new TreeNode(4);
    TreeNode t2rr = new TreeNode(5);
    t2r.left = t2rl;
    t2r.right = t2rr;


    System.out.println("isSameTree:: "+ isSameTree(t1, t2));
  }

  public static boolean isSameTree(TreeNode a, TreeNode b){

    /*If both nodes are null, the trees are same */
    if(a == null && b == null){
      return true;
    }

    /* If one of the node is null and another is not,
      then they are not the same
    */
    if(a == null || b == null){
      return false;
    }

    // If node values are not equal, they are different
    if(a.val != b.val){
      return false;
    }

    //Node values are equal, continue with child nodes
    return isSameTree(a.left, b.left)
        && isSameTree(a.right, b.right);
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
