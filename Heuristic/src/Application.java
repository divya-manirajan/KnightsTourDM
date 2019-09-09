/**
 * Main class that is supposed to run the Knight's tour with heuristics
 * 
 * @author Divya Manirajan
 * @version Sept 9 2019
 * Programming project 1
 * Fall/2019
 */
import java.util.Random;
public class Application {
	public static void main (String [] args) {
		int startX = 0;//sets the starting x coordinate
		int startY = 0;//sets the starting y coordinate
		int acc [][] = {	{2,3,4,4,4,4,3,2},
							{3,4,6,6,6,6,4,3},
							{4,6,8,8,8,8,6,4},
							{4,6,8,8,8,8,6,4},
							{4,6,8,8,8,8,6,4},
							{4,6,8,8,8,8,6,4},
							{3,4,6,6,6,6,4,3},
							{2,3,4,4,4,4,3,2} };//sets all the accessibility numbers into a 2D array
		Random random = new Random(); //Utilizes import to create a Random object
		int board [] [] = new int [8][8];//sets up the open chess board
		int possibleMoves [] = {-1,1,-2,2}; //an array with possible moves (x and y direction)
		int xIndex = random.nextInt(4);//sets the X axis index to choose from the possibleMoves array
		int yIndexSmallX = random.nextInt(2)+2;//sets the y axis index when the x is either 1 or -1
		int yIndexBigX = random.nextInt(2);//sets the y axis index when the x is either 2 or -2
		int moveX = possibleMoves[xIndex];//sets the x movement to a random number inside the possibleMoves array
		int moveY =0;//sets the original y movement to 0
		
		if (moveX == 1 || moveX == -1) {
			moveY = possibleMoves[yIndexSmallX];
		}//sets the y movement to either 2 or -2
		else if (moveX == 2 || moveX == -2) {
			moveY = possibleMoves[yIndexBigX];
		}//sets the y movement to either 1 or -1
		
		//goes through 
		for(startX = 0; startX<8; startX++) {
			
			for(startY = 0; startY<8; startY++) {
				if(acc[x+moveX][y+moveY] >= acc[x + moveX][y+moveY] ) {
					int x = startX;//updates the x coordinate
					int y = startY;//updates the y coordinate
					x = x+moveX;
					y = y+moveY;
				}
			}
		}
		}
	
	}

