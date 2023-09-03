package salem.datastructure.stack;

import lombok.Data;


public class StackObject
{
    private class Pack{
        Object data;
        Pack connect;
    }

    private Pack peek ; // this pack have a peek is a OBJECT
    public StackObject(){
        peek=null;
    }

    public void push(Object content) {
        Pack pack = new Pack();
        pack.data = content;
        pack.connect = null;


        if (peek == null) {
            System.out.println("stack is empty ");
            peek = pack;
            System.out.println( content+ " has set as peek ");
        }
        else
        {
            System.out.println(content+ " had pushed over "+ peek.data);
        }
        peek.connect=pack;
        peek=pack;
    }

    public void traverse()
    {
        Pack explorer=new Pack();
        explorer=peek;
        while (explorer!=null)
        {
            System.out.println(explorer.data+ " is current value ");
            explorer=explorer.connect;
        }
    }

    public void pop()
    {
        if(peek==null)
        {
            System.out.println("Underflow, can't pop anything");
        }
        else {
            Object toBeDeleted=peek.data;
            peek=peek.connect;
            System.out.println(toBeDeleted+" has popped off stack ");
        }
    }

    public void clear(){
        peek=null;
        System.out.println("hole stack will cleared");
    }

    public Object getpeek(){
        return peek.data;
    }

//    public void search(Object obj ){
//        int count =0;
//        Pack explorer= new Pack();
//        explorer = peek;
//        while (explorer!=peek){
//            count++;
//            if (explorer.data.equals(obj)){
//                System.out.println(count+ " is the position where the "+ obj+"exist");
//                return;
//            }
//            explorer=explorer.connect;
//        }
//        System.out.println(obj+" not exist in the stack ");
//    }

    public void search(Object obj){
        int count=0;
        Pack explorer = new Pack();
        explorer=peek;
        while(explorer!=null){
            count++;
            if(explorer.data.equals(obj)){
                System.out.println(count+" is the poistion where the "+obj+" exists");
                return;
            }
            explorer=explorer.connect;
        }
        System.out.println(obj+" not exists in the stack");
    }

    public static void main(String[] args) {
        StackObject stk = new StackObject();
        stk.push("vinethks");
        stk.push(29);
        stk.push(5.55);
        stk.push(true);

//        stk.traverse();
//        System.out.println("..");
//        System.out.println("..");
//        stk.pop();
//        stk.traverse();


//        stk.clear();
//        stk.traverse();

        //stk.pop();
        //stk.pop();
       // System.out.println(stk.getpeek());


        stk.search("vinethks");
    }
}
