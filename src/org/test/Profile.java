package org.test;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Profile {
	private Profile(int w) {
		System.out.println(w);
	}
	public Profile() {
		System.out.println(10);
	}
	public static void main(String[] args) {
		Profile obj= new Profile(50);
	}
}
