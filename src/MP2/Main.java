package MP2;/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws Exception {


        testBinaryAssociation();
        testAssociationWithAttribute();
        testComposition();
        testAssociationWithQualifier();
    }

    private static void testBinaryAssociation() throws Exception {
        System.out.println("----------------");
        System.out.println("Binary Association Test");
        Plane plane1 = new Plane("Boeing", "747", LocalDate.of(2020, 1, 1));

        Flight flight1 = new Flight("LO333", "WAW", "CDG");
        Flight flight2 = new Flight("LO334", "CDG", "WAW");

        plane1.addLink(Flight.class.getSimpleName(), Plane.class.getSimpleName(), flight1);
        plane1.addLink(Flight.class.getSimpleName(), Plane.class.getSimpleName(), flight2);

        plane1.showLinks(Flight.class.getSimpleName(), System.out);
        flight1.showLinks(Plane.class.getSimpleName(), System.out);
        System.out.println("----------------");
    }

    private static void testAssociationWithAttribute() throws Exception {
        System.out.println("Association with Attribute Test");
        Pilot pilot1 = new Pilot("Roman", "Kiszka", LocalDate.of(1986, 12, 12));
        Plane plane1 = new Plane("Boeing", "747", LocalDate.of(2020, 1, 1));
        Plane plane2 = new Plane("Airbus", "A320", LocalDate.of(2015, 12, 24));
        PilotPlane da = new PilotPlane(LocalDate.of(2020, 1, 14),
                LocalDate.of(2020, 2, 2), plane1, pilot1);
        PilotPlane da1 = new PilotPlane(LocalDate.of(2018, 11, 1),
                LocalDate.of(2018, 12, 1), plane2, pilot1);


        pilot1.addLink(PilotPlane.class.getSimpleName(), Pilot.class.getSimpleName(), da);
        da.addLink(Plane.class.getSimpleName(), PilotPlane.class.getSimpleName(), plane1);

        pilot1.addLink(PilotPlane.class.getSimpleName(), Pilot.class.getSimpleName(), da1);
        da1.addLink(Plane.class.getSimpleName(), PilotPlane.class.getSimpleName(), plane2);


        da.showLinks(Pilot.class.getSimpleName(), System.out);
        da.showLinks(Plane.class.getSimpleName(), System.out);
        System.out.println();
        da1.showLinks(Pilot.class.getSimpleName(), System.out);
        da1.showLinks(Plane.class.getSimpleName(), System.out);
        System.out.println("----------------");
    }

    private static void testAssociationWithQualifier() throws Exception {
        System.out.println("Association With Qualifier Test");
        Plane plane = new Plane("Boeing", "747",
                LocalDate.of(2020, 1, 1));
        Plane plane2 = new Plane("Airbus", "A320",
                LocalDate.of(2019, 1, 1));
        Pilot pilot = new Pilot("Grzegorz", "Burak",
                LocalDate.of(1986, 12, 12));
        AirplaneLicence airplaneLicence = new AirplaneLicence(plane,
                LocalDate.of(2019, 10, 11),
                LocalDate.of(2022, 12, 12));
        AirplaneLicence airplaneLicence2 = new AirplaneLicence(plane2,
                LocalDate.of(2018, 3, 18),
                LocalDate.of(2025, 6, 6));

        pilot.addLink(AirplaneLicence.class.getSimpleName(), Pilot.class.getSimpleName(), airplaneLicence, airplaneLicence.getPlane());
        pilot.addLink(AirplaneLicence.class.getSimpleName(), Pilot.class.getSimpleName(), airplaneLicence2, airplaneLicence2.getPlane());

        System.out.println(pilot.getLinkedObject(AirplaneLicence.class.getSimpleName(), airplaneLicence.getPlane()));
        System.out.println(pilot.getLinkedObject(AirplaneLicence.class.getSimpleName(), airplaneLicence2.getPlane()));

        System.out.println("----------------");
    }

    private static void testComposition() throws Exception {

        System.out.println("Composition Test");

        Flight flight = new Flight("LO123", "WAW", "OSL");
        Luggage luggage = new Luggage(1, 12.56);
        Luggage luggage1 = new Luggage(2, 12.87);

        Passenger passenger = new Passenger("Jan", "Kowalski", flight);
        Passenger passenger2 = new Passenger("Anna", "Nowak", flight);


        passenger.addPart(Luggage.class.getSimpleName(), Passenger.class.getSimpleName(), luggage);
        passenger.addPart(Luggage.class.getSimpleName(), Passenger.class.getSimpleName(), luggage1);

//        passenger2.addPartLuggage.class.getSimpleName(), Passenger.class.getSimpleName(), luggage); // part is already taken
        passenger.showLinks(Luggage.class.getSimpleName(), System.out);
//        passenger2.showLinks(Luggage.class.getSimpleName(), System.out); //exception - no links

        System.out.println("----------------");
    }

}
