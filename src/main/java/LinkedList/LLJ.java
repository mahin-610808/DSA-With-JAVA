package LinkedList;

import java.util.*;

public class LLJ {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());
        for( int i=0;i< list.size();i++){

            System.out.print(list.get(i) + " ->");
        }
        System.out.println("NUll");
    }
}
