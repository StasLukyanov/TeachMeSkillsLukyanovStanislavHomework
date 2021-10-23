package lesson4.application;

import lesson4.transportClasses.CargoLandTransport;
import lesson4.transportClasses.CivilAirTransport;
import lesson4.transportClasses.LightLandTransport;
import lesson4.transportClasses.MilitaryAirTransport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MilitaryAirTransport military = new MilitaryAirTransport(111,222);
        military.setMaxSpeed(120);
        military.setPower(10);
        military.setBailoutSystem(false);
        military.setNumberMissiles(2);
        military.setWeight(120);
        military.setModel("MiG-24");
        military.setWingspan(999);
        System.out.println(military.character());
        CivilAirTransport civil = new CivilAirTransport(1, 2,4,true);
        civil.setMaxSpeed(12);
        civil.setModel("Boing");
        civil.setPower(400);
        civil.setWeight(45);
        System.out.println(civil.character());
        CargoLandTransport cargo = new CargoLandTransport(4,65);
        cargo.setPower(44);
        cargo.setMaxSpeed(5);
        cargo.setWeight(55);
        cargo.setModel("Maz");
        cargo.setNumberWheels(4);
        cargo.setFuelConsumption(55);
        cargo.setCarryingCapacity(4);
        System.out.println(cargo.character());
        LightLandTransport light = new LightLandTransport(4,3);
        light.setBodyType("Vasya");
        light.setWeight(5);
        light.setNumberPassengers(5);
        light.setModel("Fiat");
        light.setPower(445);
        light.setFuelConsumption(8);
        light.setMaxSpeed(84);
        System.out.println(light.character());
        light.put(5);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите массу");
        cargo.examination(scan.nextInt());
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество пассажиров");
        civil.examination(sc.nextInt());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если у вас есть катапульта ведите - 1, если нету - любую другую цифру ");
        if (scanner.nextLong()==1){
            military.proverka(true);
        }
        else  military.proverka(false);



    }
}
