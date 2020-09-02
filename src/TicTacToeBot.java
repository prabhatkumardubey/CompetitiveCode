import java.util.Scanner;

class TicTacToeBot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int board[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				board[j][i]=sc.nextInt();
			}
		}
		int player=sc.nextInt();
		MoveBot bestMove=new MoveBot();
		MoveBot get=bestMove.findBestMove(board,(false));
		System.out.println(get.row+" "+get.col);
	}

}
class MoveBot{
	int row,col;
	public int player=1,opponent=2;
	public MoveBot findBestMove(int[][] board,boolean game) {
		// TODO Auto-generated method stub
		int bestVal=-1000;
		MoveBot value=new MoveBot();
		value.row=-1;
		value.col=-1;
		//Traverse all cell and evaluate minimax for all empty cell
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				//check if cell is empty
				if(board[i][j]==0){
					board[i][j]=player;
					//compute evaluation function for this move
					int moveval=minimax(board,0,game);
					
					//undo the move
					board[i][j]=0;
					
					//If the value of current move is best than  best value than update best value
					if(moveval>=bestVal){
						value.row=i;
						value.col=j;
						bestVal=moveval;
					}
				}
			}
		}
		return value;
	}
	// this function considers all the possible ways the game can go
	private int minimax(int[][] board, int depth, boolean isMax) {
		// TODO Auto-generated method stub
		int score=evaluate(board);
		//If player has won the game than return his evaluated score
		if(score==10){
			return score;
		}
		//If opponent has won the game
		else if(score==-10){
			return score;
		}
		//If there are no more moves or tie game
		if(isMoveLeft(board)==false){
			return 0;
		}
		
		// If player's move
		if(isMax){
			int best=-1000;
			//Traverse all cells
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					//check if cell is empty
					if(board[i][j]==0){
						//make the move
						board[i][j]=player;
						//call minimax recursively and choose maximum value for player
						best=max(best,minimax(board,depth+1,!isMax));
						
						//undo the move
						board[i][j]=0;
					}
				}
			}
			return best;
		}
		//If opponent move
		else{
			int best=1000;
			//Traverse all cells
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					//check if cell is empty
					if(board[i][j]==0){
						board[i][j]=opponent;
						//call minimax recursively and choose maximum value for player
						best=min(best,minimax(board,depth+1,!isMax));
						
						//undo the move
						board[i][j]=0;
					}
				}
				return best;
			}
		}
		return 0;
	}
	private int min(int best, int minimax) {
		// TODO Auto-generated method stub
		return best<minimax?best:minimax;
	}
	private int max(int best, int minimax) {
		// TODO Auto-generated method stub
		return best>minimax?best:minimax;
	}
	private boolean isMoveLeft(int[][] board) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(board[i][j]==0){
					return true;
				}
			}
		}
		return false;
	}
	//This evaluates victory is for player or opponent or draw match
	private int evaluate(int[][] board) {
		// TODO Auto-generated method stub
		//checking victory for player or opponent row wise
		for(int row=0;row<3;row++){
			if(board[row][0]==board[row][1] && board[row][1]==board[row][2]){
				if(board[row][0]==player){
					return 10;
				}
				else if(board[row][0]==opponent){
					return -10;
				}
			}
		}
		//checking victory for player or opponent column wise
		for(int col=0;col<3;col++){	
			if(board[0][col]==board[1][col] && board[1][col]==board[2][col]){
				if(board[0][col]==player){
					return 10;
				}
				else if(board[0][col]==opponent){
					return -10;
				}
			}
		}
		//checking victory on diagonals
		if(board[0][0]==board[1][1] && board[1][1]==board[2][2]){
			if(board[0][0]==player){
				return 10;
			}
			else if(board[0][0]==opponent){
				return -10;
			}
		}
		if(board[0][2]==board[1][1] && board[1][1]==board[2][0]){
			if(board[0][2]==player){
				return 10;
			}
			else if(board[0][2]==opponent){
				return -10;
			}
		}
		return 0;
	}
}
