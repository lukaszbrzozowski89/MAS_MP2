/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;



public class Flight extends ObjectPlusPlus {

    private String numberOfFlight;
    private String airportFrom;
    private String airportTo;


    public Flight(String numberOfFlight, String airportFrom, String airportTo) {
        super();
        this.numberOfFlight = numberOfFlight;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
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
        return "Flight{" +
                "numberOfFlight='" + numberOfFlight + '\'' +
                ", airportFrom='" + airportFrom + '\'' +
                ", airportTo='" + airportTo + '\'' +
                '}';
    }
}
