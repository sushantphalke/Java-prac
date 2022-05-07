import java.util.Scanner;

public class User_d_arys {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        Scanner input  = new Scanner(System.in);
        for(int i =0 ;i<(numbers.length);i++){
            numbers[i]= input.nextInt();

        }
        for (int i =0 ;i<(numbers.length); i++){
            System.out.print(numbers[i]+"  ");
        }

    }

}
