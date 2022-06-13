public class Maze_problem_rec_1 {
    static int Count_paths(int i,int j , int m,int n){

        if (i == m || j == n) {
            return 0;
        }

        if (i == m-1 && j == n-1){
            return 1;
        }

//      count dawn paths
        int Dawn_paths = Count_paths(i+1,j,m,n);
//      Count Right Paths
        int Right_paths = Count_paths(i,j+1,m,n);

//      return count
        return Dawn_paths+Right_paths;
    }

    static int Count_placements(int m , int n){
        if (m==n ){
            return 2;
        }
        if (m<n){
            return 1;
        }

//        count Vertical placements
        int Vertical_placements = Count_placements(m-n,n);
        //        count horizontal placements
        int Horizontal_placements= Count_placements(m-1,n);

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

    public static void main(String[] args) {
        System.out.println("count paths function on maze :");
        int m= 3; int n = 3;
        System.out.println(Count_paths(0,0,m,n));

        System.out.println("count placements function on tiles placed");

        int x = 4;
        int y = 2;
        System.out.println(Count_placements(x,y));

        System.out.println("total no. of ways to invite guests");
        int a = 4;
        System.out.println(Invite_guests(a));

    }
}
