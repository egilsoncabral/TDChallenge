/**
 * 
 */
package com.tdproject.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * @author egils
 *
 */
public class TelephoneNumberValidator {

	private final String VALIDATE_NUMBER_PATTERN = "^((\\+?|0{2})?(\\d{3})|(\\+?|0{2})?(\\d{7,12}))$";
	private final Integer SECOND_POSITION = 1;

	public void validate(ArrayList<String> telephoneList, HashMap<String, Integer> hashAreaCodes) {

		for (String telephoneNumber : telephoneList) {
			if (!isWhiteSpaceOnSecondChar(telephoneNumber)) {
				if (Pattern.matches(VALIDATE_NUMBER_PATTERN, telephoneNumber)) {
					System.out.println("Telefone válido: " + telephoneNumber);
				} else {
					System.out.println("Telefone inválido: " + telephoneNumber);
				}
			}
		}

	}

	private boolean isWhiteSpaceOnSecondChar(String telephoneNumber) {
		return telephoneNumber.length() > 1 && telephoneNumber.startsWith("+") && 
				Character.isWhitespace(telephoneNumber.charAt(SECOND_POSITION));
	}

}
