package java_practice_code;

public class DataTypesConversion
{
    public static void main(String[] args) {
        /*
        toString
        toBinaryString
        ValueOf
        parseInt
         */

        String s = Integer.toBinaryString(55);
        System.out.println(s);

        String v = Integer.toHexString(22);
        System.out.println(v);

        String b = Integer.toString(50051323);
        System.out.println(b);

        int y1 = Integer.valueOf(b);   // " valueOf "  return the object value so the 'b => is a string value '
                                       // of the object value stored to the y1 and then that value to be printed
        System.out.println(y1);

        int y = Integer.parseInt(b);   // " parseInt "  return value is an integer so this difference from " valueOf "
        System.out.println(y);


    }
}
