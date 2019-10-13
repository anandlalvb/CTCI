package trees;

import java.util.EmptyStackException;

public class MyStack{

  private static class StackNode{
    private int data;
    private StackNode next;
    public StackNode(int data){
      this.data = data;
    }
  }

  private StackNode top;

  private int pop(){
    if(top == null ) throw new EmptyStackException();
    //Remove last node
    int data = top.data;
    //Assign second last to top top = ?
    top = top.next;
    return data;
  }

  private void push(int data){
    StackNode node = new StackNode(data);
    node.next = top;
    top = node;
  }

  private int peek(){
    if(top == null ) throw new EmptyStackException();
    return top.data;
  }

  private boolean isEmpty(){
    return (top == null);
  }

  public static void main(String[] args) {
    MyStack myStack = new MyStack();
    myStack.push(1);
    System.out.println("Peek: "+myStack.peek());
    myStack.push(2);
    System.out.println("Peek Before Pop: "+myStack.peek());
    System.out.println("Pop: "+myStack.pop());
    System.out.println("Peek After Pop: "+myStack.peek());
    myStack.push(3);
    System.out.println("Peek: "+myStack.peek());
    myStack.push(4);
    System.out.println("Peek: "+myStack.peek());
    myStack.push(5);
    System.out.println("Peek: "+myStack.peek());

  }
}
