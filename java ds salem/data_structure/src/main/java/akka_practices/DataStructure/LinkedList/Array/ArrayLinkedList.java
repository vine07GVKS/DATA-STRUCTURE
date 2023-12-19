package akka_practices.DataStructure.LinkedList.Array;
import java.util.Scanner;

/*
 * --------------------------------------------------------------------------------
 * --------------------   List implementation using Array --------------------------
 *  -------------------------------------------------------------------------------
 */

class DynamicArray{
    // Variables - Methods
    private int[] arr;
    private int size;
    private static final int initialCapacity= 4;
    private int capacity;

    DynamicArray(){   // this constructor
        size=0;
        arr = new int[initialCapacity];
        capacity =initialCapacity;

    }

    public void add(int val){
        if (size==capacity){
            expandArray();
        }
        arr[size++]=val;
    }
    private void expandArray(){
        capacity *=2;
        arr= java.util.Arrays.copyOf(arr,capacity);
    }

    public void display(){
        System.out.println(" Elements in the list ");
        for (int i=0 ; i<=size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public void InsertAtPos(int position , int value){
        if (size==capacity)
            expandArray();
    for (int i = size-1; i>position;i--){
        arr[i+1]=arr[i];
        arr[position]=value;
        size++;
    }
    }

    public void deleteAtPos(int position){
        for (int i = position+1; i<size;i++){
            arr[i-1]=arr[i];
        }
        size--;
        if(capacity>initialCapacity && capacity >3*size){
            shrinkelArray();
        }
    }
    private void shrinkelArray(){
        capacity /=2;
        arr = java.util.Arrays.copyOf(arr,capacity);
    }

    public void deleteAtEnd(){ size-=1;}

    public void getIndexValue(int position ){
        int val=arr[position];
        System.out.println("given index value is : "+position +"index contain value " + val);
    }

    public void ClearAllData(){size=-1;}

}
public class ArrayLinkedList
{
    public static void main(String[] args) {

        DynamicArray list = new DynamicArray();  // this line is object

        Scanner input = new Scanner(System.in);
        int value,position;
    while(true){
        System.out.println("------------- List of Menu ---------------");
        System.out.println("1. Insert at End ");
        System.out.println("2. Display the List");
        System.out.println("3. insert at specified Position ");
        System.out.println("4. Delete at Specified Position");
        System.out.println("5. Delete At End Value");
        System.out.println("6. See the index contain value ");
        System.out.println("7. Clear all data");
        System.out.println("8. Exit\n");
        System.out.println("------------------------------------------");
        System.out.println("Enter your choice: \t");

        int choice =input.nextInt();
        switch (choice){
            case 1:
            {
                System.out.println("Enter the data:");
                value = input.nextInt();
                list.add(value);
            }
            break;

            case 2:
            {
                list.display();
            }
            break;

            case 3:
            {
                System.out.println("Enter position starts at ' 0 ' :  ");
                position= input.nextInt();
                if (position<0){
                    System.out.println("Invalid Position ");
                    break;
                }
                System.out.println("Enter the data:");
                value = input.nextInt();
                list.InsertAtPos(position,value);
            }
            break;

            case 4:
            {
                System.out.println("Enter position starts at ' 0 ' :  ");
                position= input.nextInt();
                if (position<0){
                    System.out.println("Invalid Position ");
                    break;
                }
                list.deleteAtPos(position);
            }
            break;

            case 5:
            {
                list.deleteAtEnd();
                list.display();
            }
            break;

            case 6:
            {
                position = input.nextInt();
                list.getIndexValue(position);
            }
            break;

            case 7:
            {
                list.ClearAllData();
                list.display();
                System.out.println("--- All Data will be cleared in array ---");
            }
            break;

            case 8:{ System.exit(0); }
            default: { System.out.println("Invalid Choice"); }
        }

    }

    }
}
