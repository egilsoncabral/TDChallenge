/**
 * 
 */
package com.tdproject.main;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.tdproject.utils.FileHandlerUtils;
import com.tdproject.utils.QuickSortAlgorithmImpl;
import com.tdproject.validation.TelephoneNumberValidator;

/**
 * @author egilson 
 * Orchestrator class of program features.
 *
 */
public class BaseMainClass {

	private FileHandlerUtils fileHandler;

	private TelephoneNumberValidator telephoneValidation;

	/**
	 * Standard constructor of class
	 */
	public BaseMainClass() {
		super();
		this.fileHandler = new FileHandlerUtils();
		this.telephoneValidation = new TelephoneNumberValidator();
	}

	/**
	 * @param fileName
	 * @return List of areaCodes validated and counted.
	 * Initial method used to make the file read call and number validation 
	 */
	public LinkedHashMap<String, Integer> startProgram(String fileName) {
		ArrayList<String> telephoneNumbers = fileHandler.fileReader(fileName);
		fileHandler = new FileHandlerUtils(new QuickSortAlgorithmImpl());
		ArrayList<String> areaCodes = fileHandler.fileReader("area_codes.txt");
		return telephoneValidation.validate(telephoneNumbers, fillMap(areaCodes));
	}

	/**
	 * @param areaCodes
	 * @return Map of Area codes.
	 * Method used to fill the map with area codes sorted. 
	 */
	private LinkedHashMap<String, Integer> fillMap(ArrayList<String> areaCodes) {
		LinkedHashMap<String, Integer> areaCodeMap = new LinkedHashMap<String, Integer>();
		for (String areaCode : areaCodes) {
			areaCodeMap.put(areaCode, 0);
		}
		return areaCodeMap;
	}
}
