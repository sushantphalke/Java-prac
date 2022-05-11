public class Bubble_sort {
    public static void main(String[] args) {
        int numbers[]={7,8,3,1,2};
//        int [] numbers = new int[5];
//        for(int i =0 ;i<(numbers.length);i++){
//            numbers[i]=i;
//        }
        int[] sorted_array = bubble_sort(numbers);
        for(int i =0 ;i<(sorted_array.length);i++) {
            System.out.print(sorted_array[i] + "  ");
        }

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
}
