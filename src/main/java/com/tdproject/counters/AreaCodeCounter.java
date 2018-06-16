/**
 * 
 */
package com.tdproject.counters;

import java.util.LinkedHashMap;

/**
 * @author egilson
 *	Class used for count the area codes of telephone numbers validated.
 *
 */
public class AreaCodeCounter {

	private static StringBuilder areaCodeExtract;

	/**
	 * Standard constructor of the class
	 */
	public AreaCodeCounter() {
		super();
	}

	/**
	 * @param telephoneNumber
	 * @param areaCodes
	 * Used for count the area codes
	 */
	public static void countAreaCode(String telephoneNumber, LinkedHashMap<String, Integer> areaCodes) {
		String areaCodeAndTelephone = removeZerosAndPlus(telephoneNumber);
		int valueToCount = 1;
		String areaCodeFound = findAreaCode(areaCodeAndTelephone, areaCodes);
		if (areaCodeFound != null) {
			valueToCount += areaCodes.get(areaCodeFound);
			areaCodes.put(areaCodeFound, valueToCount);
		}

	}

	/**
	 * @param telephoneNumber
	 * @param areaCodes
	 * @return area code
	 * Used for find the area code from a telephone number.
	 */
	private static String findAreaCode(String telephoneNumber, LinkedHashMap<String, Integer> areaCodes) {
		areaCodeExtract = new StringBuilder(telephoneNumber.substring(0, 3));
		for (int i = 1; i <= areaCodeExtract.length(); i++) {
			if (areaCodes.containsKey(areaCodeExtract.substring(0, i))) {
				return areaCodeExtract.substring(0, i);
			}
		}
		return null;
	}

	/**
	 * @param telephoneNumber
	 * @return telephone without "+" or "00"
	 * Used for remove the sign of "+" and the zeros from the number
	 */
	private static String removeZerosAndPlus(String telephoneNumber) {
		if (telephoneNumber.startsWith("+")) {
			telephoneNumber = telephoneNumber.substring(1, telephoneNumber.length());
		} else if (telephoneNumber.startsWith("00") && telephoneNumber.length() > 3) {
			telephoneNumber = telephoneNumber.substring(2, telephoneNumber.length());
		}
		return telephoneNumber;
	}

}
