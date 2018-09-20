package extraopdrachten;

public class Application {

    public static void main(String[] args) {

        Airplane plane1 = new Airplane("ABC123",false);
        Airplane plane2 = new Airplane("DDD888",false);

        plane1.loadPlane(43,33);
        plane1.takeoffPlane();
        plane2.loadPlane(23,49);
        plane1.landPlane();
        plane1.unloadPlane();
        plane2.takeoffPlane();
        plane2.landPlane();
        plane2.unloadPlane();
    }
}
