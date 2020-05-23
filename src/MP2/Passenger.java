/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;

public class Passenger extends ObjectPlusPlus{

    private String name;
    private String surname;
    private Flight flight;


    public Passenger(String name, String surname, Flight flight) {
        super();
        this.name = name;
        this.surname = surname;
        this.flight = flight;
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

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", flight=" + flight +
                '}';
    }
}
