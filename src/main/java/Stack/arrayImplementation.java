package Stack;

import java.util.Stack;

public class arrayImplementation {
    public static  class Stack{
        int[] arr=new int[5];
        private int indx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[indx]=x;
            indx++;
        }
        int peek(){
            if(indx==0){
                System.out.println("Stack is empty");
                return -1;
            }
                return arr[indx-1];
        }

        int pop() {
            if (indx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = arr[indx - 1];
            arr[indx-1]=0;
            indx--;
            return top;
        }

        void display(){
            for(int i=0;i<=indx-1;i++){
             System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return indx;
        }
        boolean isEmpty(){
            if(indx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(indx==arr.length)return true;
            else return false;
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
        st.push(5);
        st.push(7);
        st.push(8);

        st.display();
        System.out.println(st.isFull());
        st.push(10);

    }
}
