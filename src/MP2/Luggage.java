/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;

public class Luggage extends ObjectPlusPlus {

    private int id;
    private double weight;

    public Luggage(int id, double weight) {
        super();
        this.id = id;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "id=" + id +
                ", weight=" + weight +
                '}';
    }
}
