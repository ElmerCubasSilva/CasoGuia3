package com.senati.eti;
import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		System.out.print("Ingrese un número : ");
		num=sc.nextInt();
		sc.close();
		
		int ind=1;
		int res=1;
		if(num<=7 && num>0) {
			while(ind<=num) {
				res*=ind;
				ind++;
			}
			System.out.println("El factorial de "+num+" es : "+res);
		} else {
			System.out.println("El número es superior a 7");
		}

	}

}
