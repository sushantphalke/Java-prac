public class TwoDArrays {
    public static void main(String[] args) {
        int [][] numbers = new int[15][15];
        for(int i =0 ;i<(numbers.length);i++){
            for(int j =0 ;j<(numbers.length);j++){
                numbers[i][j]=j;
        }
        }
         for(int i =0 ;i<(numbers.length);i++){
             for(int j =0 ;j<(numbers.length);j++){
                System.out.print(numbers[i][j]+"  ");
        }
                System.out.println();
            }
    }
}
