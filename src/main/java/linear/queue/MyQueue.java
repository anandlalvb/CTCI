package linear.queue;

public class MyQueue{

  private static class QueueNode{
    private int data;
    private QueueNode next;
    public QueueNode(int data){
      this.data = data;
    }
  }

  //Both first and Last are null
  private QueueNode first;
  private QueueNode last;//Like Top in stack
  //add remove peek isEmpty

  private void add(int data){
    QueueNode node = new QueueNode(data)
    if(last != null){//Avoid first case and last always keeps the last node (unlike Stack implementation)
      last.next = node;
    }
    last = node;
    if(first == null){//Case for the first add
      first = last
    }
  }

  private void remove(){//TODO incorrect change to QUEUE
    if(first == null) throw new NoSuckElementException();
    int data = first.data//First element Data
    first = first.next
    if(first == null){
      last == null;
    }
    return data;
  }
  private void peek(){
    if(first == null) throw new NoSuckElementException();
    return first.data;
  }

  private void isEmpty(){
    return (first == null)
  }

}
