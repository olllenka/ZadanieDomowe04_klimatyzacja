public class RoomTester {
    public static void main(String[] args) {
        Room room1 = new Room();
        room1.setFloorSpace(25.5);
        room1.setTemperature(20.0);
        room1.setAirConditioner(true);

        Room room2 = new Room();
        room2.setFloorSpace(15.3);
        room2.setTemperature(38.7);
        room2.setAirConditioner(false);

        System.out.println("Temperatura: " + room1.getTemperature() + ", pokój z klimatyzacją: " + room1.isAirConditioner());
        room1.coolDown();
        System.out.println("Temperatura: " + room1.getTemperature() + ", pokój z klimatyzacją: " + room1.isAirConditioner());
        System.out.println();

        System.out.println("Temperatura: " + room2.getTemperature() + ", pokój z klimatyzacją: " + room2.isAirConditioner());
        room2.coolDown();
        System.out.println("Temperatura: " + room2.getTemperature() + ", pokój z klimatyzacją: " + room2.isAirConditioner());

    }
}
