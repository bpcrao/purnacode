package org.code;
/**
 * class which can print pascal triangle in 2 ways
 * 1) matrix way 
 * 2) using a formula
 * 
 */

/**
 * @author Purna
 * 
 *         <pre>
 *            1 
 *           1 1
 *          1 2 1 
 *         1 3 3 1 
 *        1 4 6 4 1
 * </pre>
 * 
 */

public class PascalTriangle {

	public static void main(String ar[]) {
		//printPascal(9);
		printPascalMatrix(9);
	}

	/**
	 * print pascal matrix way
	 * 
	 * @param size
	 */
	private static void printPascalMatrix(int size) {
		int[][] pascalTr = new int[size][];
		for (int index = 0; index < size; index++) {
			pascalTr[index] = new int[index + 1];
			for (int colIndex = 0; colIndex < pascalTr[index].length; colIndex++) {
				if (colIndex == 0 || colIndex == index) {
					pascalTr[index][colIndex] = 1;
				} else if (index > 1) {
					pascalTr[index][colIndex] = pascalTr[index - 1][colIndex]
							+ pascalTr[index - 1][colIndex - 1];
				}
			}
		}

		printMatrix(pascalTr);
	}

	private static void printMatrix(int[][] pascalMatrix) {
		for (int i = 0; i < pascalMatrix.length; i++) {
			printSpaces(pascalMatrix.length - i);
			for (int j = 0; j < pascalMatrix[i].length; j++) {
				System.out.print(pascalMatrix[i][j] + " ");
			}
		}

	}

	/**
	 * print pascal with normal way
	 * 
	 * @param size
	 */
	private static void printPascal(int size) {
		for (int lineIndex = 1; lineIndex <= size; lineIndex++) {
			int previousNumber = 1;
			printSpaces(size - lineIndex);
			for (int colIndex = 1; colIndex <= lineIndex; colIndex++) {
				System.out.print(previousNumber + " ");
				previousNumber = previousNumber * (lineIndex - colIndex)
						/ (colIndex);
			}
		}

	}

	/**
	 * indent work for small triangles
	 * 
	 * @param numberOfSpaces
	 */
	private static void printSpaces(int numberOfSpaces) {
		System.out.println();
		for (int index = 0; index < numberOfSpaces; index++) {
			System.out.print(" ");
		}

	}
}
