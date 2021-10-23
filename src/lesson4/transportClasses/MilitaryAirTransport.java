package lesson4.transportClasses;

import lesson4.abstractClasses.AirTransport;

public class MilitaryAirTransport extends AirTransport {
    boolean bailoutSystem;
    int numberMissiles;

    public MilitaryAirTransport(int wingspan, int minTakeOffLength) {
        super(wingspan, minTakeOffLength);
    }

    public boolean isBailoutSystem() {
        return bailoutSystem;
    }

    public void setBailoutSystem(boolean bailoutSystem) {
        this.bailoutSystem = bailoutSystem;
    }

    public int getNumberMissiles() {
        return numberMissiles;
    }

    public void setNumberMissiles(int numberMissiles) {
        this.numberMissiles = numberMissiles;
    }
    public String character(){
        String str = "Характеристики военной техники: " + getPower()+ " "+ getMaxSpeed() +" "+ getWeight() +" "
                + getModel() +" "+ getWingspan() +" "+ getMinTakeOffLength() + " "+ bailoutSystem + " "+ numberMissiles +
                " Наша мощность новая: "+powerHorse(getPower());
        return str;
    }
    public double powerHorse(int power){
        double kilowatt = power*0.74;
        return kilowatt;
    }
    public void proverka(boolean katapul){
        if(katapul){
            System.out.println("Катапультирование прошло успешно");
        }
        else System.out.println("У вас нет такой системы");

    }



}
