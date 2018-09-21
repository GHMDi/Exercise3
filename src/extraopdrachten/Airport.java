package extraopdrachten;

import java.util.ArrayList;
import java.util.List;

public class Airport{
    // extends airplane array. Assignment says expand the Class Airplane with featue--> question to Rick

       String airplaneOnAirport = "";
        // Give airport name + assign String to airplane Array

    public Airport() {
            Airplane[] airplaneOnAirport = new Airplane[3];
            airplaneOnAirport[0] = new Airplane("ABC123", false);
            airplaneOnAirport[1] = new Airplane("DDD888", true);
            airplaneOnAirport[2] = new Airplane("ODL345", false);
            System.out.println(airplaneOnAirport);
    }

        // Create array of 3 airplanes which are filled in the Airport Constructor

    public String getAirplaneOnAirport() {
        return airplaneOnAirport;
    }

    public void setAirplaneOnAirport(String airplaneOnAirport) {
        this.airplaneOnAirport = airplaneOnAirport;
    }
}

