/**
 * 
 */
package com.tdproject.utils;

import java.util.ArrayList;

/**
 * @author egilson
 * Class used to sort the area codes
 */
public class QuickSortAlgorithmImpl implements SortAlgorithm {

	private ArrayList<String> orderList = new ArrayList<String>();

	/* (non-Javadoc)
	 * @see com.tdproject.utils.SortAlgorithm#sort(java.util.ArrayList)
	 */
	public ArrayList<String> sort(ArrayList<String> numbers) {
		int[] vector = new int[numbers.size()];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Integer.parseInt(numbers.get(i));
		}
		quickSort(vector, 0, vector.length - 1);

		for (int i = 0; i < vector.length; i++) {
			orderList.add(String.valueOf(vector[i]));
		}
		return orderList;
	}

	/**
	 * @param vector
	 * @param begin
	 * @param end
	 * Method used to do the sort by QuickSort way.
	 */
	private static void quickSort(int[] vector, int begin, int end) {
		if (begin < end) {
			int pivotPosition = split(vector, begin, end);
			quickSort(vector, begin, pivotPosition - 1);
			quickSort(vector, pivotPosition + 1, end);
		}
	}

	/**
	 * @param vector
	 * @param begin
	 * @param end
	 * @return Pivot Position
	 * Method used to split the vector and move the pivot position.
	 */
	private static int split(int[] vector, int begin, int end) {
		int pivot = vector[begin];
		int i = begin + 1, f = end;
		while (i <= f) {
			if (vector[i] <= pivot)
				i++;
			else if (pivot < vector[f])
				f--;
			else {
				int change = vector[i];
				vector[i] = vector[f];
				vector[f] = change;
				i++;
				f--;
			}
		}
		vector[begin] = vector[f];
		vector[f] = pivot;
		return f;
	}

}
