package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		int nr = 0, n1= 0 ,n2=0,n3=0 ,num_aptos = 0 ,no_aptos=0;
		String nombre = "",estado="", continuar ="S";
		
		 String MayorPromedio="" , MenorPromedio="";
		    float mayor=0 ;
		    float menor=100;
		    
		while (continuar.equals("S") || continuar.equals("s")) {
			nr++;
			System.out.println("---------------------------");
			System.out.println("----R e g i s t r o [" + nr + "]----");
			System.out.println("---------------------------");
			
			System.out.print("Ingrese nombre del alumno.....:");
		    nombre = sc.nextLine();
		
		    System.out.print("Ingrese nota 1 : ");
		    n1 = sc.nextInt();
		    
		    System.out.print("Ingrese nota 2 : ");
		    n2 = sc.nextInt();
		    
		    System.out.print("Ingrese nota 3 : ");
		    n3 = sc.nextInt();
		    
		    System.out.print("Ingrese el numero de asistencias [1-12]...................: ");
			float asist = sc.nextFloat();
		    
		    float promedio = (n1 * 0.2f)+(n2*0.3f)+(n3*0.5f);
		    float pa = asist/12 * 100;
		    
		    if (promedio>=13 && pa>=70) {
		    	estado="Obtiene certificado";
		    	num_aptos++;}
		    else {
		    	estado="No obtiene certificado";
		        no_aptos++;}
		    
		  
		    
		    if (mayor < promedio) {
		    	mayor = promedio;
		        MayorPromedio=nombre;
		    }
		    
		    if (menor > promedio) {
		    	menor = promedio;
		        MenorPromedio=nombre;
		        }
		    
		    
		    
		    System.out.println("----------------------------------");
		    System.out.println("-------------RESULTADOS-----------");
		    System.out.println("----------------------------------");
		    System.out.println("Promedio...............: " + df.format(promedio));
				
		    System.out.println("Asistencia...............: " +df.format(pa) +"%");
		    
		    System.out.println("Estado...............: " + estado);
		    
			sc.nextLine();	
				
				
			
			System.out.print("¿Desea agregar otro participante? <S/N> :");
			continuar=sc.nextLine();
				
		}
		
		
		
		System.out.println("\n---R E S U M E N-----");
		System.out.println("Cantidad de participantes.............: " +nr);
		System.out.println("Mayor promedio..." + mayor + "Pertenece a : "+MayorPromedio);
		System.out.println("Mayor promedio..." + menor + "Pertenece a : "+MenorPromedio);
		System.out.println("Alumnos certicados ........: " +num_aptos);
		System.out.println("Alumnos certicados ........: " +no_aptos);
	}

}