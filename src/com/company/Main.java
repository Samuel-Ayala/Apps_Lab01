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
