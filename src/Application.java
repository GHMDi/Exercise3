public class Application {

    public static void main(String[] args) {

//        Exercise 2.1
//         Airplane plane1 = new Airplane("ABC123",false);
//        Airplane plane2 = new Airplane("DDD888",false);


//        plane1.loadPlane(43,33);
//        plane1.landPlane();
//        plane1.takeoffPlane();
//        plane2.loadPlane(23,33);
//        plane2.takeoffPlane();
//        plane1.landPlane();
//        plane1.unloadPlane();
//        plane2.takeoffPlane();
//        plane2.landPlane();
//        plane2.unloadPlane();

        // Exercise 2.2
        Airport eindhoven = new Airport("Eindhoven");
        System.out.println("Aircraft from airport " + eindhoven.getName());
        eindhoven.printPlanes();
        System.out.println();
        eindhoven.availablePlanes();


    }
}
