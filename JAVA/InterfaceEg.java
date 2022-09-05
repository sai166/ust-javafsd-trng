package com.ust;

interface Vechile {
	public abstract String getColour();
	public   abstract String  getEngineType();
	public static final int x=4;
}
	
	


 abstract public class InterfaceEg implements Vechile{
	public String getColour()

	{
		return "Green";
	}

	/**public String getEngineType(){
	return "Mannual";
 }
 */
}
