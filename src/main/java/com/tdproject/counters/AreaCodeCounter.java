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

	 
	
    public AreaCodeCounter() {
    }
 
    
    public static void countAreaCode(String telephoneNumber, LinkedHashMap<String, Integer> areaCodes) {
    	removeZerosAndPlus(telephoneNumber);
    	int valueToCount = 1;
    	String areaCodeFound = findAreaCode(telephoneNumber, areaCodes);
    	if (areaCodeFound != null) {
    		valueToCount += areaCodes.get(areaCodeFound);
    		areaCodes.put(areaCodeFound, valueToCount);	
		}
    	
	}
    
    private static String findAreaCode(String telephoneNumber, LinkedHashMap<String, Integer> areaCodes) {
    	StringBuilder areaCodeExtract = new StringBuilder(telephoneNumber.substring(0,3));
    	for (int i = 1; i <= areaCodeExtract.length(); i++) {
			if (areaCodes.containsKey(areaCodeExtract.substring(0,i))) {
				return areaCodeExtract.substring(0,i); 
			}
		}
		return null;
	}


	private static void removeZerosAndPlus(String telephoneNumber) {
		if (telephoneNumber.startsWith("+")) {
			telephoneNumber.substring(1);
		}else if (telephoneNumber.startsWith("00")) {
			telephoneNumber.substring(2);
		}
	}
	
	
}
