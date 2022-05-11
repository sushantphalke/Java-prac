import java.util.Scanner;

public class Bubble_sort_pro {
        public static void main(String[] args) {
            Scanner input  = new Scanner(System.in);
            int[] numbers =getUserDefinedIntArray();
            System.out.println("User input Array : ");
            printArray(numbers);
            int[] sorted_array = bubble_sort(numbers);
            System.out.println("\nSorted Array by Bubble Sort :");
            printArray(sorted_array);
        }
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

        public static void printArray(int [] myarray) {
            for(int i =0 ;i<(myarray.length);i++) {
                System.out.print(myarray[i] + "  ");
            }
        }

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
