package lesson4.abstractClasses;

abstract public class LandTransport extends Transport {
    int numberWheels;
    int fuelConsumption;

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public LandTransport(int numberWheels, int fuelConsumption) {
        this.numberWheels = numberWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
