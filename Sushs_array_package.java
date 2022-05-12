import java.util.Scanner;

public class Sushs_array_package {


    //function to get user defined array of integers
    public static int[] getUserDefinedIntArray() {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int sizeOfArray = input.nextInt();

        int [] userDefinedArray = new int[sizeOfArray];
        System.out.print("Enter elements of array (size : "+sizeOfArray+")  : ");
        for(int i =0 ;i<(userDefinedArray.length);i++){
            userDefinedArray[i]= input.nextInt();
        }

        return userDefinedArray;
    }

    //function to print array
    public static void printArray(int [] myarray) {
        for (int j : myarray) System.out.print(j + " ");
    }



}
