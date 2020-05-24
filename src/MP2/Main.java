package MP2;/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

import java.time.LocalDate;

import static MP2.Utils.*;


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

        Flight flight1 = new Flight("LO333", "WAW", "CDG", LocalDate.now());
        Flight flight2 = new Flight("LO334", "CDG", "WAW", LocalDate.now());

        plane1.addLink(flightClass, planeClass, flight1);
        plane1.addLink(flightClass, planeClass, flight2);

        plane1.showLinks(flightClass, System.out);
        flight1.showLinks(planeClass, System.out);
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

        pilot1.showLinks(pilotPlaneClass, System.out);
        System.out.println();

        plane1.showLinks(pilotPlaneClass, System.out);
        plane2.showLinks(pilotPlaneClass, System.out);
        System.out.println();

        da.showLinks(planeClass, System.out);
        da.showLinks(pilotClass, System.out);
        System.out.println();

        da1.showLinks(planeClass,System.out);
        da1.showLinks(pilotClass,System.out);

        System.out.println("----------------");
    }

    private static void testAssociationWithQualifier() throws Exception {
        System.out.println("Association With Qualifier Test");
        Plane plane = new Plane("Boeing", "747",
                LocalDate.of(2020, 1, 1));
        Plane plane2 = new Plane("Airbus", "A320",
                LocalDate.of(2019, 1, 1));
        Pilot pilot = new Pilot("Grzegorz", "Koszyk",
                LocalDate.of(1986, 12, 12));
        AirplaneLicence airplaneLicence = new AirplaneLicence(plane,
                LocalDate.of(2019, 10, 11),
                LocalDate.of(2022, 12, 12));
        AirplaneLicence airplaneLicence2 = new AirplaneLicence(plane2,
                LocalDate.of(2018, 3, 18),
                LocalDate.of(2025, 6, 6));

        pilot.addLink(airplaneLicenceClass, pilotClass, airplaneLicence, airplaneLicence.getId());
        pilot.addLink(airplaneLicenceClass, pilotClass, airplaneLicence2, airplaneLicence2.getId());

        System.out.println(pilot.getLinkedObject(airplaneLicenceClass, airplaneLicence.getId()));
        System.out.println(pilot.getLinkedObject(airplaneLicenceClass, airplaneLicence2.getId()));

        System.out.println("----------------");
    }

    private static void testComposition() throws Exception {
        System.out.println("Composition Test");

        Flight flight = new Flight("LO003", "WAW", "ORD", LocalDate.now());

        Passenger passenger = new Passenger("Krzysztof", "Jerzyna", flight);
        Passenger passenger2 = new Passenger("Jarosław", "Psikuta", flight);

        Passenger.BoardingPass boardingPass = passenger
                .createBoardingPass(generateNumberOfBoardingPass(flight, passenger));

        Passenger.BoardingPass boardingPass2 = passenger2
                .createBoardingPass(generateNumberOfBoardingPass(flight, passenger2));

        passenger.showLinks(passengerBoardPassInternalClass, System.out);
        boardingPass.showLinks(passengerClass, System.out);

        System.out.println();
        passenger2.showLinks(passengerBoardPassInternalClass, System.out);
        boardingPass2.showLinks(passengerClass, System.out);
        System.out.println();

//        passenger.removePart(boardingPassClass, passengerClass, boardingPass);
//        passenger2.removePart(boardingPassClass, passengerClass, boardingPass2);
        System.out.println(ObjectPlusPlus.allParts);
        System.out.println("----------------");

    }

    private static String generateNumberOfBoardingPass(Flight flight, Passenger passenger) {
        return flight.getNumberOfFlight() + "_" + flight.getStartOfFlight().getYear() + "_"
                + flight.getStartOfFlight().getMonth().getValue() + "_" + flight.getStartOfFlight().getDayOfMonth()
                + "_"
                + passenger.getName().substring(0, 1)
                + passenger.getSurname().substring(0, 1);
    }
}
