package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        boolean end = false;
        ArrayList<Hada> listaDeHadas = new ArrayList<>();
        ArrayList<Humano> listaDeHumanos = new ArrayList<>();
        System.out.println("--- Bienvenido al fiestón ---");
        System.out.println("");
        System.out.println("Registre sus datos a continuacion para poder ser admitido en la fiesta");

        while(!end)
        {
            System.out.println("1) Registro de Hada");
            System.out.println("2) Registro de Humano");
            System.out.println("3) Listar todos los inscritos");
            System.out.println("4) Salir");
            System.out.println("Opcion: ");
            String a=sc.nextLine();
            switch(a)
            {
                case "1":
                {
                    boolean valido = false;
                    Hada hada = new Hada();
                    while(!valido)
                    {
                        try
                        {
                            
                            System.out.println("Ingrese su nombre: ");
                            String nombre=sc.nextLine();
                            if(nombre.length()<=20)
                            {
                                if(!nombre.contains("1")&&!nombre.contains("2")&&!nombre.contains("3")&&
                                        !nombre.contains("4")&&!nombre.contains("5")&&!nombre.contains("6")&&
                                        !nombre.contains("7")&&!nombre.contains("8")&&!nombre.contains("9")) 
                                {
                                    valido=true;
                                }
                                else
                                {
                                    nombre=nombre + "a";
                                    int nom = Integer.parseInt(nombre);
                                }
                                
                            }
                            else  
                            {int nom = Integer.parseInt(nombre);}     
                           
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("Debe tener menos de 20 caracteres y no contener numeros");
                        }    
                    }
                    
                    valido = false;
                    while (!valido)
                    {
                        try
                        {
                            System.out.println("Ingrese su edad: ");
                            String edads=sc.nextLine();
                            int edad = Integer.parseInt(edads);
                            if(edad>500 && edad<10000)
                            {
                                hada.setEdad(edad);
                                valido =true;
                            }
                            else 
                            {int c=1/0;}                                
                        }
                        catch(Exception e)
                        {
                            System.out.println("Datos mal ingresados o no le corresponde su edad");
                        }
                        
                    }
                    valido = false;
                    while(!valido)
                    {
                        System.out.println("¿Cuenta con ahijado (S/N)");
                        String tiene=sc.nextLine();
                        if(tiene.equalsIgnoreCase("S"))
                        {
                            System.out.println("Cual es el nombre de su ahijado");
                            String nombre=sc.nextLine();
                            Humano humano =new Humano();
                            humano.setNombre(nombre);
                            hada.setAhijado(humano);
                            valido=true;
                        }
                        else if(tiene.equalsIgnoreCase("N"))
                        {
                            valido=true;
                        }
                        else
                        {
                            System.out.println("Datos mal ingresados");
                        }
                    }
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
                    for ( Hada hada : listaDeHadas) {
                        int i = 1;
                        System.out.println("Lista de hadas: ");
                        System.out.println(i + ") " + "Nombre: " + hada.getNombre() + " - " + "Edad: " + hada.getEdad());
                        i++;
                    }
                    System.out.println("----------------------------------------------------------------------");
                    for ( Humano humano : listaDeHumanos) {
                        int ii = 1;
                        System.out.println("Lista de humanos: ");
                        System.out.println(ii + ") " + "Nombre: " + humano.getNombre() + " - " + "Edad: " + humano.getEdad());
                        ii++;
                    }
                    break;
                }
                case "4":
                {
                    end = true;
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
