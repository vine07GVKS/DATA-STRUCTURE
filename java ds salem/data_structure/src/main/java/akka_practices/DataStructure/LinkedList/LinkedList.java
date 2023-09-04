package akka_practices.DataStructure.LinkedList;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList <T> implements Iterable<T>{
 Node head;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp=head;
            @Override
            public boolean hasNext() {
                return temp!=null;
            }

            @Override
            public T next() {
                T val=temp.data;
                temp=temp.Next;
                return val;
            }
        };
    }

//    @Override
//    public void forEach(Consumer<? super T> action) {
//        Iterable.super.forEach(action);
//    }

    class Node{
        T data ;
        Node Next;
        Node(T val ){
            data=val;
            Next=null;
        }
    }

    LinkedList(){
        head = null;

    }

   public void insertAtBeginning(T val) {
    Node newNode = new Node(val);

    // when list is empty
       if (head == null ){
           head = newNode;
       }
       else {  // list is not empty
          newNode.Next=head;
          head=newNode;
       }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.Next;
        }
    }

    public void insertAtPosition (int pos ,T val ) throws IllegalAccessException {

        if (pos==0){
            insertAtBeginning(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        for (int i= 1 ; i<pos;i++){
            temp = temp.Next;
            if (temp == null){
                throw new IllegalAccessException("invalid position "+ pos );
            }
        }
        newNode.Next=temp.Next;
        temp.Next= newNode;

    }


    public void deleteAtposition(int pos){
        if (head==null) {
            throw new IndexOutOfBoundsException("list is empty");
        }
        if (pos==0){
            head=head.Next;
            return;
        }


        Node temp = head;
        Node prev = null;

        for (int i=1 ;i<=pos;i++) {
            prev = temp;
            temp = temp.Next;
        }
        assert prev != null;
        prev.Next=temp.Next;
        }

        public void deleteAtBegning(){

            if (head==null){
                throw new IndexOutOfBoundsException("list is empty ");
            }
            head=head.Next;

        }

        public  void reverse(){
        Node prev= null;
        Node current = head;
        Node next= head.Next;

        while (current!=null){
            next=current.Next;
            current.Next=prev;  // reverse link
            prev=current;
            current=next;
        }
        head=prev;


        }

}