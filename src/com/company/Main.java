package com.company;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.File;


public class Main {
    public static void verData() {
        // mostra a data no output
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Data atual: " + dateFormat.format(date));
    }
    public static void verificaSalasTxt() {
        // verifica se o ficheiro de input "salas.txt" existe.
        File fileSalasTxt = new File("salas.txt");
        System.out.println("* A verificar se o ficheiros de input "+ fileSalasTxt.getName() +" existe ...");
        if(fileSalasTxt.exists()) {
            System.out.println("Sim. O ficheiro " + fileSalasTxt.getName() + " existe.");
        } else {
            System.out.println("Nao. O ficheiro " + fileSalasTxt.getName() +  " não existe.");
        }

    }
    public static void verificaReservasTxt(){
        // verifica se o ficheiro de input "reservas.txt" existe.
        File fileReservasTxt = new File("reservas.txt");
        if(fileReservasTxt.exists()) {
            System.out.println("Sim. O ficheiro " + fileReservasTxt.getName() + " existe.");
        } else {
            System.out.println("Nao. O ficheiro " + fileReservasTxt.getName() + " não existe.");
        }
    }
    public static void notasAntigas(){

        /**
         **** codigo antigo. verificava se o output.txt existia. nao fazia overwrite. agora fazemos overwrite. ***
         * verifica se o ficheiro de output output.txt existe.
         * se nao existir, cria o ficheiro.

         File fileOutputTxt = new File("output.txt");
         System.out.println("* Vamos criar o ficheiro: " + fileOutputTxt.getName());

         if(fileOutputTxt.exists()) {
         System.out.println("Erro. Não vamos fazer overwrite. O ficheiro " + fileOutputTxt.getName() + " já existe.");
         } else {
         //aqui, verificamos que o ficheiro nao existe. vamos criar o ficheiro. bucky - video79
         System.out.println("O ficheiro " + fileOutputTxt.getName() + " nao existe.");
         System.out.println("Vamos criar o ficheiro...");

         createfile g = new createfile();  //from bucky video80 writing to files
         g.openFile();
         g.addRecords();
         g.closeFile();
         System.out.println("ficheiro criado");
         }
         **/

    }

    public static void main(String[] args) {
        //verData();
        verificaSalasTxt();
        //verificaReservasTxt();



        // variaveis inseridas manualmente
        int idSala[] = { 1,2,3 };
        String nomeSala[] = { "sala azul" , "Sala Verde" };


        //mostra variaveis no ecra
        for (int i = 0; i < idSala.length; i++) {
            System.out.println("idSala: " + idSala[i]);
            System.out.println("nomeSala: " + nomeSala[1]);
        }



    }
}
