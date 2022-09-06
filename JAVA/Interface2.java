package com.ust2;
// create an interface
interface Language {
	void getName(String name);

}
//class implementation interface
class ProgrammingLanguage implements Language {
	
	//implementation of abstract method
	public void getName(String name) {
		System.out.println("Programing Language:"+name);
	}
}
class Interface2{
	public static void main(String[] args) {
		ProgrammingLanguage language=new ProgrammingLanguage();
		language.getName("Java");
	}
}
