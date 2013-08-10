package org.test;

public class HelloWorld {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hw= new HelloWorld();
		hw.setName("Senthi");
		System.out.println("Hello World 1 1");
	}

}
