public class Solid_rhombus_pattern {
    public static void main(String[] args) {
        int n =15;
        int stars =5;
        for (int i =1; i<=n;i++){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=stars;j++){
                System.out.print("*");
            }
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
