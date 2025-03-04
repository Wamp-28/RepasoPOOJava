package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Clase - objeto - instancia
        Scanner teclado = new Scanner(System.in);

        List<Persona> listPersona = new ArrayList<>();



        Persona p1 = new Persona("101010", "Lorena", "Gil", 8);
        Persona p2 = new Persona("202020", "Pedro", "Lopez", 32);


        Persona p3 = new Persona();

        System.out.println("Ingrese su cedula");
        p3.setCedula(teclado.next());

        System.out.println("Ingrese su nombre");
        p3.setNombre(teclado.next());

        System.out.println("Ingrese su apellido");
        p3.setApellido(teclado.next());

        System.out.println("Ingrese su edad");
        p3.setEdad(teclado.nextInt());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


        System.out.println(p1.isMayor(p1.getEdad()));



        listPersona.add(p1);
        listPersona.add(p2);
        listPersona.add(p3);


        for (Persona mipers0na: listPersona ){
            System.out.println(mipers0na);
        }

        System.out.println(listPersona.toString());


        for(int i = 0; i<listPersona.size();i++){
            System.out.println(listPersona.get(i).getApellido());
        }




    }
}