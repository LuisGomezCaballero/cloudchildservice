package com.luisgomezcaballero.cloudchildservice;

public class MyBean {

	private String myString;
	private int port;

	public MyBean() {

	}

	public MyBean(String myString, int port) {
		super();
		this.myString = myString;
		this.port = port;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "MyBean [myString=" + myString + ", port=" + port + "]";
	}

}