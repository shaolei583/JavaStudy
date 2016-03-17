package com.gsww.java.exam;

/**
 * ≤‚ ‘¿‡
 * @author shaol
 *
 */
public class MyTest {

	public void add() {
		System.out.println("add()");
	}

	@Test
	public void edit() {
		System.out.println("edit()");
	}

	@Test
	public void update(String id, String name) {
		System.out.println("update()");
	}

	@Test
	public void delete(String id) {
		System.out.println("delete()");
	}
	
	@Test
	public void welocme(){
		System.out.println("welcome()");
	}
}
