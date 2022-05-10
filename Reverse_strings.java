import java.util.Scanner;

public class Reverse_strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string :");
        String name = input.nextLine();
        StringBuilder sb = new StringBuilder(name);
        for (int i = 0 ; i<sb.length()/2;i++){
//            front and back index of string
            int front = (i);
            int back =(sb.length()-1-i);
//            front character and back character
            char frontchar = sb.charAt(front);
            char backchar =sb.charAt(back);
//            swap their positions
            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }
        System.out.println(sb);
    }
}
