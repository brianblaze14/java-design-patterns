package com.mclebtec.java.pattern.creational.singleton;

import com.mclebtec.java.pattern.creational.singleton.bonus.ThreadIssueInstance;

import java.util.Scanner;

public class ClientThreadIssueInstance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        while (repeatFlag == 1) {
            System.out.println("Inside the method to check the thread issue instance");
            Thread thread1 = new Thread(() -> {
                System.out.println("Inside the thread 1");
                ThreadIssueInstance.getInstance().doCounting();
            });
            thread1.setName("thread 1");
            thread1.start();
            Thread thread2 = new Thread(() -> {
                System.out.println("Inside the thread 1");
                ThreadIssueInstance.getInstance().doCounting();
            });
            thread2.setName("thread 2");
            thread2.start();
            Thread thread3 = new Thread(() -> {
                System.out.println("Inside the thread 1");
                ThreadIssueInstance.getInstance().doCounting();
            });
            thread3.setName("thread 3");
            thread3.start();
            try {
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }
        }
    }
}