package com.gsww.java.enumeration;

public enum Coin {
	penny("Hello",1), nickel("World",2), dime("Welcome",3), quarter("Hello World",4);

	private String value;
	private int index;

	private Coin(String value, int index) {
		this.value = value;
		this.index = index;
	}

	public String getValue() {
		return value;
	}

	public int getIndex() {
		return index;
	}

	public static void main(String[] args) {
		Coin coin = Coin.penny;
		System.out.println(coin.getValue());
		System.out.println(coin.getIndex());
		
		for(Coin c:Coin.values()){
			System.out.println(c.getIndex()+","+c.getValue());
		}
	}

}
