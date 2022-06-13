import java.io.ObjectInputFilter;
import java.util.ArrayList;




public class Adv_problems_recurssion_1 {




    static int Count_paths(int i,int j , int rows,int columns){


        if (i == rows || j == columns) {
            return 0;
        }


        if (i == rows-1 && j == columns-1){
            return 1;
        }


//      count dawn paths
        int Dawn_paths = Count_paths(i+1,j,rows,columns);


//      Count Right Paths
        int Right_paths = Count_paths(i,j+1,rows,columns);


//      return count
        return Dawn_paths+Right_paths;


    }






    static int Count_placements(int rowtiles, int columntiles){
        if (rowtiles==columntiles ){
            return 2;
        }
        if (rowtiles<columntiles){
            return 1;
        }

//        count Vertical placements
        int Vertical_placements = Count_placements(rowtiles-columntiles,columntiles);
        //        count horizontal placements
        int Horizontal_placements= Count_placements(rowtiles-1,columntiles);

        return Vertical_placements+Horizontal_placements;

    }





    static int Invite_guests(int n){
        if (n<=1){
            return 1;
        }

//      single
        int way1 = Invite_guests(n-1);
//        pairs
        int way2 = (n-1) *Invite_guests(n-2);

        return way1+way2;
    }








//    printing subsets of arraylist
    public static void PrintSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i)+", ");

        }
        System.out.println("");
    }

    public static void Find_subsets(int n , ArrayList<Integer> subset){
    if (n==0){
        PrintSubset(subset);
        return;
    }

//        element added
        subset.add(n);
        Find_subsets(n-1, subset);

//        element not added
        subset.remove(subset.size()-1);
        Find_subsets(n-1,subset);

    }






    public static void main(String[] args) {


        System.out.println("count paths function on maze :");
        int rows= 4; int columns = 4;
        System.out.println(Count_paths(0,0,rows,columns));




        System.out.println("count placements function on tiles placed");

        int rowtiles= 4;
        int columntiles = 2;
        System.out.println(Count_placements(rowtiles,columntiles));




        System.out.println("total no. of ways to invite guests");
        int a = 4;
        System.out.println(Invite_guests(a));




        System.out.println("printing subsets up to n natural number");
        int b=4;
        ArrayList<Integer> subset = new ArrayList<>();
        Find_subsets(b,subset);

    }


}


