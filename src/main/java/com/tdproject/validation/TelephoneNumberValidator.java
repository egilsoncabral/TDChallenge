/**
 * 
 */
package com.tdproject.validation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

import com.tdproject.counters.AreaCodeCounter;

/**
 * @author egilson 
 * Class used to validate telephone numbers
 */
public class TelephoneNumberValidator {
	/*
	 * Pattern used for validate the follow rules: 
	 * - has either 3 digits or between 7 and 12 digits (inclusive) 
	 * - can have the optional '+' character in the beginning (before any digit) 
	 * - can start with '00', in which case it shouldn't start with the '+' sign 
	 * - if it starts with '00', these two digits don't count to the maximum number of digits 
	 * - cannot have any letters 
	 * - cannot have any symbol aside from the beginning '+' sign
	 */
	private final String VALIDATE_NUMBER_PATTERN = "^((\\+?|0{2})?(\\d{3})|(\\+?|0{2})?(\\d{7,12}))$";
	private final Integer SECOND_POSITION = 1;

	/**
	 * Standard constructor of class.
	 */
	public TelephoneNumberValidator() {
		super();
	}

	/**
	 * @param telephoneList
	 * @param areaCodes
	 * @return List of validated area codes 
	 * Method used for validate the telephone numbers.
	 */
	public LinkedHashMap<String, Integer> validate(ArrayList<String> telephoneList,
			LinkedHashMap<String, Integer> areaCodes) {
		for (String telephoneNumber : telephoneList) {
			if (!isWhiteSpaceOnSecondChar(telephoneNumber)) {
				telephoneNumber = telephoneNumber.replaceAll("\\s+", "");
				if (Pattern.matches(VALIDATE_NUMBER_PATTERN, telephoneNumber)) {
					AreaCodeCounter.countAreaCode(telephoneNumber, areaCodes);
				}
			}
		}
		return areaCodes;
	}

	/**
	 * @param telephoneNumber
	 * @return boolean. 
	 * Used to verify if exist whitespace on second char of the string.
	 */
	private boolean isWhiteSpaceOnSecondChar(String telephoneNumber) {
		return telephoneNumber.length() > 1 && telephoneNumber.startsWith("+")
				&& Character.isWhitespace(telephoneNumber.charAt(SECOND_POSITION));
	}

}
