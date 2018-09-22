package extraopdrachten;

public class Airport {
    private String name;
    private boolean available;
    Airplane[] airplaneFromAirport = new Airplane[5];
    // Give airport name + assign String to airplane Array

    public Airport(String name) {
        airplaneFromAirport[0] = new PeoplePlane("ABC123", false,"Eindhoven",
                30, 60);
        airplaneFromAirport[1] = new PeoplePlane("DDD888", false,"Eindhoven",
                30, 60);
        airplaneFromAirport[2] = new PeoplePlane("ODL345", false,"Eindhoven",
                30, 60);
        airplaneFromAirport[3] = new CargoPlane("FF2134", false,"Eindhoven",
                5);
        airplaneFromAirport[4] = new CargoPlane("PLA166", false,"Eindhoven",
                0);
    }

    // Exercise 2.2 --> Available planes for loop die checkt of er nog plek is
    public void printPlanes() {
        // for loop om iedere airplane te printen --> planeID & status
        for (int i = 0; i < airplaneFromAirport.length; i++) {
            Airplane airplane = airplaneFromAirport[i];
            // Hierbij maak ik een koppeling met de Airplane class -->
            // variabele met de naam airplane, die je weer verder kunt gebruiken
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
                        "requested. Is not flying, and has still room for " + airplane.getAvailablePassengers());
                setAvailable(true);
                airplane.loadPlane();}
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}