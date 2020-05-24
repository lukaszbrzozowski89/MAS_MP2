/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;


import java.time.LocalDate;

public class Flight extends ObjectPlusPlus {

    private String numberOfFlight;
    private String airportFrom;
    private String airportTo;
    private LocalDate startOfFlight;
    private LocalDate endOfFlight;

    public Flight(String numberOfFlight, String airportFrom, String airportTo, LocalDate startOfFlight) {
        super();
        this.numberOfFlight = numberOfFlight;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.startOfFlight = startOfFlight;
    }

    public String getNumberOfFlight() {
        return numberOfFlight;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public LocalDate getStartOfFlight() {
        return startOfFlight;
    }

    public LocalDate getEndOfFlight() {
        return endOfFlight;
    }

    public void setEndOfFlight(LocalDate endOfFlight) {
        this.endOfFlight = endOfFlight;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "numberOfFlight='" + numberOfFlight + '\'' +
                ", airportFrom='" + airportFrom + '\'' +
                ", airportTo='" + airportTo + '\'' +
                ", startOfFlight=" + startOfFlight +
                '}';
    }
}
