import java.util.Scanner;

public class Bit_manipulation_OR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : " );
        int number = input.nextInt();
        System.out.print("Enter the shift position : ");
        int pos = input.nextInt();
        int bitmask = 1 << pos;

        int newNumber = number | pos;

        System.out.println("Number got with OR operation after position shift of : "+pos+" is : "+newNumber);
    }
}
