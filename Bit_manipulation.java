import java.util.Scanner;

public class Bit_manipulation {
    public static void main(String[] args) {

//      Get the bit at specific position ****************
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the position to know bit: ");
        int position = input.nextInt();
        int bitmask =  1<<position;
        if ((bitmask & number) == 0){
            System.out.println("bit at position : "+position+" of number : "+number+" is 0");
        }
        else {
            System.out.println("bit at position : "+position+" of number : "+number+" is 1");

        }
//      **********************

        System.out.println("* Bits are counted from Left >> Right * and BINARY OF "+ number +" is : "+toBinary(number,32));
    }
    public static String toBinary(int n, int len)
    {
        String binary = "";
        for (long i = (1L << len - 1); i > 0; i = i / 2) {
            binary += (n & i) != 0 ? "1" : "0";
        }
        return binary;
    }


}
