package linked_list.singly_linked_list;

import java.util.LinkedList;

public class SingleyLinkedList {
    Node head;
   private int size;

   public int getSize(){
       return size;
   }

    public class Node{
        String data;
        Node next;

        Node(){
            data = null;
            next = null;
        }
    }
    SingleyLinkedList(){
        size = 0;
    }

    public void addFirst(String data){
        Node node = new Node();
        node.data = data;
        if (head != null) {
            node.next = head;
        }
        head = node;
        size++;
    }

    public void addLast(String data){
        Node node = new Node();
        node.data = data;
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    //traversing
    public void traverseLinkList(){
        Node currentNode = head;
        if(currentNode == null){
            System.out.println("List is empty");
            return;
        }
        for(int i =0; i< getSize();i++){
            System.out.print(currentNode.data+"-->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        SingleyLinkedList sl = new SingleyLinkedList();
        sl.addFirst("World");
        sl.addFirst("Hello");
        sl.traverseLinkList();
        System.out.println(sl.size);
    }
}
