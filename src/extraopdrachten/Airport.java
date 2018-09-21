package extraopdrachten;

import java.util.ArrayList;
import java.util.List;


public class Airport {
    private String name;
    Airplane[] airplaneFromAirport = new Airplane[3];
    // Give airport name + assign String to airplane Array

    public Airport(String name) {
        airplaneFromAirport[0] = new Airplane("ABC123", false);
        airplaneFromAirport[1] = new Airplane("DDD888", true);
        airplaneFromAirport[2] = new Airplane("ODL345", false);
    }

    // Exercise 2.2 --> Available planes for loop die checkt of er nog plek is
    public void printPlanes() {
        // for loop om iedere airplane te printen --> planeID & status
        for (int i = 0; i < airplaneFromAirport.length; i++) {
            Airplane airplane = airplaneFromAirport[i];
            // Hierbij maak ik een koppeling met de Airplane class -->
            // variabele met de naam airplane, die je weer verder kunt gebruiken
            System.out.println("Aircraft from airport " + airplane.getOrigin());
            // deze wil ik eigenlijk voorafgaand printen voor de for loop,
            // maar dan kent die airplane.getOrigin() niet.
            System.out.println("Airplane " + airplane.getPlaneIdentification());

        }
    }

    public void availablePlanes(){
        for (int i = 0; i < airplaneFromAirport.length; i++){
            Airplane airplane = airplaneFromAirport[i];
            // Hierbij maak ik een koppeling met de Airplane class -->
            // variabele met de naam airplane, die je weer verder kunt gebruiken
            if (airplane.isFlying() == false){
                System.out.println("Airplane " + airplane.getPlaneIdentification() + " " +
                        "requested. Is not flying, and has still room for " + airplane.getNotFittingPassengers());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airplane[] getAirplaneFromAirport() {
        return airplaneFromAirport;
    }

    public void setAirplaneFromAirport(Airplane[] airplaneFromAirport) {
        this.airplaneFromAirport = airplaneFromAirport;
    }

}