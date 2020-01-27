public class Room {
    private double floorSpace;
    private double temperature;
    private boolean airConditioner;

    public Room() {
    }

    public void setFloorSpace(double floorSpace) {
        this.floorSpace = floorSpace;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public boolean coolDown(){
        if(airConditioner && temperature>16){
            temperature-=1;
            return true;
        }
        else
            return false;
    }
}
