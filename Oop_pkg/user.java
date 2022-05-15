package Oop_pkg;

public class user {
    public int account_no;
    public StringBuilder name = new StringBuilder("");
    public StringBuilder account_type = new StringBuilder(""); // ballpoint,gel,etc.

    public void printProperties(){
        System.out.println("name: "+this.name);
        System.out.println("type: "+this.account_type);
        System.out.println("Account number : "+this.account_no);
    }

    user(user user) {
        this.account_no = user.account_no;
        this.name = user.name;
        this.account_type = user.account_type;
    }

    public user() {

    }
}
