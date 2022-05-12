class Pen {

    StringBuilder name = new StringBuilder("");
    StringBuilder type = new StringBuilder(""); // ballpoint,gel,etc.
    StringBuilder color = new StringBuilder("");

    public void PrintProperties(){
// this method calls properties of given objects
        System.out.println("name: "+this.name);
        System.out.println("type: "+this.type);
        System.out.println("color: "+this.color);
    }
}


public class OOP_one {
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.name= new StringBuilder("Parker");
        pen1.type= new StringBuilder("Ballpoint");
        pen1.color= new StringBuilder("Blue");
        System.out.println("Properties of pen1");
        pen1.PrintProperties();

        Pen pen2 = new Pen();
        pen2.name = new StringBuilder("Reynolds");
        pen2.type = new StringBuilder("Gel");
        pen2.color= new StringBuilder("Black");
        System.out.println("\nProperties of pen2");
        pen2.PrintProperties();


/*      in below code pen1.name is assigned by stringBuilder but for printing output it taken as string by new string
        String pen1name = new String(pen1.name= new StringBuilder("Parker"));
        String pen1type = new String(pen1.type= new StringBuilder("Ballpoint"));
        System.out.println(pen1.name.charAt(3));
        System.out.println(pen1name + pen1type);
*/




    }//end of psvm
}
