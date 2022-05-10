public class Bit_manuplation {
    public static void main(String[] args) {

//      Get the bit at specific position ****************
        int number = 5;
        int position = 2;
        int bitmask =  1<<position;
        if ((bitmask & number) == 0){
            System.out.println("bit at position : "+position+" of number : "+number+" is 0");
        }
        else {
            System.out.println("bit at position : "+position+" of number : "+number+" is 1");

        }
    }
}
