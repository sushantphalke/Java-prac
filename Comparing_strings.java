public class Comparing_strings {
    public static void main(String[] args) {
        String name1 = "sushant";
        String name2 = "sushant ";
        String sentance = "you can do it";
//        comparing both strings using compareTo() function
//        if s1>s2 = + value
//        if s1==s2 =0
//        if s1<s2 = -ve value
        if(name1.compareTo(name2)==0){
            System.out.println("both strings are equal");
        }
        else
        {
            System.out.println("strings are not equal");
        }
//        do not use == for comparing strings as it may results in failing some test cases. compareTo() is used instead of this.
        String mysubstring = sentance.substring(3);
        String newsubstring = sentance.substring(0,4);
        System.out.println(mysubstring);
        System.out.println(newsubstring);

    }
}
