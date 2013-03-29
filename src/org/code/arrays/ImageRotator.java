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
	 * @param imageMatrix
	 * @param size
	 */
	private static void rotate(int[][] imageMatrix, int size) {
		for (int i = 0; i < size / 2; i++) {
			for (int j = i; j < imageMatrix.length - 1 - i; j++) {
				int temp = imageMatrix[i][j];
				imageMatrix[i][j] = imageMatrix[j][size - 1 - i];
				imageMatrix[j][size - 1 - i] = imageMatrix[size - 1 - i][size
						- 1 - j];
				imageMatrix[size - 1 - i][size - 1 - j] = imageMatrix[size - 1
						- j][i];
				imageMatrix[size - 1 - j][i] = temp;
			}
		}
	}

	private static void printMatrix() {
		for (int i = 0; i < imageMatrix.length; i++) {
			for (int j = 0; j < imageMatrix.length; j++) {
				System.out.print(" "+" "+imageMatrix[i][j] );
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
