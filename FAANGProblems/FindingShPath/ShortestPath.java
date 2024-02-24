package FAANGProblems.FindingShPath;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {

	public static void main(String[] args) {
		
		int[][] Grid = {{1,1,1,1,0},{0,0,0,1,0},{0,0,1,1,0}, {0,0,1,9,0}};
		Queue<Cell> q = new LinkedList<Cell>();
		move(Grid, q, 0, 0, 0);
		
		while(!q.isEmpty()) {
			Cell bootCell = q.poll();
			// to the left
			move(Grid, q, bootCell.rowIndex-1, bootCell.colIndex, bootCell.distance+1);
			
			// to the right
			move(Grid, q, bootCell.rowIndex+1, bootCell.colIndex, bootCell.distance+1);
			
			// to the top 
			move(Grid, q, bootCell.rowIndex, bootCell.colIndex-1, bootCell.distance+1);

			// to the button
			move(Grid, q, bootCell.rowIndex, bootCell.colIndex+1, bootCell.distance+1);

		}
		
	}
	
	public static void move(int[][] Grid, Queue<Cell> q, int rowIndex, int colIndex, int distance) {
		if(rowIndex>=0 && rowIndex<Grid.length && colIndex>=0 && colIndex <Grid.length) {
			if(Grid[rowIndex][colIndex]==1) {
				q.add(new Cell(rowIndex, colIndex, distance));
				Grid[rowIndex][colIndex]=-1;
			}
			
			 else if(Grid[rowIndex][colIndex]==9) {
				System.out.println("The path is found, the distance is "+distance);
				System.exit(0);
			}
		
		
		}
	
	}

}
