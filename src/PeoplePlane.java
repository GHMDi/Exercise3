public class PeoplePlane extends Airplane {
    private int cruiseSpeed = 899;
    private String name = "Boeing 787-900 Dreamliner";

    public PeoplePlane(String newPlaneIdentification, boolean newIsFlying, String newOrigin,
                       String newType, int newCurrentLoad, int newMaxLoad) {
        super(newPlaneIdentification, newIsFlying, newOrigin, newType, newCurrentLoad, newMaxLoad);
        // Nieuwe constructor gemaakt die Airplane specs inherit, maar deze met de super vernieuwd.
        // Daarna specs die voor de PeoplePlane specifiek zijn bijgewerkt
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