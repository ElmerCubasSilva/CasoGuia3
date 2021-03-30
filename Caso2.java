package com.senati.eti;
import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese numero....:");
		int n = sc.nextInt();
		
		int i = 1, sumatoria = 0;
	
		while (i<= n) {
			sumatoria += i;
			if (i < n) 
				System.out.print(i + "+" );
			else
				System.out.print(i + " = " + sumatoria);
			i++;
	    }
	}

}
