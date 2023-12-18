package java_practice_code;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class FileHandling
{
    public static void main(String[] args) {

        try{

//   ------------------------------------------------------------
            // ------------------  this reader file code
//            File f = new File("D:\\JDS\\DATA-STRUCTURE\\java ds salem\\data_structure\\src\\main\\java\\Example.txt");
//            Scanner reader = new Scanner(f);
//            while (reader.hasNextLine()){
//                System.out.println(reader.nextLine());
//            }


// -------------------------------------------------------------------
            // --------------------  this write file code

            File f = new File("D:\\JDS\\DATA-STRUCTURE\\java ds salem\\data_structure\\src\\main\\java\\Example.txt");
            FileWriter fw =new FileWriter(f);
            fw.write("HELLO VINETH KS-20E908");
            fw.close();



        }catch (Exception E ){
            System.out.println(E);
        }
    }
}
