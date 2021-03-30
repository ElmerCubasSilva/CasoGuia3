package com.senati.eti;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		int nr= 0 ;
		int sup = 0;
		float horas_t=0 ,tarifa_h = 0 ,min=0  ,mayor2 = 0 , mayor3 = 0 , menor = 9000;
		String nombre="" ,MayorMin = "" ,MayorNeto = "" ,MenorNeto ="",continuar = "S";
		
		
		while (continuar.equals("S") || continuar.equals("s")) {
			nr++;
			System.out.println("---------------------------");
			System.out.println("----R e g i s t r o [" + nr + "]----");
			System.out.println("---------------------------");
			
			System.out.print("Ingrese nombre del empleado.....:");
		    nombre = sc.nextLine();
		
		    System.out.print("Ingrese horas trabajadas ....:");
		    horas_t = sc.nextFloat();
		    
		    System.out.print("Ingrese Tarifa por hora......:");
		    tarifa_h = sc.nextFloat();
		    
		    System.out.print("Minutos de tardanza  ....:");
		    min = sc.nextFloat();
		    
		    
		    
		    float sueldo_bruto = horas_t * tarifa_h;
		    float bonificacion = 0;
		    
		    if (horas_t>0 && horas_t <=50) {
		    	bonificacion=0;
		    	}
		    else if(horas_t>50 && horas_t <=60) {
		    	bonificacion=sueldo_bruto*0.02f; 
		    }
		    else if(horas_t>60 && horas_t <=70) {
		    	bonificacion=sueldo_bruto*0.08f; 
		    }
		    else if(horas_t>70 && horas_t <=80) {
		    	bonificacion=sueldo_bruto*0.13f; 
		    }
		    else if(horas_t >80) {
		    	bonificacion=sueldo_bruto*0.15f; 
		    }
		    
		    float descuento = 0;
		    
		    if (min>0 && min <=15) {
		    	descuento= 0;}
		    
		    else if(min>15 && min <=30) {
		    	descuento= (min*0.003f)*sueldo_bruto;}
		    else if(min>30) {
		    	descuento= (min*0.005f)*sueldo_bruto;}
		    
		    float neto=sueldo_bruto + bonificacion - descuento;
		    float meta = horas_t/80 * 100;
		    
		   
		    if (meta > 90) {
		    	sup++;}
		  
		   
		    if (mayor2 < min ) {
		    	mayor2 = min;
		        MayorMin=nombre;
		        }
		    
		    if (mayor3 < neto ) {
		    	mayor3 = neto;
		        MayorNeto=nombre;
		        }
		    
		    if (menor > neto) {
		    	menor = neto ;
		        MenorNeto=nombre;
		        }
		    
		    
		   
		    System.out.println("----------------------------------");
		    System.out.println("-------------RESULTADOS-----------");
		    System.out.println("----------------------------------");
		    System.out.println("Sueldo bruto............:"+sueldo_bruto);
		    
		    System.out.println("Bonificacion............:"+bonificacion);
		    
		    System.out.println("El descuento es............:"+df.format(descuento));
		    
		    System.out.println("Sueldo neto............:"+neto);
		    
		    System.out.println("Alcanzado............:"+df.format(meta)+"%");
		    
			sc.nextLine();	
				
				
			
			System.out.print("¿Desea agregar otro participante? <S/N> :");
			continuar=sc.nextLine();
				
		}
		System.out.println("\n---R E S U M E N-----");
		System.out.println("Cantidad de empleados.............: " +nr);
		System.out.println("Sueldo neto mayor "+ mayor3 + " pertenece a : " + MayorNeto);
		System.out.println("Sueldo neto menor "+ menor + " pertenece  a : " + MenorNeto);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza "+MayorMin+"("+mayor2+"min)");
		System.out.println("Cantidad de empleados con mas del 90 % de la meta : " +sup);
	}

}