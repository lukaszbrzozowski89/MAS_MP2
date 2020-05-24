/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;


import java.time.LocalDate;

public class Plane extends ObjectPlusPlus {

    private String producer;
    private String model;
    private LocalDate yearOfProduction;

    public Plane(String producer, String model, LocalDate yearOfProduction) {
        super();
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
