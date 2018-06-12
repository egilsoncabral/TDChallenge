/**
 * 
 */
package com.tdproject.main;

/**
 * @author egilson
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		String fileName = args[0];
		BaseMainClass baseClass = new BaseMainClass();
		baseClass.startProgram(fileName);
		System.exit(0);
		
	}
}