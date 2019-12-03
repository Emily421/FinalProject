public class TicTacToe {
    public static boolean isPlayerOneTurn = true;;
    public static int[] board = {0, 0, 0, 0, 0, 0, 0, 0, 0};;

    public static int checkIfWinner(){
        if(board[0] == board[1] && board[1] == board[2] && board[0] == 1
        || board[3] == board[4] && board[4] == board[5] && board[3] == 1
        || board[6] == board[7] && board[7] == board[8] && board[6] == 1
        || board[0] == board[3] && board[3] == board[6] && board[0] == 1
        || board[1] == board[4] && board[4] == board[7] && board[1] == 1
        || board[2] == board[5] && board[5] == board[8] && board[2] == 1
        || board[0] == board[4] && board[4] == board[8] && board[0] == 1
        || board[2] == board[4] && board[4] == board[6] && board[2] == 1){
            return 1;
        }else if(board[0] == board[1] && board[1] == board[2] && board[0] == 2
        || board[3] == board[4] && board[4] == board[5] && board[3] == 2
        || board[6] == board[7] && board[7] == board[8] && board[6] == 2
        || board[0] == board[3] && board[3] == board[6] && board[0] == 2
        || board[1] == board[4] && board[4] == board[7] && board[1] == 2
        || board[2] == board[5] && board[5] == board[8] && board[2] == 2
        || board[0] == board[4] && board[4] == board[8] && board[0] == 2
        || board[2] == board[4] && board[4] == board[6] && board[2] == 2){
            return 2;
        }
        return 0;
    }

}