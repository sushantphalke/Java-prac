
public class Arrays_first extends Sushs_array_package {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        for(int i =0 ;i<(numbers.length);i++){
            numbers[i]=i;
        }
//        imported from sushs_array_package
        System.out.println(numbers.length);
        printArray(numbers);
        

    }
}
