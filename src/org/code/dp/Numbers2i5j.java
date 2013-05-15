/**
 * 
 */
package org.code.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Purna
 * 
 */
public class Numbers2i5j {


	public static void main(String[] args) {
		List<Integer> result = new ArrayList<Integer>();
		result.add(Integer.valueOf(1));

		int x2Index = 0;
		int x5Index = 0;

		int curr = result.get(result.size() - 1);

		int x2 = curr * 2;
		int x5 = curr * 5;

		for (int i = 0; i < 5; i++) {

			int minimum = Math.min(x2, x5);
			result.add(Integer.valueOf(minimum));
			if (x2 == minimum) {
				x2Index++;
				x2 = 2 * result.get(x2Index);

			}
			if (x5 == minimum) {
				x5Index++;
				x5 = 5 * result.get(x5Index);
			}
		}
		System.out.println(result);
	}
}
