class Pen {

    StringBuilder name = new StringBuilder("");
    StringBuilder type = new StringBuilder(""); // ballpoint,gel,etc.

    public void Write(){
        System.out.println("Writing something");
    }
}


public class OOP_one {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
//      in below code pen1.name is assigned by stringBuilder but for printing output it taken as string by new string
        String pen1name = new String(pen1.name= new StringBuilder("Parker"));
        String pen1type = new String(pen1.type= new StringBuilder("Ballpoint"));
//      System.out.println(pen1.name.charAt(3));
        System.out.println(pen1name + pen1type);

    }
}
