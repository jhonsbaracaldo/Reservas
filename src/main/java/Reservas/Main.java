package Reservas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner impresion = new Scanner(System.in);
        int seleccion;

        System.out.println("Bienvenido\nPor favor indiquenos donde desea realizar la reserva\n1.Hotel\n2.Hospital\n3.Resturante");


        seleccion = impresion.nextInt();



        switch (seleccion){
            case 1:
                System.out.println("Bienvenido al Hotel  ");
                Hotel hotel = new Hotel();
                hotel.reserva();
                System.out.println("Habitaciones Disponibles por favor seleccione una");
                hotel.datosadicionales();
                hotel.reservar();

                break;

               case 2:
                System.out.println("Bienvenido al Hospital ");
                Hospital hospital = new Hospital();
                hospital.reserva();
                System.out.println("Doctores disponibles");
                hospital.datosadicionales();
                hospital.reservar();
                break;

            case 3:
                System.out.println("Bienvenido al Restaurante ");
                Restaurante restaurant = new Restaurante();
                restaurant.reserva();
                System.out.println("Mesas disponibles");
                restaurant.Restaurante();
                restaurant.reservar();
                break ;
        }



    }


}