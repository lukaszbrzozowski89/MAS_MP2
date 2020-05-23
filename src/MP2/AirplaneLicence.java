/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;

import java.time.LocalDate;

public class AirplaneLicence extends ObjectPlusPlus {

    private int id;
    private static int counter = 1;
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

    public void setId(int id) {
        this.id = id;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return "AirplaneLicence{" +
                "id=" + id +
                ", plane='" + plane + '\'' +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }
}
