/**
 * 
 */
package com.tdproject.main;

import java.util.ArrayList;
import java.util.HashMap;

import com.tdproject.utils.FileHandlerUtils;
import com.tdproject.utils.QuickSortAlgorithmImpl;
import com.tdproject.validation.TelephoneValidation;

/**
 * @author egilson
 *
 */
public class BaseMainClass {

	private FileHandlerUtils fileHandler;
	
	private TelephoneValidation telephoneValidation;
	
	public BaseMainClass() {
		super();
		this.fileHandler = new FileHandlerUtils();
		this.telephoneValidation = new TelephoneValidation();
	}



	public void startProgram(String fileName){
		ArrayList<String> telephoneNumbers = fileHandler.fileReader(fileName);
		fileHandler = new FileHandlerUtils(new QuickSortAlgorithmImpl());
		ArrayList<String> areaCodes = fileHandler.fileReader("area_codes.txt");
		telephoneValidation.validate(telephoneNumbers, fillMap(areaCodes));
	}
	
	private HashMap<String, Integer> fillMap(ArrayList<String> areaCodes){
		HashMap<String, Integer> areaCodeMap = new HashMap<String, Integer>();
		for (String areaCode : areaCodes) {
			areaCodeMap.put(areaCode, 0);
		}
		return areaCodeMap;
	}
}
