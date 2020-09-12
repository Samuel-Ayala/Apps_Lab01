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
                    break;
                }
                case "3":
                {
                    if (listaDeHadas != null){
                        for ( Hada hada : listaDeHadas) {
                            int i = 1;
                            System.out.println("Lista de hadas: ");
                            System.out.println(i + ") " + "Nombre: " + hada.getNombre() + " - " + "Edad: " + hada.getEdad());
                            i++;
                        }
                    }else {
                        System.out.println("No hay hadas inscritos");
                    }
                    System.out.println("----------------------------------------------------------------------");
                    if (listaDeHumanos != null){
                        for ( Humano humano : listaDeHumanos) {
                            int ii = 1;
                            System.out.println("Lista de humanos: ");
                            System.out.println(ii + ") " + "Nombre: " + humano.getNombre() + " - " + "Edad: " + humano.getEdad());
                            ii++;
                        }
                        break;
                    }else {
                        System.out.println("No hay humanos inscritos");
                    }
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
