package Reservas;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Scanner;


public  abstract class AbstracReservas implements Reserva {

    private String nombre;
    private String numeroDeContacto;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    private String a ;

    private int dia, mes, year, hour, minutes;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public void reserva() {
        Scanner impresion = new Scanner(System.in);

        System.out.println("por favor ingrese los siguientes datos para la reservacion \nNombre");
        nombre = impresion.next();
        setNombre(nombre);

        System.out.println("Celular");
        numeroDeContacto = impresion.next();
        setNumeroDeContacto(numeroDeContacto);

        System.out.println("Por favor seleccione la hora de su reserva dia/mes/año Hora en forma HH:mm");

        System.out.println(" dia :");
        dia = impresion.nextInt();
        System.out.println(" mes :");
        mes = impresion.nextInt();
        System.out.println(" año :");
        year = impresion.nextInt();
        System.out.println("Ingrese primero la hora y despues los minutos ");
        hour = impresion.nextInt();
        minutes = impresion.nextInt();
        System.out.println(" indique si es am o pm ");
        a = impresion.next();



    }


    public abstract void reservar();

    // Get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeContacto() {
        return numeroDeContacto;
    }

    public void setNumeroDeContacto(String numeroDeContacto) {
        this.numeroDeContacto = numeroDeContacto;
    }
}




