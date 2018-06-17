/**
 * 
 */
package com.tdproject.test.utils;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.tdproject.utils.FileHandlerUtils;
import com.tdproject.utils.QuickSortAlgorithmImpl;

import junit.framework.Assert;

/**
 * @author egilson
 * Class used for test the FileHandlerUtils.class 
 */
public class FileHandlerUtilsTest {
	
	private final String AREA_CODE_FILENAME = "area_codes.txt";
	private final String AREA_CODE_INVALID_FILENAME = "test.txt";
	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	/**
	 * Test for the file reader method without sort.
	 */
	@Test
	public void fileReaderTest() {
		FileHandlerUtils fileHandlerUtils = new FileHandlerUtils();
		ArrayList<String> resultList = fileHandlerUtils.fileReader(AREA_CODE_FILENAME);
		Assert.assertEquals(resultList.get(0), "1");
		Assert.assertEquals(resultList.get(1), "20");
	}
	
	/**
	 * Test for the file reader method with sort.
	 */
	@Test
	public void fileReaderWithSortAlgorithmTest() {
		FileHandlerUtils fileHandlerUtils = new FileHandlerUtils(new QuickSortAlgorithmImpl());
		ArrayList<String> resultList = fileHandlerUtils.fileReader(AREA_CODE_FILENAME);
		Assert.assertEquals(resultList.get(0), "1");
		Assert.assertEquals(resultList.get(1), "7");
	}
	
	/**
	 * Test for the file reader method with throw exception.
	 */
	@Test
	public void fileReaderErrorTest() {
		try {
			FileHandlerUtils fileHandlerUtils = new FileHandlerUtils();
			fileHandlerUtils.fileReader(AREA_CODE_INVALID_FILENAME);
	    } catch (Exception f) {
	        assertThat(f.getMessage(), CoreMatchers.anything(AREA_CODE_INVALID_FILENAME));
	    }
	}

}
