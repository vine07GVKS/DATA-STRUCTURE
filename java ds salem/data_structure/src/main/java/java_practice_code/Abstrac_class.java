package java_practice_code;

import java.util.Collections;

public class Abstrac_class {
    public static void main(String[] args) {
     HP obj = new HP();
     obj.turnOn();
     obj.turnOff();
     Dell obj1 =new Dell();
     obj1.turnOn();
     obj1.turnOff();
    }
}

abstract class computer{

    abstract void turnOff();  // this only function part ----- deceleration part will be defined the other classes

        void  turnOn(){
            System.out.println("Turning ON ");
        }
}

class HP extends computer{

    @Override
    void turnOn() {
        System.out.println("Turning ON HP");
    }

    @Override
    void turnOff()   // this is deceleration classes in for turnOFF method
    {  //to call the abstract function using inside of the method in class
        System.out.println("Turning OFF HP");
    }
}

class Dell extends computer{

    void turnOn() {
        System.out.println("Turning ON DELL");
    }

    @Override
    void turnOff()
    {  //to call the abstract function using inside of the method in class
        System.out.println("Turning OFF DELL");
    }
}
