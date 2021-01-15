package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainAlternatiu {
    public static void main(String[] args) {
        BufferedReader contingut = null;
        try {
            contingut = new BufferedReader(new FileReader("santako.txt"));
        } catch (
                FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        String linea = null;
        try {
            linea = contingut.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        boolean indexNoel = false;
        boolean indexRens = false;
        boolean indexFollets = false;

        int numLineas = 1;

        while (linea != null) {
            System.out.print("Linea " + numLineas + ": ");

            indexNoel = linea.contains("*<]:-DOo");
            indexRens = linea.contains(">:o)");
            indexFollets = linea.contains("|<]:-D");

            int contadorNoel = 0;
            int contadorRens = 0;
            int contadorFollets = 0;

            if (indexNoel) {
                contadorNoel++;
            }
            if (indexRens) {
                contadorRens++;
            }
            if (indexFollets) {
                contadorFollets++;
            }

            if (contadorNoel != 0) { System.out.print("Pare noel (" + contadorNoel + ") "); }
            if (contadorRens != 0) { System.out.print("Rens (" + contadorRens + ") "); }
            if (contadorFollets != 0) { System.out.print("Follets (" + contadorFollets + ") "); }
            System.out.println();

            numLineas++;

            try {
                linea = contingut.readLine();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
