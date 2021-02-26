package com.mclebtec.java.builder;


import com.mclebtec.java.builder.bonus.ambulance.AmbulanceBuilder;

import java.util.Scanner;

public class ClientAmbulance {
    public static void main(String[] args) {
        System.out.println("Welcome to Ambulance Builder project  ");
        Scanner scan = new Scanner(System.in);
        int repeatRunFlag = 1;
        AmbulanceBuilder ambulanceBuilder = new AmbulanceBuilder();
        AmbulanceBuilder.Ambulance ambulance;
        while (repeatRunFlag == 1) {
            System.out.println("What kind of Ambulance you want ? ");
            System.out.println("press 1 for 4 Wheeler");
            System.out.println("press 2 for 6 Wheeler ");
            System.out.println("press 3 for 8 Wheeler ");
            int numberOfWheel = scan.nextInt();
            System.out.println("What kind label you want for Ambulance ? ");
            String label = scan.next();
            ambulance = ambulanceBuilder.buildAmbulance(numberOfWheel, label);
            System.out.println("Ambulance is build " + ambulance);
            System.out.println("=============================");

            System.out.println("Press 1 to Repeat .... ");
            try {
                repeatRunFlag = scan.nextInt();
            } catch (Exception e) {
                repeatRunFlag = 0;
            }
        }
    }
}