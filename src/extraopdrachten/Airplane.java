package extraopdrachten;

public class Airplane {
    private String planeIdentification;
    private boolean isFlying;
    private int cruiseSpeed;
    private String origin;
    // Wat zijn de general specs van een airplane. ID / flight Status/Speed/Origin
    // General methodes Load & Unload

    public Airplane (String planeIdentification, boolean isFlying, String origin) {
        this.planeIdentification = planeIdentification;
            this.isFlying = isFlying;
            this.origin = origin;
    }

    public void takeoffPlane(){
        if (isFlying() == true) {
            System.out.println("Airplane " + planeIdentification +
                    " can not take off, because we are still flying.");
        }
        else if (isFlying() == false)
            System.out.println("Plane " + planeIdentification + " rises.");
        setFlying(true);
    }

    public void landPlane(){
        if (isFlying() == false){
            System.out.println("Airplane " + planeIdentification +
                    " can not land, because we are still on the ground.");
        }

        else if (isFlying() == true)
            // Always recall method is Flying () instead of variable, else it fails
            System.out.println("Plane "+ planeIdentification + " lands.");
        setFlying(false);
    }

    public void loadPlane() {

    }

    public void unloadPlane() {

    }

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public void setPlaneIdentification(String planeIdentification) {
        this.planeIdentification = planeIdentification;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}