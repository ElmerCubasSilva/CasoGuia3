package com.senati.eti;
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] numeros=new int[5];

		
		System.out.print("Ingrese n�mero 1 : ");
		numeros[0]=sc.nextInt();
		System.out.print("Ingrese n�mero 2 : ");
		numeros[1]=sc.nextInt();
		System.out.print("Ingrese n�mero 3 : ");
		numeros[2]=sc.nextInt();
		System.out.print("Ingrese n�mero 4 : ");
		numeros[3]=sc.nextInt();
		System.out.print("Ingrese n�mero 5 : ");
		numeros[4]=sc.nextInt();
		sc.close();
		
		int menor=numeros[0];
		
		for(int num:numeros) {
			if(num<menor)
				menor=num;
		}
		
		System.out.print("El n�mero menor es : "+menor);

	}

}
