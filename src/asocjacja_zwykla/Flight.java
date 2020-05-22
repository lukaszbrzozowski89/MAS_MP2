/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package asocjacja_zwykla;

import java.util.ArrayList;

public class Flight extends ObjectPlusPlus {

    private String numberOfFlight;
    private String airportFrom;
    private String airportTo;

    private ArrayList<Plane> plane = new ArrayList<>();

    public Flight(String numberOfFlight, String airportFrom, String airportTo) {
        super();
        this.numberOfFlight = numberOfFlight;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
    }

    public void addPlane(Plane newPlane) {
        if (!plane.contains(newPlane)) {
            plane.add(newPlane);

            newPlane.addFlight(this);
        }

    }

    public ArrayList<Plane> getPlane() {
        return plane;
    }

    public void setPlane(ArrayList<Plane> plane) {
        this.plane = plane;
    }

    public String getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setNumberOfFlight(String numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    @Override
    public String toString() {
        String result = "";
        int licznik = 0;

        result += "Rejs numer: " + getNumberOfFlight();

        result += "\nObsługiwany przez: ";

        for (Plane o : plane) {
            result += "\n" + ++licznik + ". " + o.getProducer() + " " + o.getModel();
        }
        result += "\n----------------------";

        return result;
    }
}
