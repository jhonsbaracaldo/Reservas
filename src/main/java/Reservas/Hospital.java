package Reservas;

import java.util.Scanner;

public class Hospital extends AbstracReservas {

    String ingresarNombre;
    int ingresarnumero;

    public Hospital() {
    }

    public void datosadicionales() {

        String[] doctores = new String[4];

        doctores[0] = "Juan Rodriguez";
        doctores[1] = "Stefany morales";
        doctores[2] = "Jose rize";
        doctores[3] = "Alexandra turmeque";

        String[] consultorio = new String[4];

        consultorio[0] = "404";
        consultorio[1] = "302";
        consultorio[2] = "506";
        consultorio[3] = "403";

        String[] id = new String[4];

        id[0] = "01";
        id[1] = "02";
        id[2] = "03";
        id[3] = "04";

        int a = 0;

        Scanner impresion = new Scanner(System.in);
        for (int i = 0; i < doctores.length; i++) {

            System.out.println("Doctor " + doctores[i] + " Consultorio " + consultorio[i] + " codigo " + id[i]);

        }
        System.out.println("Selecione su doctor ingresando el codigo del doctor:");
        String busqueda = impresion.next();

        for (int m = 0; m < id.length; m++) {

            if (id[m].startsWith(busqueda)) {
                System.out.println("Registro exitoso");
                 System.out.println("Su cita es con el doctor "+doctores[m]+" en el consultorio "+consultorio[m]);
            }


        }



    }

    @Override
    public void reservar() {
        System.out.println("Paciente "+getNombre()+" recuerde llegar 15 minutos antes "+"\nSu cita es el dia "+getDia()+
                "/"+getMes()+"/"+getYear()+" a las "+getHour()+":"+getMinutes()+" "+getA()+" Se enviaran mensajes de texto al telefono " +getNumeroDeContacto()+" para recordale su cita ");
    }

    @Override
    public void reserva() {
        super.reserva();


    }
}
