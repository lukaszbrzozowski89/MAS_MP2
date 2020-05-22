package asocjacja_z_atrybutem;/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */


import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Pilot pilot1 = new Pilot(1 ,"Jan", "Kowalski", LocalDate.of(1986,12,12));
        Pilot pilot2 = new Pilot(2,"Paweł", "Psikuta", LocalDate.of(1985,12,13));

        Plane plane1 = new Plane("Boeing", "747", LocalDate.of(2020, 1,1));
        Plane plane2 = new Plane("Airbus", "A920", LocalDate.of(2018, 2, 12));

        PilotPlane da = new PilotPlane(LocalDate.of(2020, 1, 14), LocalDate.of(2020,2,2),plane1, pilot1);
        PilotPlane da1 = new PilotPlane(LocalDate.of(2018,11,1), LocalDate.of(2018,12,1), plane2, pilot2);
        PilotPlane da2 = new PilotPlane(LocalDate.of(2007, 1, 14), LocalDate.of(2017,12,1),plane1, pilot2);
        PilotPlane da3 = new PilotPlane(LocalDate.of(2016,11,11), LocalDate.of(2016,12,11), plane2, pilot1);

        System.out.println(da);
        System.out.println(da1);
        System.out.println(da2);
        System.out.println(da3);

        System.out.println(da.anyLink(Pilot.class.getSimpleName()));
        System.out.println(da1.anyLink(Pilot.class.getSimpleName()));
        System.out.println(da2.anyLink(Pilot.class.getSimpleName()));
        System.out.println(da3.anyLink(Pilot.class.getSimpleName()));

        System.out.println(da.anyLink(Plane.class.getSimpleName()));
        System.out.println(da1.anyLink(Plane.class.getSimpleName()));
        System.out.println(da2.anyLink(Plane.class.getSimpleName()));
        System.out.println(da3.anyLink(Plane.class.getSimpleName()));
    }
}
