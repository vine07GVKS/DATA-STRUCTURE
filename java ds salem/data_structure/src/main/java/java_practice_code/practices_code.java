package java_practice_code;

import java.util.Arrays;
import java.util.Scanner;

public class practices_code
{

//    public static void sample_constructor(String a, int b ){
//
//        System.out.println(a+b);
//    }
    public static void main(String[] args)
    {

        // fibonacci series
        int num1=0,num2=1,lengthOfSeries,nextnum;
        System.out.println("Enter the length of the series");
        Scanner scan=new Scanner(System.in);
        lengthOfSeries=scan.nextInt();
        scan.close();
        for(int i=0;i<lengthOfSeries;i++)
        {
            System.out.print(num1+"  ");
            nextnum=num1+num2;
            num1=num2;
            num2=nextnum;
          }

//        String spliting =new String("i'm vineth ks full stack java developer ");
//        System.out.println(spliting);
//        String spliting1[]=spliting.split(" ");
//        System.out.println(Arrays.toString(spliting1));


//        practices_code obj = new practices_code();
//
//     sample_constructor("vine",20);


    }
}
