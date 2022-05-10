import java.util.Scanner;

public class Bit_manipulation_OR {
    public static void main(String[] args) {
//      Set bit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : " );
        int number = input.nextInt();
        System.out.print("Enter the shift position : ");
        int pos = input.nextInt();
        int bitmask = 1 << pos;
        System.out.print("Enter the operation type 1 for set bit or 0 for clear bit : ");
        int operationtype = input.nextInt();
        if (operationtype ==1) {


            int newNumber = number | pos;

            System.out.println("Number got with OR(set bit) operation after position shift of : " + pos + " is : " + newNumber);
        }else {
//      clear bit - set bit to 0
            int clearedbitnumber = number & ~bitmask;
            System.out.println("Number got with AND & NOT bitmask(clear bit) operation after position shift of : " + pos + " is : " + clearedbitnumber);

        }
    }
}
