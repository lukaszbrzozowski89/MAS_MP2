package asocjacja_zwykla;/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("LO333", "WAW", "CDG");
        Flight flight2 = new Flight("LO334", "CDG", "WAW");
        Plane plane1 = new Plane("Boieng", "747", LocalDate.of(1999,12,20));
        flight1.addPlane(plane1);
        flight2.addPlane(plane1);
        System.out.println(flight1);
        System.out.println(flight2);
        System.out.println(plane1);
    }
}
