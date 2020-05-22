/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package asocjacja_z_atrybutem;

import java.time.LocalDate;

public class PilotPlane extends ObjectPlusPlus {

    private int id;
    private static int counter = 1;
    private LocalDate flewFrom;
    private LocalDate flewTo;
    private Plane plane;
    private Pilot pilotName;

    public PilotPlane(LocalDate flewFrom, LocalDate flewTo, Plane plane, Pilot pilotName) {
        this.flewFrom = flewFrom;
        this.flewTo = flewTo;
        this.plane = plane;
        this.pilotName = pilotName;
        plane.addLink(Plane.class.getSimpleName(), Pilot.class.getSimpleName(), this);
        pilotName.addLink(Pilot.class.getSimpleName(), Plane.class.getSimpleName(), this);
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        PilotPlane.counter = counter;
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
        String result = "";
        result += "Pilot: " + pilotName.getName() + " " + pilotName.getSurname() + "\n";

        result += "Samolot: " + plane.getModel() + "\n";

        result += "Obsługiwany od: " + this.getFlewFrom() + " do: " + this.getFlewTo() + "\n";

        result += "\n----------------------\n";

        return result;
    }

}
