package main;

import java.util.Scanner;

public class inverso_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese la cadena: ");
		String can= scan.nextLine();
		int lon = can.length();
		int i=lon-1;
		String aux= "";
		while(i>=0)
		{
			aux+=can.charAt(i) ;
			i--;
		}
		System.out.println("Palabra Invertida: "+aux);
	}

}
