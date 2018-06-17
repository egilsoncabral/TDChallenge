/**
 * 
 */
package com.tdproject.test.validation;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.junit.Test;

import com.tdproject.validation.TelephoneNumberValidator;

import junit.framework.Assert;

/**
 * @author egilson
 * Tests for the TelephoneNumberValidator.class
 */
public class TelephoneNumberValidatorTest {

	
	/**
	 * Method created to test the method validate for valid and invalid numbers.
	 */
	@Test
	public void validateTelephoneNumberTest() {
		String telephone1 = "+559988 12 34   55";
		String telephone2 = "+ 112";
		ArrayList<String> telephoneList = new ArrayList<>();
		LinkedHashMap<String, Integer> areaCodes = new LinkedHashMap<String, Integer>();
		telephoneList.add(telephone1);
		telephoneList.add(telephone2);
		areaCodes.put("1", 0);
		areaCodes.put("55", 0);
		TelephoneNumberValidator telephoneNumberValidator = new TelephoneNumberValidator();
		LinkedHashMap<String, Integer> result = telephoneNumberValidator.validate(telephoneList, areaCodes);
		Assert.assertEquals(result.get("1").toString(), "0");
		Assert.assertEquals(result.get("55").toString(), "1");
	}

}
