/**
 * 
 */
package org.code.arrays;

/**
 * @author Purna
 * 
 */
public class ImageRotator {

	public static int[][] imageMatrix = { { 00, 01, 02, 03 },
			{ 10, 11, 12, 13 }, { 20, 21, 22, 23 }, { 30, 31, 32, 33 } };

	/**
	 * @param matrix
	 * @param size
	 */
	private static void rotate(int[][] matrix, int size) {
		for (int i = 0; i < size / 2; i++) {
			for (int j = i; j < matrix.length - 1 - i; j++) {
				
//				System.out.println(i+","+j);
//				System.out.println(j+","+(size - 1 - i));				
//				System.out.println((size - 1 - i)+","+(size - 1 - j));
//				System.out.println((size - 1 - j)+","+i);
				
				
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][size - 1 - i];
				matrix[j][size - 1 - i] = matrix[size - 1 - i][size - 1 - j];
				matrix[size - 1 - i][size - 1 - j] = matrix[size - 1 - j][i];
				matrix[size - 1 - j][i] = temp;
			//	break;
			}
			//break;
		}
	}

	private static void printMatrix() {
		for (int i = 0; i < imageMatrix.length; i++) {
			for (int j = 0; j < imageMatrix.length; j++) {
				System.out.print(" " + " " + imageMatrix[i][j]);
			}
			System.out.println("");
		}
		System.out.println("----------------");
	}

	public static void main(String as[]) {
		printMatrix();
		rotate(imageMatrix, 4);
		printMatrix();
	}
}
