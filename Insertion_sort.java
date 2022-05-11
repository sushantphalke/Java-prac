public class Insertion_sort {
    public static void main(String[] args) {
        int [] numbers = {7,3,4,2,5,1,34,33,32,96};

        for (int i=1; i< numbers.length;i++){
            int current = numbers[i];
            int j=i-1;
            while(j>=0 && current<numbers[j]){
                numbers[j+1]=numbers[j];
                j--;
            }
            numbers[j+1]=current;
        }
        for(int i =0 ;i<(numbers.length);i++){
            System.out.print(numbers[i]+"  ");
        }
    }
}
