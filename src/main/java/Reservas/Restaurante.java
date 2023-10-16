package Reservas;

import java.util.Scanner;

public class Restaurante  extends AbstracReservas {


    public void Restaurante() {
        String[] mesas = new String[4];

        mesas[0] = "01 Pasillo";
        mesas[1] = "02 Ventana";
        mesas[2] = "03 Terraza";
        mesas[3] = "04 Entrada";


        Scanner impresion = new Scanner(System.in);


        for (int i = 0; i < mesas.length; i++) {
            System.out.println("Mesa " + mesas[i]);

        }
        System.out.println(" Seleccion su Mesa indicando el numero de la mesa :");
        String mesa = impresion.next();
        System.out.println("indiquenos para cuantas personas");
        int reservation = impresion.nextInt();

        for (int j = 0; j < mesas.length; j++) {

            if (mesas[j].startsWith(mesa)) {
                System.out.println("Registro exitoso");
                System.out.println("la mesa para su reserva es la "+ mesas[j]);
            }


        }


        }
    @Override
    public void reservar () {
        System.out.println("Gracias por utlizar nuestro servicio " + getNombre() + "\nSu reserva fue exitosa para el dia " + getDia() +
                "/" + getMes() + "/" + getYear() + " a las " + getHour() + ":" + getMinutes() + getA() + " le comunicaremos " + getNumeroDeContacto() + " para confirmar su reservacion");

    }

}
