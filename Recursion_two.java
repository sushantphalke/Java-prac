public class Recursion_two {



    public static void main(String[] args) {
        String str = "abc";
        My_Permutations(str,"");

    }
    public static void My_Permutations(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i =0 ; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            My_Permutations(newStr,permutation+currChar);
        }
    }


}
