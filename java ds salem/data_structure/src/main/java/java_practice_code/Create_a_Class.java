package java_practice_code;

import javax.lang.model.element.Name;

public class Create_a_Class {
        String Name ;
        int roll_num;

    public void Display(){   // constructor method
        System.out.println(Name);
        System.out.println(roll_num);

    }

    public void setValues (String str, int num){
        Name = str;
        roll_num = num;
    }


 class Main{
        public static void main(String[] args) {

            Create_a_Class STD = new Create_a_Class();
            STD.setValues("Vineth k s ",20908);     // parameter passing to setValue function
//            STD.Name= "vineth k s";
//            STD.roll_num = 20908;
            STD.Display();

            System.out.println();

            STD.Name="jeeva";    // parameters initialize
            STD.roll_num= 5556;
            STD.Display();


        }
    }

}
