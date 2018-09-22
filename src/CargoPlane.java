public class CargoPlane extends Airplane {
    private int maxCargo = 20;
    private int cruiseSpeed = 600;
    private String name = "Boeing 777-cargo plane";

    public CargoPlane(String newPlaneIdentification, boolean newIsFlying, String newOrigin,
                      String newType, int newCurrentLoad, int newMaxLoad) {
        super(newPlaneIdentification, newIsFlying, newOrigin, newType, newCurrentLoad, newMaxLoad);
        this.maxCargo = newMaxLoad;
    }

    public int getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(int maxCargo) {
        this.maxCargo = maxCargo;
    }

    @Override
    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    @Override
    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}