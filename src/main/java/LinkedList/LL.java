package LinkedList;
// Easyyyy manual

// singly Linked List

public class LL {
    class Node {
        String Data;
        Node next;

        Node(String Data) {
            this.Data = Data;
            this.next = null;
        }
    }

    Node head;

    //add first
    public void addFirst(String Data) {
        Node newNode = new Node(Data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add Last
    public void addLast(String Data) {
        Node newNode = new Node(Data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head; //head constant so,head k temporary currentnode banano hoi
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //print
    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.Data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");

    }

    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List empty");
        }
        head = head.next;
    }
    // deletelast


    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }
    // middleNodeDelete
    public void deleteMiddle() {
        if (head == null) {   // empty list
            return;
        }

        if (head.next == null) {   // only one node
            head = null;
            return;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow = middle node
        prev.next = slow.next;
    }

//Iteration
  public void reversIterate(){
      if(head==null || head.next==null){
          return;
      }
      Node prevNode = head;
      Node currNode = head.next;
      while(currNode !=null)

      {
          Node nextNode = currNode.next;
          currNode.next = prevNode;

          //update
          prevNode=currNode;
          currNode=nextNode;
      }
      head.next=null;
      head=prevNode;
  }

  //recursive
   public Node reverseRecursive(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node newHead =reverseRecursive(head.next);
         head.next.next=head;
         head.next=null;
         return newHead;
   }




    public static void main(String[] args) {
    LL list =new LL();

//    list.addFirst("Apple");
//    list.addFirst("An");
//    list.printlist();
//    list.addLast("is very testy");
//    list.printlist();
//    list.deleteFirst();
//    list.printlist();
//    list.deleteLast();
//    list.printlist();
       list.addLast("1");
       list.addLast("2");
       list.addLast("3");
       list.addLast("4");
       list.deleteMiddle();
       list.printlist();
     //  list.reversIterate();
      // list.printlist();
       

    }
}
