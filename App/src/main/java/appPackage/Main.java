package appPackage;

import utilPackage.UtilClass;

public class Main {

	public static void main(String[] args) {
		System.out.println(Main.introduceYourself("Raúl"));
	}

	public static String introduceYourself(String name) {
		return UtilClass.join("Hello, my name is ", name);
	}

}
