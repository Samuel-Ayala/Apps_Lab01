package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        boolean end = false;
        ArrayList<Hada> listaDeHadas = new ArrayList<>();
        ArrayList<Humano> listaDeHumanos = new ArrayList<>();
        while(!end)
        {
            String a=sc.nextLine();
            System.out.println(a);
            switch(a)
            {
                case "1":
                {
                    
                    break;
                }
                case "2":
                {
                    Humano human = new Humano();
                    //llenamos todos los datos
                    System.out.print("Ingrese el nombre: ");
                    String nombre1 = sc.nextLine();
                    if (nombre1.length() <= 20) {
                        try {
                            int x = Integer.valueOf(nombre1);
                            //break nombre;             
                        }

                     catch (NumberFormatException e) {  
                         human.setNombre(nombre1);
                         //System.out.println("nombre con numero y letras");

                    }
                    }
                    System.out.print("Ingrese la edad: ");
                    String edad1 = sc.nextLine();
                     try {
                        if ((Integer.valueOf(edad1)> 5)&&(Integer.valueOf(edad1) < 12)) {

                            throw new NumberFormatException();
                            //System.out.println("nombre no valido");
                        } 
                         System.out.println("edad no valida");
                    } catch (NumberFormatException e) {  
                        human.setEdad(Integer.valueOf(edad1));   
                    }
                    
                    System.out.print("Ingrese el nombre del padrino: ");
                    String nombre2 = sc.nextLine();
                    for(Hada pepe : listaDeHadas){
                        if(pepe.getNombre().equals(nombre2)){
                            if(pepe.getAhijado().getNombre().equals(nombre1)){
                                human.setPadrino(pepe);
                            }
                        }
                       }
                     
                    //
                    listaDeHumanos.add(human);
                    break;

                }
                case "3":
                {
                    break;
                }
                case "4":
                {
                    break;
                }
                default:
                {
                    System.out.println("Opcion no valida");
                    end=true;
                }
            }
        }
    }
}
