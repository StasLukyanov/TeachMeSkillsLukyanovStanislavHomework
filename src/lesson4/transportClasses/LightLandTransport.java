package lesson4.transportClasses;

import lesson4.abstractClasses.LandTransport;

public class LightLandTransport extends LandTransport {
    String bodyType;
    int numberPassengers;

    public LightLandTransport(int numberWheels, int fuelConsumption) {
        super(numberWheels, fuelConsumption);
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }
    public String character(){
        String str = "Характеристики легковой техники:" + getPower() +" "+ getMaxSpeed() +" "+ getWeight() +" "
                + getModel() +" "+ getNumberWheels() +" "+ getFuelConsumption() +" "+ getBodyType() +" "+ getNumberPassengers();
        return str;
    }
    int s=0;
    public void put(int time) {
        this.s = getMaxSpeed() * time; // путь

        System.out.println("За время " + time + " ч, автомобиль " + getModel() + " двигаясь c максимальной скоростью "
                + getMaxSpeed() + " км/ч проедет " + s + " км и израсходует " + budi() + " литров топлива ");
    }
    private double budi(){
        double q =((double) getFuelConsumption()/100)*s; // потраченное топливо
        return q;
        }

    }



