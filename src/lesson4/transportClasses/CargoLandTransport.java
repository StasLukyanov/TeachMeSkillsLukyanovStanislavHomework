package lesson4.transportClasses;

import lesson4.abstractClasses.LandTransport;

public class CargoLandTransport extends LandTransport {
    int carryingCapacity;
    public int m = 300;
    public CargoLandTransport(int numberWheels, int fuelConsumption) {
        super(numberWheels, fuelConsumption);
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
    public String character(){
        String str = "Характеристики грузовой техники: " + getPower() +" "+ getMaxSpeed() +" "+ getWeight() +" "
                + getModel() +" "+ getNumberWheels() +" "+ getFuelConsumption() +" "+  carryingCapacity;
        return str;
    }

    public void examination(int cargoСapacity){
        if(cargoСapacity <= m){
            System.out.println("Грузовик загружен");
        }
        else System.out.println("Вам нужен грузовик побольше");
    }
}
