import my_custum_arr_pkg.Sushs_array_package;
public class Arrays_first {
    public static void main(String[] args) {
        int [] numbers = {11,6,231,2,8,3};

//        for(int i =0 ;i<(numbers.length);i++){
//            numbers[i]=i;
//        }
//        imported from sushs_array_package
        System.out.println(numbers.length);
        Sushs_array_package.printArray(numbers);
        System.out.println("");
        Sushs_array_package.selection_sort(numbers);
        Sushs_array_package.printArray(numbers);

        

    }
}
