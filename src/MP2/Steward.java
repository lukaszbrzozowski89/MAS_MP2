/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;

public class Steward extends ObjectPlusPlus {

    private static int counter = 1;
    private Integer id;
    private String name;
    private String surname;
    private int experience;
    private Flight flight;
    private int numberOfRole;

    public Steward(String name, String surname, int experience) {
        super();
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.id = counter++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void addFlight(Flight flight) {
        this.flight = flight;
    }

    public int getNumberOfRole() {
        return numberOfRole;
    }

    public void setNumberOfRole(int numberOfRole) {
        this.numberOfRole = numberOfRole;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Steward{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                '}';
    }
}
