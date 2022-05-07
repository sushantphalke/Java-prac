public class Pyramid_pattern {
    public static void main(String[] args) {
        int steps = 5;
        for (int i = 1; i<=steps; i++){
            for (int j=1; j<=(steps-i);j++){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){
                System.out.print(i+" ");
            }
            for (int j=1; j<=(steps-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
