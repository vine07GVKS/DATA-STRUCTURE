package akka_practices.DataStructure.stack_operation;

import java.sql.Array;
import java.util.*;

public class demo_stack extends stack_operation
{
    public static void main(String[] args) {
          stack_operation<Integer> stack = new stack_operation<Integer>();

          stack.push(3);
          stack.push(5);
          stack.push(6);
          stack.push(7);
          stack.push(9);
          stack.push(10);
        System.out.println("popped " +stack.pop());
        System.out.println("pushed " +stack.isEmpty());
        System.out.println("popped " +stack.peek());
        System.out.println("popped " +stack.isEmpty());

    }
}
