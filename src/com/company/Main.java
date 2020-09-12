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
