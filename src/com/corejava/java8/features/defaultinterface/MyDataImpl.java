package com.corejava.java8.features.defaultinterface;

public class MyDataImpl implements MyData {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");
		return str == null;
	}

	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		//calling the default method of interface
		obj.print("");

		//calling the static method of interface
		obj.isNull("xyz");	/*OR*/		MyData.isNull("abc");
	}
}
