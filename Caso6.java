package com.senati.eti;
import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nr = 0, edad = 0, num_aptos = 0;
		String nombre ="" , estado ="" , continuar= "S";
		
		while (continuar.equals("S") || continuar.equals("S")) 
		{
			nr++;
			
			
			System.out.println("----------------------------------------------");
			System.out.println("-------- R E G I S T R O [" + nr + "] ----------");
			System.out.println("----------------------------------------------");
			
			System.out.print("Nombre del participante....:");
			nombre= sc.nextLine();
			System.out.print("Edad del participante......:");
			edad= sc.nextInt();
			if (edad >= 18) {
				estado="Apto para votar ";
				num_aptos++;
			}
			else 
				estado = "Menor de edad ";
			System.out.print("Estado....................:" + estado);
			sc.nextLine();
			
			System.out.print("¿Desea registrar otro participante <S/N>");
			continuar = sc.nextLine();
		}
		
		System.out.println("\n-- R E S U M E N --");
		System.out.println("Cantidad de participantes........:"+ nr);
		System.out.println("Participantes Aptos para votar...:"+num_aptos);
	}

}
