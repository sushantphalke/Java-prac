public class Recursion_one {
    public static void main(String[] args) {
//      calculating sum of n numbers using recursion
      int sum =0;
      int n = 100;
        System.out.println(Calculate_Sum(n));

    }
//    sum of n positive integers using recursion
    public static int Calculate_Sum( int n){
       if(n>0) return (n + Calculate_Sum(n - 1));
       else {
           return 0;
       }
    }

}
