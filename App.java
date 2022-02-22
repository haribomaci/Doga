/*
* File: App.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 1/n
* Date: 2022-02-22
* Github: https://github.com/haribomaci/
* Licenc: GNU GPL
 */

import java.util.Scanner;
public class App {
	
	public static void main (String[] args) {
			System.out.println("Toth Julia, 2022-02-16, Szoft 1/N, dolgozat");
			System.out.println("Feladat: 0349");
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Kerem az epulet magassagat: ");
			double magassag = scan.nextDouble();
			System.out.println("Kerem a szoget: ");
			double szog = scan.nextDouble();
			
			
			double tavolsag = magassag / szog;
			System.out.println("A Tavolsag az epulet es a szemely kozott: " + tavolsag);
			
			
		
	}
}

