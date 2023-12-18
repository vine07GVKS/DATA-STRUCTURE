package java_practice_code;



class UserDefined extends Exception
{
    UserDefined(String str){
        super(str);  //  invoke the date from the Exception function block ------->   using the extends keyword from the data Exception
    }
}



public class ExceptionHandling
{

    static void check( int age ){
        if (age<18) {
            throw new ArithmeticException(" age invalid ");
        }
    }
    public static void main(String[] args) {
        try {
            check(17);
        }
        catch (ArithmeticException E){
            System.out.println(E.getMessage());
        }
    }
}


