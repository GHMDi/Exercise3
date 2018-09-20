package extraopdrachten;

public class Airplane {
    private String planeIdentification;
    private int maxPassenger;
    private int currentPassenger;
    private boolean isFlying;
    private int cruiseSpeed;

    public Airplane(String planeIdentification, boolean isFlying) {
        this.planeIdentification = planeIdentification;
        this.isFlying = isFlying;
        //nieuwe constructor gemaakt die om planeIdentification vraagt en vraagt of vliegtuig vliegt
    }

    public void loadPlane(int passengersToLoad,int maxPassenger){
        setCurrentPassenger(passengersToLoad);
        setMaxPassenger(maxPassenger);
        int notFittingPassengers = (currentPassenger - maxPassenger);
        if (currentPassenger <= maxPassenger){
            System.out.println("Airplane " + planeIdentification + " charges " + currentPassenger + " Passengers.");
        }
        else System.out.println("Airplane " + planeIdentification + " charges " + maxPassenger + " Passengers." +
                notFittingPassengers + " did not fit.");
    }

    public void takeoffPlane(){
        setFlying(true);
        System.out.println("Airplane "+ planeIdentification + " takes off.");
    }

    public void landPlane(){
        setFlying(false);
        System.out.println("Plane "+ planeIdentification + " lands.");
    }

    public void unloadPlane(){
        int i = getCurrentPassenger();
        System.out.println("Airplane "+ planeIdentification +" unloads " + i + " passengers.");
        setCurrentPassenger(currentPassenger - i);
    }


    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public void setPlaneIdentification(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public void setCurrentPassenger(int currentPassenger) {
        this.currentPassenger = currentPassenger;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }
}