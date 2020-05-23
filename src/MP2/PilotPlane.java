/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;

import java.time.LocalDate;

public class PilotPlane extends ObjectPlusPlus {

    private static int counter = 1;
    private int id;
    private LocalDate flewFrom;
    private LocalDate flewTo;
    private Plane plane;
    private Pilot pilotName;

    public PilotPlane(LocalDate flewFrom, LocalDate flewTo, Plane plane, Pilot pilotName) {
        this.flewFrom = flewFrom;
        this.flewTo = flewTo;
        this.plane = plane;
        this.pilotName = pilotName;
        this.id = counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        PilotPlane.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFlewFrom() {
        return flewFrom;
    }

    public void setFlewFrom(LocalDate flewFrom) {
        this.flewFrom = flewFrom;
    }

    public LocalDate getFlewTo() {
        return flewTo;
    }

    public void setFlewTo(LocalDate flewTo) {
        this.flewTo = flewTo;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Pilot getPilotName() {
        return pilotName;
    }

    public void setPilotName(Pilot pilotName) {
        this.pilotName = pilotName;
    }

    @Override
    public String toString() {
        return "PilotPlane{" +
                "id=" + id +
                ", flewFrom=" + flewFrom +
                ", flewTo=" + flewTo +
                ", plane=" + plane +
                ", pilotName=" + pilotName +
                '}';
    }
}
