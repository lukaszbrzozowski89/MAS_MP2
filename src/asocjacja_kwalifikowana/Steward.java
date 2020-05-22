/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package asocjacja_kwalifikowana;

import asocjacja_z_atrybutem.Pilot;

import java.util.HashMap;
import java.util.Map;

public class Steward extends ObjectPlusPlus {

    private String name;
    private String surname;
    private int experience;

    private Map<String, Flight> flightQualificator = new HashMap<>();

    public Steward(String name, String surname, int experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;

    }

    public void addFlight(Flight flight) {
        if(!flightQualificator.containsKey(flight.getNumberOfFlight())){
            flightQualificator.put(flight.getNumberOfFlight(), flight);
            flight.addLink(Pilot.class.getSimpleName(), Steward.class.getSimpleName(), this, 2);
        }
    }
    public Flight findFlight(String duty) throws Exception {
        if(!flightQualificator.containsKey(duty)) {
            throw new Exception("Nie odnaleziono Stanowiska: " + duty);
        }
        return flightQualificator.get(duty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Map<String, Flight> getFlightQualificator() {
        return flightQualificator;
    }

    public void setFlightQualificator(Map<String, Flight> flightQualificator) {
        this.flightQualificator = flightQualificator;
    }
}
