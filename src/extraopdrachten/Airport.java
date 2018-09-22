package extraopdrachten;

public class Airport {
    private String name;
    private boolean available;
    Airplane[] airplaneFromAirport = new Airplane[3];
    // Give airport name + assign String to airplane Array

    public Airport(String name) {
        airplaneFromAirport[0] = new Airplane("ABC123", false,0,30);
        airplaneFromAirport[1] = new Airplane("DDD888", true,0,30);
        airplaneFromAirport[2] = new Airplane("ODL345", true,0,30);
        this.name = name;
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
                airplane.loadPlane(63,30);}
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