package salem.datastructure.stack;

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
            peek.connect=pack;
            System.out.println(content+ " had pushed over "+ peek.data);
            peek=pack;
        }
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

    public static void main(String[] args)
    {
        StackObject stk=new StackObject();
        stk.push("vineth-ks");
        stk.push(29);
        stk.push(5.55);
        stk.push(true);

        stk.traverse();
    }
}
