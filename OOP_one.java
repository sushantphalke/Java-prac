
import Oop_pkg.user;

class Pen {

    StringBuilder name = new StringBuilder();
    StringBuilder type = new StringBuilder(); // ballpoint,gel,etc.
    StringBuilder color = new StringBuilder();

    public void PrintProperties(){
// this method calls properties of given objects
        System.out.println("name: "+this.name);
        System.out.println("type: "+this.type);
        System.out.println("color: "+this.color);
    }
    Pen (Pen pen){
        this.name= pen.name;
        this.type=pen.type;
        this.color=pen.color;
    }
    Pen(){

    }
}
abstract class Com_account{
    abstract void Com_name();
    Com_account(){
        System.out.println("you are creating a company account");
    }
    public void type(){
        System.out.println("company current account");
    }

}

class SnG extends Com_account {
    @Override
    void Com_name() {
        System.out.println("SnG");
    }

    SnG (){
        System.out.println("created SnG account");

    }
    public void isActive(){
        System.out.println("SnG company account is active");
    }

}
class AceSP extends Com_account {
    @Override
    void Com_name() {
    }

    AceSP(){
        System.out.println("created AceSP account");
    }
    public void isActive(){
        System.out.println("AceSP company account is active");
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

        Pen pen3 = new Pen(pen1);
        System.out.println("\nProperties of pen3");
        pen3.PrintProperties();

//      using package of user class 
        user user1= new user();
        user1.account_no= 123233;
        user1.account_type = new StringBuilder("current");
        user1.name = new StringBuilder("sushant");
        StringBuilder pass = new StringBuilder("sush");

//        setting and getting private variable values from function in package
        user1.setPassword(pass);
        user1.getPassword();
        user1.printProperties();

//      Abstract classes
        SnG sng = new SnG();
        sng.isActive();
        sng.Com_name();

        AceSP Ace = new AceSP();
        Ace.Com_name();
        Ace.isActive();

/*      in below code pen1.name is assigned by stringBuilder but for printing output it taken as string by new string
        String pen1name = new String(pen1.name= new StringBuilder("Parker"));
        String pen1type = new String(pen1.type= new StringBuilder("Ballpoint"));
        System.out.println(pen1.name.charAt(3));
        System.out.println(pen1name + pen1type);
*/




    }//end of psvm
}
