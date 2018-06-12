/**
 * 
 */
package com.tdproject.utils;

import java.util.ArrayList;

/**
 * @author egils
 *
 */
public class QuickSortAlgorithmImpl implements SortAlgorithm{

	private ArrayList<String> orderList = new ArrayList<String>();
	
	public void sort(ArrayList<String> numbers) {
		int[] vetor = new int[numbers.size()];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(numbers.get(i));
		}
		quickSort(vetor, 0, vetor.length - 1);
		
		for (int i = 0; i < vetor.length; i++) {
			orderList.add(String.valueOf(vetor[i]));
		}
   }
	
	private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
               int posicaoPivo = split(vetor, inicio, fim);
               quickSort(vetor, inicio, posicaoPivo - 1);
               quickSort(vetor, posicaoPivo + 1, fim);
        }
  }

  private static int split(int[] vector, int begin, int end) {
        int pivo = vector[begin];
        int i = begin + 1, f = end;
        while (i <= f) {
               if (vector[i] <= pivo)
                      i++;
               else if (pivo < vector[f])
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
        vector[f] = pivo;
        return f;
  }

}
