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
        int numLineas = 1;

        while (linea != null) {
            System.out.print("Linea " + numLineas + ": ");

            matNoel = patNoel.matcher(linea);
            matRens = patRens.matcher(linea);
            matFollets = patFollets.matcher(linea);

            int contadorNoel = 0;
            int contadorRens = 0;
            int contadorFollets = 0;

            while (matNoel.find()) {
                contadorNoel++;
            }
            while (matRens.find()) {
                contadorRens++;
            }
            while (matFollets.find()) {
                contadorFollets++;
            }

            if (contadorNoel != 0){ System.out.print("Pare noel (" + contadorNoel + ") "); }
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
