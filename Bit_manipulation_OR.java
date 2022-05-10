public class Bit_manipulation_OR {
    public static void main(String[] args) {
        int number = 5;
        int pos = 2;
        int bitmask = 1 << pos;

        int newNumber = number | pos;
        System.out.println(newNumber);
    }
}
