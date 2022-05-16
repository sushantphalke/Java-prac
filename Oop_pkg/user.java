package Oop_pkg; // just name of this package

public class user {
//    make variables public to access in other files
    public int account_no;
    public StringBuilder name = new StringBuilder("");
    public StringBuilder account_type = new StringBuilder("");
    private  StringBuilder password = new StringBuilder("");

//    getters and setters for private functions
//    getter
    public void getPassword(){
        System.out.println(this.password);
    }
//    Setter
    public void setPassword(StringBuilder pass){
        this.password = pass;
    }


//    just printing object
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
//  blank function called just in support of above
    }
}
