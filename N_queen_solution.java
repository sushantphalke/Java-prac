//import java.util.ArrayList;
//import java.util.List;
//
//public class N_queen_solution {
//    public boolean isSafe(int row, int col, char[][] board) {
//        for (int j = 0; j < board.length; j++) {
//            if (board[row][j] == "Q") {
//                return false;
//
//            }
//        }
//        for (int i = 0; i < board[0].length; i++) {
//            if (board[i][col] == 'Q') {
//                return false;
//
//            }
//        }
//
//        int r = row;
//        for (int c = col; c >= 0 && r >= 0; c--, r--) {
//            if (board[r][c] == 'Q') {
//                return false;
//
//            }
//        }
//
//        r = row;
//        for (int d = 0; d < board.length && r >= 0; r--, c++) {
//            if (board[r][c] == 'Q') {
//                return false;
//
//            }
//        }
//
//        r = row;
//        for (int d = 0; d < board.length && col >= 0; r++, c--) {
//            if (board[r][c] == 'Q') {
//                return false;
//
//            }
//        }
//
//        r = row;
//        for (int d = 0; d < board.length && r >= 0; r--, c++) {
//            if (board[r][c] == 'Q') {
//                return false;
//
//            }
//        }
//
//
//        for (int d = 0; d < board.length && r < board.length; r++, c++) {
//            if (board[r][c] == 'Q') {
//                return false;
//
//            }
//        }
//
//        return true;
//
//    }
//}
//        public void saveBoard(String[][] board,  List<List<String>> allBoards){
//
//            String row="";
//            List<String> Newboard = new Arraylist<>();
//
//            for(int i=0; i<board.length;i++){
//                row = "";
//                for (int j=0;j<board[0].length;j++){
//                    if(board[i][j]=='Q'){
//                        row+='Q';}
//                    else{
//                        row+= '.';}
//                }
//                Newboard.add(row);
//            }
//
//            allBoards.add(Newboard);
//        }
//
//
//
//
//    public void helper (char[][] board , List<List<String> allBoards , int col){
//        if (col == board.length){
//            saveBoard(board,allBoards);
//            return;
//        }
//
//        for(int row = 0;row <board.length;row++){
//            if(isSafe(row,col,board)){
//                board[row][col]="Q";
//                helper(board, allBoards ,col+1);
//                board[row][col]= ".";
//            }
//        }
//
//    }
//
//
//    public List<List<String>> solveNQueens(int n) {
//        List<List<String>> allBoards = new ArrayList<>();
//        char[][] board = new board[n][n];
//        return allBoards;
//    }
//}