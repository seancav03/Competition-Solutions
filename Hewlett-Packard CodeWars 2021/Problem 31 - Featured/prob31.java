import java.util.*;

public class prob31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int edge = Integer.parseInt(s.nextLine());
		int[][] board = new int[edge][edge];
		ArrayList<Integer> vals = new ArrayList<Integer>();
		for(int i = 0; i < edge; i++) {
			String line = s.nextLine();
			for(int j = 0; j < edge; j++) {
				if(line.charAt(j) == '.') {
					board[i][j] = 0;
					vals.add(i*edge + j);
				} else {
					board[i][j] = Integer.parseInt(Character.toString(line.charAt(j)));
				}
			}
		}
		
//		System.out.println(check(board, edge));
		
		
		for(int iter = 0; iter < vals.size(); iter++) {
//			if(iter < 0) {
//				print2D(board, edge);
//			}
			int ind = vals.get(iter);
			int j = ind % edge;
			int i = (ind-j)/edge;
			
			if(board[i][j] == 0) {
				board[i][j] = 1;
			} else if(board[i][j] == 1) {
				board[i][j] = 2;
			} else if(board[i][j] == 2) {
				board[i][j] = 3;
			} else if(board[i][j] == 3) {
				board[i][j] = 4;
			} else if(board[i][j] == 4) {
				board[i][j] = 0;
				//go fix
				iter -= 2;
			}
			
			if(!check(board, edge)) {
				iter--;
//				System.out.println("Failed Check");
			}
//			print2D(board, edge);
//			System.out.println("---");
		}
		
		
		print2D(board, edge);
	}
	
	public static void print2D(int[][] board, int edge) {
		for(int i = 0; i < edge; i++){
			String res = "";
			for(int j = 0; j < edge; j++) {
				res += Integer.toString(board[i][j]);
			}
			System.out.println(res);
		}
	}
	
	public static boolean check(int[][] board, int edge) {
		//no neightboring tiles
//		System.out.println("Neighboring");
		for(int i = 0; i < edge; i++) {
			for(int j = 0; j < edge; j++) {
				int spot = board[i][j];
				if(spot == 0) {
					continue;
				}
				//check for right angles of same value
				if(i > 0 && board[i-1][j] == spot && j > 0 && board[i][j-1] == spot) {
					return false;
				}
				if(i > 0 && board[i-1][j] == spot && j+1 < edge && board[i][j+1] == spot) {
					return false;
				}
				if(i+1 < edge && board[i+1][j] == spot && j > 0 && board[i][j-1] == spot) {
					return false;
				}
				if(i+1 < edge && board[i+1][j] == spot && j+1 < edge && board[i][j+1] == spot) {
					return false;
				}
			}
		}
		//no corners
//		System.out.println("Corners");
		for(int i = 0; i+1 < edge; i++) {
			for(int j = 0; j+1 < edge; j++) {
				if(board[i][j] != 0 && board[i+1][j] != 0 && board[i][j+1] != 0 && board[i+1][j+1] != 0 && board[i][j] != board[i+1][j] && board[i][j] != board[i][j+1] && board[i+1][j+1] != board[i+1][j] && board[i+1][j+1] != board[i][j+1]) {
					return false;
				}
			}
		}
		//correct sizes
		boolean areZeros = false;
		for(int i = 0; i < edge; i++) {
			for(int j = 0; j < edge; j++) {
				if(board[i][j] == 0) {
					areZeros = true;
				}
			}
		}
//		System.out.println("Sizes");
		for(int i = 0; i < edge; i++) {
			for(int j = 0; j < edge; j++) {
				int spot = board[i][j];
				if(spot == 0) {
					continue;
				}
//				boolean foundZero = false;
				int cntr = 1;
				int potential = 1;
				int ii = i;
				int jj = j;
				while(ii-1 >= 0 && board[ii-1][jj] == spot) {
					cntr++;
					ii--;
				}
				ii = i;
				jj = j;
				while(jj-1 >= 0 && board[ii][jj-1] == spot) {
					cntr++;
					jj--;
				}
				ii = i;
				jj = j;
				while(ii+1 < edge && board[ii+1][jj] == spot) {
					cntr++;
					ii++;
				}
				ii = i;
				jj = j;
				while(jj+1 < edge && board[ii][jj+1] == spot) {
					cntr++;
					jj++;
				}
				
				//potentials
				ii = i;
				jj = j;
				while(ii-1 >= 0 && (board[ii-1][jj] == spot || board[ii-1][jj] == 0)) {
					potential++;
					ii--;
				}
				ii = i;
				jj = j;
				while(jj-1 >= 0 && (board[ii][jj-1] == spot || board[ii][jj-1] == 0)) {
					potential++;
					jj--;
				}
				ii = i;
				jj = j;
				while(ii+1 < edge && (board[ii+1][jj] == spot || board[ii+1][jj] == 0)) {
					potential++;
					ii++;
				}
				ii = i;
				jj = j;
				while(jj+1 < edge && (board[ii][jj+1] == spot || board[ii][jj+1] == 0)) {
					potential++;
					jj++;
				}
				
				if(cntr > spot || potential < spot || (!areZeros && cntr != spot)) {
//					System.out.println("Spot: " + i + ", " + j);
//					System.out.println(cntr);
					return false;
				}
			}
		}
		return true;
	}
	

}
