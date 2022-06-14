public class Back_tracking {
public static int sum =1 ;
    public static void Print_permutations(String str,String perm,int idx){

        if (str.length()==0){
            System.out.println(perm);
            System.out.println(sum);
            sum++;
            return;
        }
//        if(idx == str.length()){
//
//        }
        for (int i =0;i<str.length();i++){
            char Curr_char = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            Print_permutations(newStr,perm+Curr_char,idx+1);
        }

    }

    public static void main(String[] args) {
        String str  = "ABCD";
        String perm = "";
        Print_permutations(str,perm,0);

    }
}
