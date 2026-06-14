package Stack;

public class LLWithStack {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Stack{
      private   Node head=null;
        private int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if(head==null){
            System.out.println("Stack is empty!");
            return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.val;
        }
        void displayrec(Node h){
            if(h==null) return;
          displayrec(h.next);
            System.out.print(h.val+"");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayrev(){
            Node temp=head;
            while(temp != null){
                System.out.println(temp.val);
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }

        public boolean isFull() {
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(5);
        st.push(9);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println("After Add Element");
        st.push(6);
        st.push(7);
        st.push(8);
        st.display();
        System.out.println(st.isFull());
        st.push(10);
    }
}
