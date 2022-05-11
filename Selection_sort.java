
public class Selection_sort {
    public static void main(String[] args) {
        int [] numbers = {2,4,3,7,5,8};
        for (int i=0; i< numbers.length-1;i++){
            int noToSwap = numbers[i];
            int pos = i;
            for (int j=i+1;j< numbers.length-1;j++) {
                if (noToSwap>numbers[j]) {
                    pos= j;
                }

            }
            int temp = numbers[i];
            numbers[i] = numbers[pos];
            numbers[pos]=temp;

        }
        printArray(numbers);

    }
    public static void printArray(int [] myarray) {
        for (int j : myarray) System.out.print(j + " ");
    }

}
