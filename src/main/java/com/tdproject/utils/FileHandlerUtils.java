/**
 * 
 */
package com.tdproject.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author egilson cabral
 *
 */
public class FileHandlerUtils {
	
	private SortAlgorithm sortAlgorithm;
	
	public FileHandlerUtils(){
		super();
	}
	
	/**
	 * Constructor used for sort the string read on file.
	 * @param sortAlgorithm
	 */
	public FileHandlerUtils(SortAlgorithm sortAlgorithm){
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public ArrayList<String> fileReader(String fileName){
		ArrayList<String> contentFile = new ArrayList<String>();
		try {
	      FileReader arq = new FileReader(fileName);
	      BufferedReader reader = new BufferedReader(arq);
	      
	      String line = reader.readLine(); 
	      while (line != null) {
	    	contentFile.add(line);
	        line = reader.readLine();
	        
	      }
	      arq.close();
	    } catch (IOException e) {
	        System.err.printf("File opening error : %s.\n",
	          e.getMessage());
	    }
		if (sortAlgorithm != null) {
			sortAlgorithm.sort(contentFile);
		}
		return contentFile;
	  }
}

