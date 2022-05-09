import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name ");
        String name = input.nextLine();
        System.out.println("your name is "+ name);
        System.out.print("enter your fullname ");
        String fullname = input.nextLine();
        System.out.println("your name is "+ fullname);
//        printing character at position
        for (int i =  0 ;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
//

    }
}
