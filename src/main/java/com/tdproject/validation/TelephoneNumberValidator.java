/**
 * 
 */
package com.tdproject.validation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

import com.tdproject.counters.AreaCodeCounter;

/**
 * @author egils
 *
 */
public class TelephoneNumberValidator {

	private final String VALIDATE_NUMBER_PATTERN = "^((\\+?|0{2})?(\\d{3})|(\\+?|0{2})?(\\d{7,12}))$";
	private final Integer SECOND_POSITION = 1;
	
	public TelephoneNumberValidator(){
		super();
	}

	public LinkedHashMap<String, Integer> validate(ArrayList<String> telephoneList, LinkedHashMap<String, Integer> areaCodes) {
		for (String telephoneNumber : telephoneList) {
			if (!isWhiteSpaceOnSecondChar(telephoneNumber)) {
				if (Pattern.matches(VALIDATE_NUMBER_PATTERN, telephoneNumber)) {
					AreaCodeCounter.countAreaCode(telephoneNumber, areaCodes);
				} 
			}
		}
		return areaCodes;

	}


	private boolean isWhiteSpaceOnSecondChar(String telephoneNumber) {
		return telephoneNumber.length() > 1 && telephoneNumber.startsWith("+") && 
				Character.isWhitespace(telephoneNumber.charAt(SECOND_POSITION));
	}

}
