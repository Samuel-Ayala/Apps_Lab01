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
