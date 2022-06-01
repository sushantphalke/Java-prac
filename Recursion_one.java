public class Recursion_one {
    public static void main(String[] args) {

      int n = 100;
        System.out.println("sum");
      System.out.println(Calculate_Sum(n));

//    please do not enter number greater than 49 it will be out of range even long is used
      long  m =34;
        System.out.println("factorial");
      System.out.println(Calculate_Fact(m));
        System.out.println("power of");
        System.out.println(Calculate_Pow(0,3));

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
//    power of x to n
    public static int Calculate_Pow(int x , int n) {
//        if (x != 0) {
            if (n > 1) {
                return x * (Calculate_Pow(x, n - 1));
            } else return x;
        }
//        return 0;
//    }
}
