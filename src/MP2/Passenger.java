/*
 * Copyright (c) 2020
 * Łukasz Brzozowski (s17174) @ PJATK
 */

package MP2;

import static MP2.Utils.boardingPassClass;
import static MP2.Utils.passengerClass;

public class Passenger extends ObjectPlusPlus {

    private String name;
    private String surname;
    private Flight flight;

    public Passenger(String name, String surname, Flight flight) {
        super();
        this.name = name;
        this.surname = surname;
        this.flight = flight;
    }

    public BoardingPass createBoardingPass(String number) throws Exception {
        BoardingPass newBoardingPass = new BoardingPass(this, number);
        this.addPart(boardingPassClass, passengerClass, newBoardingPass);
        return newBoardingPass;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Flight getFlight() {
        return flight;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", flight=" + flight +
                '}';
    }

    static class BoardingPass extends ObjectPlusPlus {

        public static int counter = 0;
        private int id;
        private String number;
        private Passenger passenger;

        private BoardingPass(Passenger passenger, String number) {
            super();
            this.id = ++counter;
            this.number = number;
            this.passenger = passenger;
        }

        public Passenger getPassenger() {
            return passenger;
        }

        @Override
        public String toString() {
            return "BoardingPass{" +
                    "id=" + id +
                    ", number=" + number +
                    '}';
        }


    }
}
