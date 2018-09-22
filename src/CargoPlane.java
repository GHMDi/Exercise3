public class CargoPlane extends Airplane {
    private int maxCargo = 20;

    public CargoPlane(String newPlaneIdentification, boolean newIsFlying, String newOrigin,
                      String newType, int newCurrentLoad, int newMaxLoad) {
        super(newPlaneIdentification, newIsFlying, newOrigin, newType, newCurrentLoad, newMaxLoad);
        this.maxCargo = newMaxLoad;
    }
}