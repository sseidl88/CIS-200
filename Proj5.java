/*
 * <Proj5>
 * <Samuel Seidl / Lab Section Thursdays 4 / Atef Khan>
 *
 * <Reads in one of the provided text files and displays them in an array with * and . depending on if the value was 1 or zero, then alters that array based upon a provided set of rules>
*/ 
import java.util.*;
import java.io.*;
import java.io.File;

public class Proj5{
		/*
 * <Main method that cals all the other methods>
 *

 */
	public static void main(String [] args)throws IOException{
	
	//Scanner s = new Scanner(System.in);
	Scanner inFile = new Scanner(new File(args[0]));
		String filename = "";
		
		if (args.length == 0){
			System.out.println("No argument was given");
			System.exit(0);
		} else {
			filename = args[0];
		}
		
		int [][] cells = readBoard(filename);
	
		inFile.close();
	
		while(true){
			try{
				Thread.sleep(300);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(boardDisplay(cells)) ;
			cells = update(cells);
		}
		
	} // end of main
	
//read in the text file and display
	/*
 * <This method reads in the chosen file and puts the ones and zeros into a 2D array of ints>
 *
 * <public static int[][] tells what we are going to return from this method and because there is no void that something should be returned>
 * <A 2D array of ints that have been read in from the given text file>
 */
	public static int[][] readBoard(String filename)throws IOException{
			
		Scanner s = new Scanner(new File(filename));
		
		int rows = Integer.parseInt(s.nextLine());
		int colums = Integer.parseInt(s.nextLine());
		
		int [][] board = new int [rows][colums];
			
		for(int i = 0; i < rows; i++){
			String line = s.nextLine();
			for(int j = 0; j < colums; j++){
				
				if ( line.charAt(j) == '1' ) {
					board[i][j] = 1;
				} else if ( line.charAt(j) == '0' ) {
					board[i][j] = 0;
				}
			}
		}		

		return board;
	
	}//end of read board
	
	
	
	/*
 * <This looks at the board of ints returned in the previous method and changes the 1 to "*" and 0 to ".">
 *
 * <This method reads in the 2D array of ints creted in the read board mehtod and looks at each character and makes Strings>
 * <This method will be returning Strings, either * or .>
 */
	public static String boardDisplay(int[][] cells){
		String output = "";
		
		for(int i = 0; i < cells.length; i++){	
			for(int j = 0; j < cells[i].length; j++){
				
				if ( cells[i][j] == 1 ) {
					output += "*";
				} else if ( cells[i][j] == 0 ) {
					output += ".";
				}
			}
			output += System.lineSeparator();
		}	
		return output;
	}//end of board display 

	
	/*
 * <This method is checking the neighbors of a specific cells and seeing how many live cells are next to it>
 *
 * <reading in a 2D array of ints as well as using rows and columns in order to determine how many live neighbors each cell has>
 * <returning an integer saying how many live cells there are next to a dead cell>
 */
	public static int neighbors(int[][] cells, int row, int col){
		int neighbors = 0;
		try {
			if (cells[row-1][col-1] == 1) neighbors++;
			//System.out.print("+1");
		} catch (IndexOutOfBoundsException e){}
		try {
			if (cells[row-1][col] == 1)  neighbors++;
			//System.out.print("+2");}
			} catch (IndexOutOfBoundsException e){}
		try {
			if (cells[row-1][col+1] == 1)  neighbors++;
			//System.out.print("+3");}
			} catch (IndexOutOfBoundsException e){}
		try {
			if (cells[row][col-1] == 1)  neighbors++;
			//System.out.print("+4");}
			} catch (IndexOutOfBoundsException e){}
		try {
			if (cells[row][col+1] == 1)  neighbors++;
			//System.out.print("+6");}
			} catch (IndexOutOfBoundsException e){}
		try {
			if (cells [row+1][col-1] == 1)  neighbors++;
			//System.out.print("+7");}
			} catch (IndexOutOfBoundsException e){}
		try {
			if (cells [row+1][col] == 1)  neighbors++;
			//System.out.print("+8");}
			} catch (IndexOutOfBoundsException e){}
		try {
			if (cells [row+1] [col+1] == 1)  neighbors++;
			//System.out.print("+9");}
		} catch (IndexOutOfBoundsException e) {
		}
		return neighbors;
	}

	/*
 * <Changing cells back and fourth between live and dead based on the given rules which are based upon how many live neighbors they have>
 *
 * <reading in the 2D array cells, that was created in readBoard and then based upon the number of neighbors created in neighbors, altering the array cells >
 * <returning a 2D array of ints that has been changed occording to the rules>
 */
	public static int[][] update(int[][] cells){
		int [][] update = new int [cells.length][cells[1].length];
		
		//System.out.println(neighbors(cells, 6, 19));
		for(int i = 0; i < cells.length; i++){
			for (int j = 0; j < cells[i].length; j++){
				boolean live = false;
				if (cells[i][j] == 1){
					live = true;
				}
				if (live && neighbors(cells, i, j) < 2){
					update[i][j] = 0;
				}else if (!live && neighbors(cells, i, j) !=3){
					update[i][j] = 0;
				}else if (live && (neighbors(cells, i, j) == 2 || neighbors(cells, i, j) == 3)){
					update[i][j] = 1;
				}else if(!live && neighbors(cells, i, j) == 3){
					update[i][j] = 1;
				}else if (live && neighbors(cells, i, j) > 3){
					update[i][j] = 0;
				}else{
					update[i][j] = cells[i][j];
				}
			}
		}
		return update;
	}
} // end of class
	


