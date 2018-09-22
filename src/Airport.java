public class Airport {
    private String name;
    private boolean available;

    Airplane[] airplaneFromAirport = new Airplane[5];
    // Give airport name + assign String to airplane Array

    public Airport(String name) {
        this.name = name;
        setName(name);
        airplaneFromAirport[0] = new PeoplePlane("ABC123", false,
                "Eindhoven", "PeoplePlane", 30, 60);
        airplaneFromAirport[1] = new PeoplePlane("DDD888", true,
                "Eindhoven", "PeoplePlane", 30, 60);
        airplaneFromAirport[2] = new PeoplePlane("ODL345", true,
                "Eindhoven", "PeoplePlane", 30, 60);
        airplaneFromAirport[3] = new CargoPlane("FF2134", false,
                "Eindhoven", "CargoPlane", 5, 20);
        airplaneFromAirport[4] = new CargoPlane("PLA166", true,
                "Eindhoven", "CargoPlane", 0, 20);
    }

    // Exercise 2.2 --> Available planes for loop die checkt of er nog plek is

    public void printPlanes() {
        System.out.println("Passagiersvliegtuigen");
        for (Airplane PeoplePlane : airplaneFromAirport) {
            if (PeoplePlane.getType() == "PeoplePlane")
                System.out.println("Passagiersvliegtuig " + PeoplePlane.getPlaneIdentification());
          else System.out.println();
        }
        System.out.println("Cargovliegtuigen");
        for (Airplane CargoPlane : airplaneFromAirport) {
            if (CargoPlane.getType() == "CargoPlane")
                System.out.println("Cargovliegtuig " + CargoPlane.getPlaneIdentification());
        }
    }


    public boolean availablePlanes() {
        for (int i = 0; i < airplaneFromAirport.length; i++) {
            Airplane airplane = airplaneFromAirport[i];
            airplane.checkAvailable();
            // Hierbij maak ik een koppeling met de Airplane class -->
            // variabele met de naam airplane, die je weer verder kunt gebruiken
            if (airplane.isFlying() == false) {
                switch (airplane.getType()) {
                    case "PeoplePlane":
                        System.out.println("Passagiersvliegtuig " + airplane.getPlaneIdentification() + " " +
                                "opgevraagd. Is niet aan het vliegen. Heeft nog plek voor " + airplane.getAvailableLoad()
                                + " passagiers.");
                        setAvailable(true);
//                            System.out.println("switch 1 OK");
                        airplane.loadPlane(63);
                        break;
                    case "CargoPlane":
                        System.out.println("Cargovliegtuig " + airplane.getPlaneIdentification() + " " +
                                "opgevraagd. Is niet aan het vliegen. Heeft nog plek voor " + airplane.getAvailableLoad()
                                + " ton cargo.");
                        setAvailable(true);
//                            System.out.println("switch 2 OK");
                        airplane.loadPlane(20);
                        break;
                }
            }
        }
        return true;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}