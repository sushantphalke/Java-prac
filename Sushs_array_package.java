
import java.util.Scanner;
public class Sushs_array_package {

    public static void main(String[] args) {

    }
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



//    Sorting algorithms

    //bubble sort function
    public static int[] bubble_sort(int[] arrayToSort){
        for (int i = 0; i<arrayToSort.length-1; i++){
            for (int j=0;j<arrayToSort.length-i-1;j++) {

                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }

        return arrayToSort;
    }

    //insertion sort function
    public static int[] insertion_sort(int[] arrayToSort){
        for (int i=1; i< arrayToSort.length;i++){
            int current = arrayToSort[i];
            int j=i-1;
            while(j>=0 && current<arrayToSort[j]){
                arrayToSort[j+1]=arrayToSort[j];
                j--;
            }
            arrayToSort[j+1]=current;
        }

        return arrayToSort;
    }

    //selection sort function
    public static int[] selection_sort(int[] arrayToSort){

        for (int i = 0; i<arrayToSort.length; i++){

/*          int noToSwap = arrayToSort[i];
            int position = i;

            for (int j=i+1;j<arrayToSort.length;j++) {

                if (noToSwap>arrayToSort[j]) {
                    noToSwap = arrayToSort[j];
                    position= j;
                }
            }
            int temp = arrayToSort[i];
            arrayToSort[i]=arrayToSort[position];
            arrayToSort[position]=temp;
            */

            int smallest = i;
            for (int j=i+1; j<arrayToSort.length;j++){
                if(arrayToSort[smallest]>arrayToSort[j]){
                    smallest = j;
                }
            }
            int temp = arrayToSort[smallest];
            arrayToSort[smallest] = arrayToSort[i];
            arrayToSort[i] = temp;
        }

        return arrayToSort;
    }




}
