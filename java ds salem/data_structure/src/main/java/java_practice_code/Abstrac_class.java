package java_practice_code;

public class Abstrac_class {
    public static void main(String[] args) {
     HP obj = new HP();
     obj.turnOn();
    }
}

abstract class computer{
        void  turnOn(){
            System.out.println("Turning ON ");
        }
}

class HP extends computer{


}