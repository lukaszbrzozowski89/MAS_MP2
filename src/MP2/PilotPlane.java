/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;

import java.time.LocalDate;

import static MP2.Utils.*;

public class PilotPlane extends ObjectPlusPlus {

    private static int counter = 1;
    private int id;
    private LocalDate flewFrom;
    private LocalDate flewTo;

    public PilotPlane(LocalDate flewFrom, LocalDate flewTo, Plane plane, Pilot pilot) {
        this.flewFrom = flewFrom;
        this.flewTo = flewTo;
        this.addLink(planeClass, pilotPlaneClass, plane);
        this.addLink(pilotClass, pilotPlaneClass, pilot);
        this.id = counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFlewFrom() {
        return flewFrom;
    }

    public LocalDate getFlewTo() {
        return flewTo;
    }

    @Override
    public String toString() {
        return "PilotPlane{" +
                "id=" + id +
                ", flewFrom=" + flewFrom +
                ", flewTo=" + flewTo +
                '}';
    }
}
