/**
 * 
 */
package com.tdprojects.test.counters;

import java.util.LinkedHashMap;

import org.junit.Test;

import com.tdproject.counters.AreaCodeCounter;

import junit.framework.Assert;

/**
 * @author egilson
 *	Tests for AreaCodeCounter.class
 */
public class AreaCodeCounterTest {

	/**
	 * Created for test the sucess case of the method coundAreaCode
	 */
	@Test
	public void countAreaCodeTest() {
		String telephoneNumber = "351960000000";
		LinkedHashMap<String, Integer> areaCodes = new LinkedHashMap<String, Integer>();
		areaCodes.put("351", 0);
		AreaCodeCounter.countAreaCode(telephoneNumber, areaCodes);
		Assert.assertEquals(areaCodes.get("351").toString(), "1");
	}
	
	/**
	 * Created to test the others options of numbers, increasing the covering.
	 */
	@Test
	public void countAreaCodeWithSignNumberTest() {
		String telephoneNumber = "+351960000000";
		LinkedHashMap<String, Integer> areaCodes = new LinkedHashMap<String, Integer>();
		areaCodes.put("351", 0);
		AreaCodeCounter.countAreaCode(telephoneNumber, areaCodes);
		Assert.assertEquals(areaCodes.get("351").toString(), "1");
	}
	
	/**
	 * Created to test the others options of numbers, increasing the covering.
	 */
	@Test
	public void countAreaCodeWithZerosNumberTest() {
		String telephoneNumber = "00351960000000";
		LinkedHashMap<String, Integer> areaCodes = new LinkedHashMap<String, Integer>();
		areaCodes.put("351", 0);
		AreaCodeCounter.countAreaCode(telephoneNumber, areaCodes);
		Assert.assertEquals(areaCodes.get("351").toString(), "1");
	}
	
	/**
	 * Created to test the others options of numbers, increasing the covering.
	 */
	@Test
	public void countAreaCodeZeroNumberTest() {
		String telephoneNumber = "000";
		LinkedHashMap<String, Integer> areaCodes = new LinkedHashMap<String, Integer>();
		areaCodes.put("351", 0);
		AreaCodeCounter.countAreaCode(telephoneNumber, areaCodes);
		Assert.assertEquals(areaCodes.get("351").toString(), "0");
	}
	
	/**
	 * Created to test the constructor of the class.
	 */
	@Test
	public void countAreaCodeWithConstructorTest() {
		String telephoneNumber = "00351960000000";
		LinkedHashMap<String, Integer> areaCodes = new LinkedHashMap<String, Integer>();
		areaCodes.put("351", 0);
		AreaCodeCounter areaCodeCounter = new AreaCodeCounter();
		areaCodeCounter.countAreaCode(telephoneNumber, areaCodes);
		Assert.assertEquals(areaCodes.get("351").toString(), "1");
	}

}
