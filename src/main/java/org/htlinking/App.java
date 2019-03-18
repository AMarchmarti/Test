package org.htlinking;


import org.htlinking.Users.Register;
import org.htlinking.Users.User;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Register registro = new Register();
        User user = new User();

        /* Primera historia de usuario: Como Usuario que quiere adquirir ofertas deseo poder registrarme*/
        Scanner scanner = new Scanner(System.in);
        Boolean enter = false;
        while (!enter){
            System.out.println("Bienvenido a nuestra plataforma de adquisición de ofertas para fabulosos viajes, hoteles" +
                    "entre otras experiencias. \n" +
                    "¿Desea registrarse? Si o No");

            String respuesta = scanner.nextLine();

            if (respuesta.toLowerCase().equals("si")) {

                System.out.println("Nombre:");
                String name = scanner.nextLine();
                user.setName(name);

                System.out.println("Email:");
                String email = scanner.nextLine();
                user.setEmail(email);

                System.out.println("Contraseña:");
                String pass = scanner.nextLine();
                user.setPassword(pass);

                System.out.println("Repita Contraseña:");
                String rpass = scanner.nextLine();


                user.registerUser(rpass, registro);
                enter = true;

            } else if (respuesta.toLowerCase().equals("no")) {

        /* Segunda historia de usuario: Como usuario registrado deseo loggear para ver las ofertas*/


                System.out.println("¿Quiere loggear?");
                String loginin = scanner.nextLine();

                if (loginin.toLowerCase().equals("si")) {
                    //login
                    enter = true;
                }
                else {
                    System.out.println("Pase un buen día, Adiós");
                    break;
                }
            }


        }
}}
