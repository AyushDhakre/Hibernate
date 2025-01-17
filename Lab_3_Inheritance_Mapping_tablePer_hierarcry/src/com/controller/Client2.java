package com.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Player;

public class Client2 {
public static void main(String[] args) {
        
        Configuration c = new Configuration().configure();
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
     Scanner  scanner=new Scanner(System.in);
     System.out.println("enter player id");
    int playerid= scanner.nextInt();
    Player product = (Player) s.get(Player.class, playerid);
        if (product != null) {
            System.out.println("player Details: " + product);
        } else {
            System.out.println("No player found with code: " + playerid);
        }

        
        
        s.close();
        sf.close();
    }
}
