package com.controller;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Actor;
import com.model.Movie;

public class MainApp {

    public static void main(String[] args) {
        // Hibernate Configuration
        Configuration config = new Configuration().configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();

        // Create Movie objects
        Movie m1 = new Movie();
        m1.setMovieId(101);
        m1.setMovieName("DDLJ");

        Movie m2 = new Movie();
        m2.setMovieId(102);
        m2.setMovieName("Kal Ho Na Ho");

        Movie m3 = new Movie();
        m3.setMovieId(103);
        m3.setMovieName("Karan Arjun");

        Movie m4 = new Movie();
        m4.setMovieId(104);
        m4.setMovieName("Sultan");

        // Create Actor objects
        Actor a1 = new Actor();
        a1.setActorId(1);
        a1.setActorName("SRK");

        Actor a2 = new Actor();
        a2.setActorId(2);
        a2.setActorName("Salman");

        // Establish Many-to-Many relationships
        HashSet<Movie> movies1 = new HashSet<>();
        movies1.add(m1);
        movies1.add(m2);
        a1.setMovies(movies1);

        HashSet<Movie> movies2 = new HashSet<>();
        movies2.add(m3);
        movies2.add(m4);
        a2.setMovies(movies2);

        HashSet<Actor> actors1 = new HashSet<>();
        actors1.add(a1);
        m1.setActors(actors1);

        HashSet<Actor> actors2 = new HashSet<>();
        actors2.add(a1);
        m2.setActors(actors2);

        HashSet<Actor> actors3 = new HashSet<>();
        actors3.add(a2);
        m3.setActors(actors3);

        HashSet<Actor> actors4 = new HashSet<>();
        actors4.add(a2);
        m4.setActors(actors4);

        // Save Movies and Actors
        session.save(m1);
        session.save(m2);
        session.save(m3);
        session.save(m4);

        session.save(a1);
        session.save(a2);

        // Commit transaction
        txn.commit();
        session.close();

        System.out.println("Data saved successfully!");
    }
}
