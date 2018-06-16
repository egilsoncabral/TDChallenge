/**
 * 
 */
package com.tdproject.main;

import java.util.LinkedHashMap;

/**
 * @author egilson 
 * Program used to validate area codes.
 */
public class MainClass {

	/**
	 * @param args
	 * Start method
	 */
	public static void main(String[] args) {
		String fileName = args[0];
		BaseMainClass baseClass = new BaseMainClass();
		LinkedHashMap<String, Integer> countedAreaCodes = baseClass.startProgram(fileName);
		printAreaCodes(countedAreaCodes);
		System.exit(0);

	}

	/**
	 * @param countedAreaCodes
	 *  A method used to print area codes with some accounted value.
	 */
	private static void printAreaCodes(LinkedHashMap<String, Integer> countedAreaCodes) {
		for (String code : countedAreaCodes.keySet()) {
			if (countedAreaCodes.get(code) > 0) {
				System.out.println(code + ":" + countedAreaCodes.get(code).toString());
			}
		}
	}
}