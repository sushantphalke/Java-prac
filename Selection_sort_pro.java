import java.util.Scanner;

public class Selection_sort_pro {
    public static void main(String[] args) {

        int[] numbers =getUserDefinedIntArray();

        System.out.println("User input Array : ");
        printArray(numbers);

//          applying selection sort on user defined array
        int[] sorted_array = selection_sort(numbers);

        System.out.println("\nSorted Array by selection Sort :");
        printArray(sorted_array);

    }//end of psvm

    //selection sort function
    public static int[] selection_sort(int[] arrayToSort){

        for (int i = 0; i<arrayToSort.length; i++){

//            int noToSwap = arrayToSort[i];
//            int position = i;
//
//            for (int j=i+1;j<arrayToSort.length;j++) {
//
//                if (noToSwap>arrayToSort[j]) {
//                    noToSwap = arrayToSort[j];
//                    position= j;
//                }
//            }
//            int temp = arrayToSort[i];
//            arrayToSort[i]=arrayToSort[position];
//            arrayToSort[position]=temp;

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

    //function to print array
    public static void printArray(int [] myarray) {
        for (int j : myarray) System.out.print(j + " ");
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
}
