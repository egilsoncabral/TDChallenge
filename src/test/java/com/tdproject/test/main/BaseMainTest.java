/**
 * 
 */
package com.tdproject.test.main;

import java.util.LinkedHashMap;

import org.junit.Test;

import com.tdproject.main.BaseMainClass;

import junit.framework.Assert;

/**
 * @author egilson
 * Class used for Test the BaseMain.class
 */
public class BaseMainTest {

	private final String FILENAME = "arquivo_telefones.txt";
	
	
	/**
	 * Used for test the sucess case of startProgram method.
	 */
	@Test
	public void startProgramTest() {
		BaseMainClass baseMain = new BaseMainClass();
		LinkedHashMap<String, Integer> result = baseMain.startProgram(FILENAME);
		Assert.assertEquals(result.get("351").toString(), "5");
	}

}
