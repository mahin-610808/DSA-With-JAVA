package LinkedList;

//package LinkedList;
public class doubly {
   static class Node{

        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.next=prev=null;
        }
    }
    //shamne

    public static void display(Node head){
       Node temp=head;
       while(temp != null){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
        System.out.println();
    }
    // previous
   public static void displayprev(Node tail){
       Node temp=tail;
       while(temp != null){
           System.out.print(temp.val+" ");
           temp=temp.prev;
       }
       System.out.println();
   }

   //random

   public static void displayrandom(Node random){
       Node temp=random;
       while(temp.prev != null){
          // System.out.print(temp.val+" ");
           temp=temp.prev;
       }
       while(temp != null){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
       System.out.println();
   }

   public static Node inserthead(Node head,int val){
       Node newNode= new Node(val);
       newNode.next=head;
       head=newNode;
       return head;
   }

   public static void insertTail(Node head,int val){
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       Node newNode =new Node(val);
       temp.next=newNode;
       newNode.prev=temp;
       temp=newNode;
   }
   // middle add
    public static void insertMiddleIndex(Node head,int indx,int val){
       Node temp=head;
       for(int i=1;i<=indx-1;i++){
           temp=temp.next;
       }
       Node nextNode =temp.next;
       Node newNode=new Node(val);
       temp.next=newNode;
       newNode.prev=temp;
       newNode.next=nextNode;
       nextNode.prev=newNode;
       temp=newNode;
    }
    //first deletion
    public static Node firstDelete(Node head){
      if(head==null || head.next==null){
          return null;
      }
       head=head.next;
       head.prev=null;
       return head;
    }

    //last deletion
    public static Node lastDelete(Node head){
       if(head==null || head.next==null){
           return null;
       }
       Node temp=head;
       while(temp.next != null){
           temp=temp.next;

       }
        temp=temp.prev; //laster node theke 2nd last node temp nie ashlam
        temp.next=null;//mne laster node null
        return head;
    }

    //middle deletion
    public static Node middleDelete(Node head,int index){
       Node temp=head;
       for(int i=1;i<=index-1;i++){
           temp=temp.next;
       }
       temp.next=temp.next.next;
       temp.next.prev=temp;
       return head;
    }

    public static void main(String[] args) {
     Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        Node head=middleDelete(a,2);
        display(head);
//       Node head= lastDelete(a);
//        display(head);
//       Node head=firstDelete(a);
//        display(head);
//        insertTail(a,90);
//        display(a);
        //displayprev(e);
       // displayrandom(c);
//        Node newHead=inserthead(a,30);
//        display(newHead);
//        insertMiddleIndex(a,3,100);
//        display(a);

    }
}
