/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package asocjacja_kwalifikowana;

import java.util.ArrayList;

public class Flight extends ObjectPlusPlus {
    private String duty;
    private String numberOfFlight;
    private String airportFrom;
    private String airportTo;

    ArrayList<Steward> stewards = new ArrayList<>();

    public Flight(String numberOfFlight, String airportFrom, String airportTo) {
        super();
        this.numberOfFlight = numberOfFlight;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
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


        result += "\n----------------------";

        return result;
    }
}
