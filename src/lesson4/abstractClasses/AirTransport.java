package lesson4.abstractClasses;

abstract public class AirTransport extends Transport {
    int wingspan;
    int minTakeOffLength;

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinTakeOffLength() {
        return minTakeOffLength;
    }

    public void setMinTakeOffLength(int minTakeOffLength) {
        this.minTakeOffLength = minTakeOffLength;
    }

    public AirTransport(int wingspan, int minTakeOffLength) {
        super();
        this.wingspan = wingspan;
        this.minTakeOffLength = minTakeOffLength;
    }
}
