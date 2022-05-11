import java.util.Scanner;

public class Insertion_sort_pro {
   
        public static void main(String[] args) {

            int[] numbers =getUserDefinedIntArray();

            System.out.println("User input Array : ");
            printArray(numbers);

//          applying insertion sort on user defined array
            int[] sorted_array = insertion_sort(numbers);

            System.out.println("\nSorted Array by insertion Sort :");
            printArray(sorted_array);

        }//end of psvm

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

//function to print array
        public static void printArray(int [] myarray) {
            for (int j : myarray) System.out.print(j + " ");
        }

//function to get user defined array of integers
        public static int[] getUserDefinedIntArray() {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the size of array : ");
            int sizeOfArray = input.nextInt();

            int[] userDefinedArray = new int[sizeOfArray];
            System.out.print("Enter elements of array (size : " + sizeOfArray + ")  : ");
            for (int i = 0; i < (userDefinedArray.length); i++) {
                userDefinedArray[i] = input.nextInt();
            }

            return userDefinedArray;
        }
}
