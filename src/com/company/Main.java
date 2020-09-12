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
            System.out.println(a);
            switch(a)
            {
                case "1":
                {
                    break;
                }
                case "2":
                {
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
