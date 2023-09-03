package akka_practices.DataStructure.stack_operation;

public class stack_operation <T>{

    static final  int MAX_SIZE=30;
    T arr[]=(T[])new Object[MAX_SIZE];
    int top;
    stack_operation(){
        top =-1;
    }

    void push (T val){
        if (top==MAX_SIZE-1){
            throw new IndexOutOfBoundsException("stack is full ");
        }
            arr[++top]=val;
    }

    T pop (){
        if (top==-1){
            throw new IndexOutOfBoundsException("Stack Under Flow ");
        }
        return arr[top--];
    }

    T peek(){
        return arr[top];
    }

    boolean isEmpty()
    {
        return top==-1;
    }
}
