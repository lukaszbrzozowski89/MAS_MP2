/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package asocjacja_z_atrybutem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pilot extends ObjectPlusPlus {

    private int id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    private ArrayList<PilotPlane> pilotPlane = new ArrayList<>();

    public Pilot(int id, String name, String surname, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<PilotPlane> getPilotPlane() {
        return pilotPlane;
    }

    public void setPilotPlane(ArrayList<PilotPlane> pilotPlane) {
        this.pilotPlane = pilotPlane;
    }

    /*
    Asocjacja z atrybutem
     */
    public void deletePilotPlane(PilotPlane pilotPlane) {
        getPilotPlane().remove(pilotPlane);
    }

    public void removePilot() {                          // METODA USUWAJACA POWIĄZANIE Pilota

        for (PilotPlane pilotPlane : (ArrayList<PilotPlane>) this.pilotPlane.clone()){      // nie można usuwać elentów, po których się właśnie iteruje == kopia listy

            this.deletePilotPlane(pilotPlane);
        }
        pilotPlane.clear();
    }

}
