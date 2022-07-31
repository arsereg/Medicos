package ui;

import bl.Application;

import java.time.Duration;
import java.time.LocalDate;


public class Main {

    public static Application wrapper = new Application();

    public static void main(String[] args){

        wrapper.crearUnDoctor("Steven", "Strange", "Neurocirujano");
        wrapper.crearPaciente("Gino");
        wrapper.crearCitaMedica("Maria", "Gino", LocalDate.now());
        int x = 0;


    }
}