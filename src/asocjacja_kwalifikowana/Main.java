package asocjacja_kwalifikowana;/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

public class Main {
    public static void main(String[] args) {
        Steward steward = new Steward("Jan", "Kowalski", 15);
        Steward steward1 = new Steward("Roman", "Pikuś", 2);
        Flight flight = new Flight("LO333", "WAW", "CDG");
        Flight flight2 = new Flight("LO334", "CDG", "WAW");
        steward.addFlight(flight);
        steward1.addFlight(flight);

        System.out.println(steward);
        System.out.println(steward1);
    }
}
