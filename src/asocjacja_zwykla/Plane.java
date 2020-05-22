/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package asocjacja_zwykla;


import asocjacja_z_atrybutem.ObjectPlusPlus;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plane extends ObjectPlusPlus {
    private String producer;
    private String model;
    private LocalDate yearOfProduction;

    private ArrayList<Flight> flight = new ArrayList<>();

    public Plane(String producer, String model, LocalDate yearOfProduction) {
        super();
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public void addFlight(Flight newFlight) {
        if (!flight.contains(newFlight)) {
            flight.add(newFlight);

            newFlight.addPlane(this);
        }
    }


    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(ArrayList<Flight> flight) {
        this.flight = flight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(LocalDate yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    @Override
    public String toString() {
        String result = "";
        int counter = 0;

        result += "Model: " + getModel();
        result += "\nObsługuje rejsy: ";

        for (Flight o : flight) {
            result += "\n" + ++counter + ". " + o.getNumberOfFlight();
        }

        result += "\n----------------------";

        return result;
    }

}
