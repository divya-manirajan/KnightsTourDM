/**
 * Main class that is supposed to run the Knight's tour without heuristics
 * 
 * @author Divya Manirajan
 * @version Sept 9 2019
 * Programming project 1
 * Fall/2019
 */
//imports
import java.util.Random;
public class Application {
	public static void main (String [] args) {
		//instance variables
		int board [][] = new int [8][8]; //sets the array for the chess board
		for(int i = 0; i<8; i++){
			for(int j = 0; j<8; j++) {
				board[i][j] = 0; 
			}
		}//initializes all squares of the board to 0
		int possibleMoves [] = {-1,1,-2,2}; //an array with possible moves (x and y direction)

		Random random = new Random(); //Utilizes import to create a Random object
		int xIndex = random.nextInt(4);//sets the X axis index to choose from the possibleMoves array
		int yIndexSmallX = random.nextInt(2)+2;//sets the y axis index when the x is either 1 or -1
		int yIndexBigX = random.nextInt(2);//sets the y axis index when the x is either 2 or -2
		int startX = random.nextInt(8);//chooses a random starting x coordinate
		int startY = random.nextInt(8);//chooses a random starting y coordinate
		int moveNumber = 1;//counter variable to keep track of the moves
		int moveX = 0;//variable to hold the actual x movement (-1,1,-2,or 2)
		int moveY = 0;//variable to hold the actual y movement (-1,1,-2,or 2)

		moveX = possibleMoves[xIndex];//sets the x movement to a random number inside the possibleMoves array
		
		if (moveX == 1 || moveX == -1) {
			moveY = possibleMoves[yIndexSmallX];
		}//sets the y movement to either 2 or -2
		else if (moveX == 2 || moveX == -2) {
			moveY = possibleMoves[yIndexBigX];
		}//sets the y movement to either 1 or -1
		
		int x = startX;//sets the x coordinate equal to the random starting number
		int y = startY;//sets the y coordinate equal to the random starting number
		
		do {
		x = x + moveX;//changes the x by the move amount
		y = y + moveY;//changes the y by the move amount
		
		while (x<0 || x>7) {
			x = x + moveX;
		}//sets bounds so the x value stays within the chess board
		while (y<0 || y>7) {
			y = y + moveY;
		}//sets bounds so the y value stays within the chess board
		board[x][y] = moveNumber;//sets the new position to the move number
		
		moveNumber++;//increases the movenumber by 1 each time
		} while (moveNumber<64);//The max number of moves is 64
		
		System.out.println(board[startX][startY] + ", " + moveNumber+", "+board[x][y]);
	}//end main
}//end Application
