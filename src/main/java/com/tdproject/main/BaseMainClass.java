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
 *
 */
public class BaseMainClass {

	private FileHandlerUtils fileHandler;
	
	private TelephoneNumberValidator telephoneValidation;
	
	public BaseMainClass() {
		super();
		this.fileHandler = new FileHandlerUtils();
		this.telephoneValidation = new TelephoneNumberValidator();
	}



	public LinkedHashMap<String, Integer> startProgram(String fileName){
		ArrayList<String> telephoneNumbers = fileHandler.fileReader(fileName);
		fileHandler = new FileHandlerUtils(new QuickSortAlgorithmImpl());
		ArrayList<String> areaCodes = fileHandler.fileReader("area_codes.txt");
		return telephoneValidation.validate(telephoneNumbers, fillMap(areaCodes));
	}
	
	private LinkedHashMap<String, Integer> fillMap(ArrayList<String> areaCodes){
		LinkedHashMap<String, Integer> areaCodeMap = new LinkedHashMap<String, Integer>();
		for (String areaCode : areaCodes) {
			areaCodeMap.put(areaCode, 0);
		}
		return areaCodeMap;
	}
}
