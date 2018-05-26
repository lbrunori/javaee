package com.lucasbrunori.controller;

import com.lucasbrunori.writer.IWriter;

import javax.inject.Inject;
import java.util.Scanner;

public class MainController {

    @Inject
    IWriter mainMenuWriter;

    public void startupApplication(){
        int answer = -1;
        Scanner scanner = new Scanner(System.in);
        do{
            mainMenuWriter.write();
            while(!scanner.hasNextInt()){

                System.out.println("\n[Error] Please, enter a valid value\nValue: ");
                scanner.next();
            }
            answer = scanner.nextInt();
            processAnswer(answer);
        }while (answer != 0);

        if(scanner != null) {
            scanner.close();
        }
        System.exit(0);
    }

    public void processAnswer(Integer answer){

    }
}
