package lesson4.transportClasses;

import lesson4.abstractClasses.AirTransport;

public class CivilAirTransport extends AirTransport {
    int numberPassengers;
    boolean businessClass;
    int c = 180;

    public CivilAirTransport(int wingspan, int minTakeOffLength,int numberPassengers, boolean businessClass) {
        super(wingspan, minTakeOffLength);
        this.businessClass=businessClass;
        this.numberPassengers=numberPassengers;

    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
    public String character(){
        String str = "Характеристики гражданской техники: " + getPower()+" "+ getMaxSpeed()+" "+ getWeight() +" "
                + getModel() +" "+ getWingspan() +" "+getMinTakeOffLength() + " "+businessClass+ " "+numberPassengers;
        return str;
    }
    public void examination (int civilCapacity){
        if (civilCapacity<= c){
            System.out.println("Летательный аппарат загружен ");
        }
        else System.out.println("Летательный аппарат не резиновый нужен по больше");
    }
}
