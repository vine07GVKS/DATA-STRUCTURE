package java_practice_code;

public class RecursionFunction {
    public static void main(String[] args) {

        //   NORMAL METHODS OR FUNCTIONS CALL PROCESS

        System.out.println();
        System.out.println("void perameterised function");
        natFunPrint(10);
        System.out.println();
        System.out.println("void without perameterised function");
        natFunPrint2();
        System.out.println();
        System.out.println("non-void perameterised function");
        natFunPrint3(30);
        System.out.println("in main function "+ natFunPrint3(30));

        System.out.println();
        System.out.println("non-void without perameterised function");
        natFunPrint4();
        System.out.println();


        //////////////////////////////////////////////////////////////////////////////////////

        // NOW SEE THE RECURSIVE FUNCTION


        /*
            two types of recursive function
              *  Base Case
              *  Recursive Case

         */
        System.out.println("RECURSION FUNCTION");
        naturalNumber(20);

    }
    public static void natFunPrint(int n)
    {    // this method is called  " void perameterised function

            System.out.println(n);
    }

    public static void natFunPrint2()
    {    // this method is called  " void perameterised function
        int a=20;
        System.out.println(a);

    }


    public static int natFunPrint3(int b)
    {    // this method is called  " void perameterised function

            System.out.println("in natFunPrint3 function "+ b);
        return b;
    }

    public static int natFunPrint4()
    {    // this method is called  " void perameterised function
        int c = 40;
        System.out.println("in natFunPrint4 function "+ c);
        return c;
    }

/////////////////////////////////////////////   RECURSIVE FUNCTION   ///////////////////////////////////////


    public static void naturalNumber (int _n)
    {    // this method is called  " void perameterised function


        if(_n==1){  /// Base Case
            System.out.println(" "+1);
        }
        else{
            // Recursive Case

            System.out.print(" "+ _n);
            naturalNumber(_n-1);
        }
    }



}
