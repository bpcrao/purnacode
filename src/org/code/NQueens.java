/**
 * 
 */
package org.code;

/**
 * @author Purna
 * 
 */
public class NQueens {

	public int[] queenPlaceInRow;
	int size;

	/**
	 * 
	 */
	public NQueens(int size) {
		queenPlaceInRow = new int[size];
		this.size = size;
		for (int i = 0; i < size; i++) {
			queenPlaceInRow[i] = Integer.MAX_VALUE;
		}
	}

	public static void main(String[] args) {
		NQueens nQueens = new NQueens(4);
		nQueens.placeQueen(0);
	}

	/**
	 * @param row
	 */
	private void placeQueen(int row) {
		if (row == this.size) {
			printBoard();
			return;
		}
		for (int col = 0; col < this.size; col++) {
			queenPlaceInRow[row] = col;
			if (check(row)) {
				placeQueen(row + 1);
			}
		}

	}

	/**
	 * @param row
	 * @return
	 */
	private boolean check(int row) {
		for (int index = 0; index < row; index++) {
			int diffX = Math.abs(queenPlaceInRow[index] - queenPlaceInRow[row]);
			int diffY = row - index;
			if (diffX == 0 || diffY == diffX) {
				return false;
			}

		}
		return true;
	}

	/**
	 * 
	 */
	private void printBoard() {
		System.out.println("------------------------");
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				if (queenPlaceInRow[i] == j) {
					System.out.print(" Q ");
				} else {
					System.out.print(" . ");
				}

			}
			System.out.println();

		}
		System.out.println("------------------------");

	}
}
