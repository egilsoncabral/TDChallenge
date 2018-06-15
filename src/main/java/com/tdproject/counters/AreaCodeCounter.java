/**
 * 
 */
package com.tdproject.counters;

import java.util.LinkedHashMap;

/**
 * @author egilson
 *
 */
public class AreaCodeCounter {

	private static StringBuilder areaCodeExtract;

	public AreaCodeCounter() {
		super();
		areaCodeExtract = new StringBuilder();
	}

	public static void countAreaCode(String telephoneNumber, LinkedHashMap<String, Integer> areaCodes) {
		String areaCodeAndTelephone = removeZerosAndPlus(telephoneNumber);
		areaCodeAndTelephone.replace(" ", "");
		int valueToCount = 1;
		String areaCodeFound = findAreaCode(areaCodeAndTelephone, areaCodes);
		if (areaCodeFound != null) {
			valueToCount += areaCodes.get(areaCodeFound);
			areaCodes.put(areaCodeFound, valueToCount);
		}

	}

	private static String findAreaCode(String telephoneNumber, LinkedHashMap<String, Integer> areaCodes) {
		if (telephoneNumber.length() <= 3) {
			if (areaCodes.containsKey(telephoneNumber)) {
				return telephoneNumber;
			}
		} else {
			areaCodeExtract.insert(0, telephoneNumber.substring(0, 3));
			for (int i = 1; i <= areaCodeExtract.length(); i++) {
				if (areaCodes.containsKey(areaCodeExtract.substring(0, i))) {
					return areaCodeExtract.substring(0, i);
				}
			}
		}
		return null;
	}

	private static String removeZerosAndPlus(String telephoneNumber) {
		String telephoneFormated = telephoneNumber;
		if (telephoneNumber.startsWith("+")) {
			telephoneFormated = telephoneNumber.substring(1, telephoneNumber.length());
		} else if (telephoneNumber.startsWith("00")) {
			telephoneFormated = telephoneNumber.substring(2, telephoneNumber.length());
		}
		return telephoneFormated;
	}

}
