package java_practice_code;



class UserDefined extends Exception
{
    UserDefined(String str){
        super(str);  //  invoke the date from the Exception function block ------->   using the extends keyword from the data Exception
    }
}



public class ExceptionHandling
{

    static void check( int age ) throws UserDefined,ArithmeticException,NumberFormatException {    // when userDefined Exception is created means use the throws keyword in the above the class
                                                        // to give the function definition on the userDefined exception
                                                        // this THROWS keyword basically working on the catch keyword processing and handel the whole function the entire function
        if (age<18) {
            throw new UserDefined(" age invalid ");  // this throw keyword used to the handle exception in the error function
        }
        else {
            throw new ArithmeticException(" Age valid");
        }
    }
    public static void main(String[] args) {
        try {
            check(22);
        }
        catch (UserDefined | ArithmeticException | NumberFormatException E){  // " E " is the object
            System.out.println(E.getMessage());
        }
    }
}