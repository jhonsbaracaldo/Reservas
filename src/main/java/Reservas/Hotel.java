package Reservas;

import java.util.Scanner;

public class Hotel extends  AbstracReservas{

    String ingresarNombre;
    int ingresarnumero;

    public Hotel (){
    }

    public void datosadicionales (){
        String [] habitaciones = new String[4];

        habitaciones [0]="101";
        habitaciones [1]="102";
        habitaciones [2]="103";
        habitaciones [3]="104";



        Scanner impresion = new Scanner(System.in);

        for(int i=0;i<habitaciones.length;i++) {
            System.out.println("habitaciones "+habitaciones[i]);

        }
        System.out.println("habitacion :");
        int habitacion = impresion.nextInt();

        System.out.println("Registro exitoso");
        System.out.println("Habitacion seleccionada "+habitacion);


    }
    @Override
    public void reserva() {
        super.reserva();


    }

    @Override
    public void reservar() {
        System.out.println("Gracias por utlizar nuestro servicio "+getNombre()+"\nSu reserva fue exitosa para el dia "+getDia()+
                "/"+getMes()+"/"+getYear()+" a las "+getHour()+":"+getMinutes()+getA()+" le comunicaremos " +getNumeroDeContacto()+"para confirmar asistencia");
    }



}
