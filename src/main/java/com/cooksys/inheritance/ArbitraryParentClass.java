package com.cooksys.inheritance;

public abstract class ArbitraryParentClass {
	
	public ArbitraryParentClass(String nothingImportant) {
		System.out.println(nothingImportant);
	}
	
	public void realMethod()
	{
		System.out.println("Hello!");
		
		String s = new String("abc");
		
		kindaRealMethod(s);
		
		System.out.println(s);
	}
	
	public void kindaRealMethod(String val)
	{
		System.out.println(val);
		
		val = new String("xyz");
		
		System.out.println(val);
	}
	
	public abstract Integer unimplementedMethod();
}
