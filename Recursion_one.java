public class Recursion_one {
    public static void main(String[] args) {


      int sum =0;
      int n = 100;
      System.out.println(Calculate_Sum(n));

//    please do not enter number greater than 49 it will be out of range even long is used
      long  m =34;
      System.out.println(Calculate_Fact(m));

    }

//  sum of n positive integers using recursion
    public static int Calculate_Sum( int n){
       if(n>0) return (n + Calculate_Sum(n - 1));
       else {
           return 0;
       }
    }

//  factorial of n using recursion

    public static long Calculate_Fact(long n){
        if (n>1){
            return (n * Calculate_Fact(n-1));
        }
        else return 1;
    }

}
