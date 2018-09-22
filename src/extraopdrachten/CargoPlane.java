package extraopdrachten;

public class CargoPlane extends Airplane {
    private int maxCargo = 20;
    private int currentCargo;
    private int notFittingCargo;
    private int availableCargo;

    public CargoPlane (String newPlaneIdentification, boolean newIsFlying, String newOrigin,
                        int currentCargo) {
        super (newPlaneIdentification, newIsFlying,newOrigin);

        int availableCargo = maxCargo-currentCargo;
        this.currentCargo = currentCargo;
        this.availableCargo = availableCargo;

        // Nieuwe constructor gemaakt die Airplane specs inherit, maar deze met de super vernieuwd.
        // Daarna specs die voor de CaroPlane specifiek zijn bijgewerkt
    }
    public void loadPlane(int cargoToLoad, int maxCargo) {
        setCurrentCargo (cargoToLoad);
        setMaxCargo (maxCargo);
        int notFittingPassengers = (currentCargo - maxCargo);
        if (currentCargo <= maxCargo) {
            System.out.println("Airplane " + getPlaneIdentification() + " charges " + currentCargo + " tonnes of Cargo.");
        } else System.out.println("Airplane " + getPlaneIdentification() + " charges " + maxCargo + " tonnes of Cargo" +
                notFittingPassengers + " do not fit.");
        this.notFittingCargo = notFittingCargo;
    }

    public void unloadPlane() {
        int i = getCurrentCargo();
        System.out.println("Airplane " + getPlaneIdentification() + " unloads " + i + " tonnes of Cargo.");
        setCurrentCargo(currentCargo - i);
    }

    public int getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(int maxCargo) {
        this.maxCargo = maxCargo;
    }

    public int getCurrentCargo() {
        return currentCargo;
    }

    public void setCurrentCargo(int currentCargo) {
        this.currentCargo = currentCargo;
    }

    public int getNotFittingCargo() {
        return notFittingCargo;
    }

    public void setNotFittingCargo(int notFittingCargo) {
        this.notFittingCargo = notFittingCargo;
    }

    public int getAvailableCargo() {
        return availableCargo;
    }

    public void setAvailableCargo(int availableCargo) {
        this.availableCargo = availableCargo;
    }
}
