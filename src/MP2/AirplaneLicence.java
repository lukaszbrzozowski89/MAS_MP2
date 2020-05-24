/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;

import java.time.LocalDate;

public class AirplaneLicence extends ObjectPlusPlus {

    private static int counter = 1;
    private int id;
    private Plane plane;
    private LocalDate validFrom;
    private LocalDate validTo;

    public AirplaneLicence(Plane plane, LocalDate validFrom, LocalDate validTo) {
        super();
        this.id = counter++;
        this.plane = plane;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public int getId() {
        return id;
    }

    public Plane getPlane() {
        return plane;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }


    @Override
    public String toString() {
        return "AirplaneLicence{" +
                "id=" + id +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }
}
