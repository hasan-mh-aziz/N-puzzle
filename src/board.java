
import java.util*;

public class Board {
 public Board(int[ ][] blocks){
	 
	 
 }  // construct a board from an N-by-N
//array of blocks
 // (where blocks[i][j] = block in
//row i, column j)
 public int size; // board size N
 public int hamming(){
	 
 }  // number of blocks out of place
 
 public int manhattan(){
	 
 } // sum of Manhattan distances between blocks and goal
 public boolean isGoal(){
	 
 } // is this board the goal board?
 public boolean isSolvable(){
	 
 }  // is the board solvable?
 public boolean equals(Object y){
	 
 } // does this board equal y?
 public Iterable<Board> neighbors(){
	 
 } // all neighboring boards
 public String toString(){
	 
 } // string representation of the
//board (in the output format specified below)
 public static void main(String[] args){
	 
	 
	 Scanner in = new Scanner(System.in);
	 int N;
	 N=in.nextInt();
	 
	 board b(N);
	 b.size=N;
	 
	 
 } // unit test
}


