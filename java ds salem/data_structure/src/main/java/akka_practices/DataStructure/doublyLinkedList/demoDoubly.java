package akka_practices.DataStructure.doublyLinkedList;

import akka_practices.DataStructure.LinkedList.LinkedList;

import java.util.Iterator;

public class demoDoubly {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);
        list.insertAtBeginning(7);
        list.insertAtBeginning(9);

        list.display();
        System.out.println();
        list.displayReverse();
        System.out.println();

//        System.out.println(" ");
//        list.insertAtPosition(5,55);
//        list.display();

        System.out.println();
        list.deleteAtposition(0);
        list.display();
        System.out.println();
        list.displayReverse();

        System.out.println();

        for (int a : list) {
            System.out.print(a + " ");
        }
        System.out.println();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {

            System.out.print(it.next() + " ");
        }

        System.out.println();
        list.reverse();
        list.display();
        System.out.println();
        list.displayReverse();
    }
}

