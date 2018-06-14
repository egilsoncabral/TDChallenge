/**
 * 
 */
package com.tdproject.main;

import java.util.LinkedHashMap;

/**
 * @author egilson
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = args[0];
		BaseMainClass baseClass = new BaseMainClass();
		LinkedHashMap<String, Integer> countedAreaCodes = baseClass.startProgram(fileName);
		printAreaCodes(countedAreaCodes);
		System.exit(0);

	}

	private static void printAreaCodes(LinkedHashMap<String, Integer> countedAreaCodes) {
		for (String code : countedAreaCodes.keySet()) {
			System.out.println(code + ":" + countedAreaCodes.get(code).toString());

		}

	}
}