/**
 * Class: Main
 *
 * Version: 1.2
 *
 * Copyrights: none*/

package lab1.v1.model.lab5;

import java.util.LinkedList;

/**
 * Created by Alexey_O on 22.05.2017.
 */

public class Main {
    public static void main(String[] args) {
        tester1();
        tester2();
        tester3();
        tester4();
        tester5();
    }

    /**
     * Demonstrates functionality of
     * Train class.
     * */
    public static void tester1() {
        Train train = new Train(-1);
        train.toot(1);
        train.toot(5);
        System.out.println(train.getNumOfVagons());
        train.setNumOfVagons(7);
        System.out.println(train.getNumOfVagons());
        train.setNumOfVagons(-2);
        System.out.println(train.getNumOfVagons());
    }

    /**
     * Demonstrates functionality of
     * CargoTrain class.
     * */
    public static void tester2() {
        CargoTrain cargoTrain1 = new CargoTrain();
        CargoTrain cargoTrain2 = new CargoTrain(-2);
        CargoTrain cargoTrain3 = new CargoTrain(4);
        CargoTrain cargoTrain4 = new CargoTrain(-6, -76.4);
        CargoTrain cargoTrain5 = new CargoTrain(-6, 76.4);
        CargoTrain cargoTrain6 = new CargoTrain(6, -76.4);
        CargoTrain cargoTrain7 = new CargoTrain(6, 76.4);

        System.out.println("----------------------");

        System.out.println(cargoTrain1.getNumOfVagons() + "; " + cargoTrain1.getWholeCargoWeight());
        System.out.println(cargoTrain2.getNumOfVagons() + "; " + cargoTrain2.getWholeCargoWeight());
        System.out.println(cargoTrain3.getNumOfVagons() + "; " + cargoTrain3.getWholeCargoWeight());
        System.out.println(cargoTrain4.getNumOfVagons() + "; " + cargoTrain4.getWholeCargoWeight());
        System.out.println(cargoTrain5.getNumOfVagons() + "; " + cargoTrain5.getWholeCargoWeight());
        System.out.println(cargoTrain6.getNumOfVagons() + "; " + cargoTrain6.getWholeCargoWeight());
        System.out.println(cargoTrain7.getNumOfVagons() + "; " + cargoTrain7.getWholeCargoWeight());

        System.out.println("----------------------");

        cargoTrain1.setWholeCargoWeight(11.1);
        cargoTrain1.setNumOfVagons(11);
        System.out.println(cargoTrain1.getNumOfVagons() + "; " + cargoTrain1.getWholeCargoWeight());
    }

    /**
     * Demonstrates functionality of
     * TechnicalTrain class.
     * */
    public static void tester3() {
        TechnicalTrain technicalTrain1 = new TechnicalTrain();
        TechnicalTrain technicalTrain2 = new TechnicalTrain(-2);
        TechnicalTrain technicalTrain3 = new TechnicalTrain(2);
        TechnicalTrain technicalTrain4 = new TechnicalTrain(-1, "");
        TechnicalTrain technicalTrain5 = new TechnicalTrain(-1, "Special");
        TechnicalTrain technicalTrain6 = new TechnicalTrain(2, "Super special");

        System.out.println("----------------------");

        System.out.println(technicalTrain1.getNumOfVagons() + "; " + technicalTrain1.getSpecialisation());
        System.out.println(technicalTrain2.getNumOfVagons() + "; " + technicalTrain2.getSpecialisation());
        System.out.println(technicalTrain3.getNumOfVagons() + "; " + technicalTrain3.getSpecialisation());
        System.out.println(technicalTrain4.getNumOfVagons() + "; " + technicalTrain4.getSpecialisation());
        System.out.println(technicalTrain5.getNumOfVagons() + "; " + technicalTrain5.getSpecialisation());
        System.out.println(technicalTrain6.getNumOfVagons() + "; " + technicalTrain6.getSpecialisation());

        System.out.println("----------------------");

        technicalTrain1.setNumOfVagons(45);
        technicalTrain1.setSpecialisation(null);
        System.out.println(technicalTrain1.getNumOfVagons() + "; " + technicalTrain1.getSpecialisation());
        technicalTrain1.setNumOfVagons(-2);
        technicalTrain1.setSpecialisation("Non special");
        System.out.println(technicalTrain1.getNumOfVagons() + "; " + technicalTrain1.getSpecialisation());
    }

    /**
     * Demonstrates first part of functionality of
     * PassengerTrain class.
     * */
    public static void tester4() {
        PassengerTrain passengerTrain1 = new PassengerTrain();
        PassengerTrain passengerTrain2 = new PassengerTrain(-2, ComfortClass.A, -6, 11);
        PassengerTrain passengerTrain3 = new PassengerTrain(14, ComfortClass.A, 11, 22);
        LinkedList<Vagon> myVagons = new LinkedList<Vagon>();
        myVagons.add(new Vagon(ComfortClass.A, 21, 11));
        myVagons.add(new Vagon(ComfortClass.D, 1, 1));
        myVagons.add(new Vagon(ComfortClass.B, 10, 10));
        PassengerTrain passengerTrain4 = new PassengerTrain(myVagons);

        System.out.println("----------------------");

        System.out.println(passengerTrain1.getNumOfVagons() + "; " + passengerTrain1.getWholeNumOfPassengers() + "; " + passengerTrain1.getWholeNumOfBags());
        System.out.println(passengerTrain2.getNumOfVagons() + "; " + passengerTrain2.getWholeNumOfPassengers() + "; " + passengerTrain2.getWholeNumOfBags());
        System.out.println(passengerTrain3.getNumOfVagons() + "; " + passengerTrain3.getWholeNumOfPassengers() + "; " + passengerTrain3.getWholeNumOfBags());
        System.out.println(passengerTrain4.getNumOfVagons() + "; " + passengerTrain4.getWholeNumOfPassengers() + "; " + passengerTrain4.getWholeNumOfBags());

        System.out.println("----------------------");

        passengerTrain4.removeVagon(2);
        passengerTrain4.addVagon(new Vagon(ComfortClass.E, 50, 80));
        System.out.println(passengerTrain4.getNumOfVagons() + "; " + passengerTrain4.getWholeNumOfPassengers() + "; " + passengerTrain4.getWholeNumOfBags());
    }

    /**
     * Demonstrates second part of functionality of
     * PassengerTrain class.
     * */
    public static void tester5() {
        LinkedList<Vagon> startVagons = new LinkedList<Vagon>();
        startVagons.add(new Vagon(ComfortClass.A, 21, 51));
        startVagons.add(new Vagon(ComfortClass.B, 25, 54));
        startVagons.add(new Vagon(ComfortClass.C, 31, 60));

        PassengerTrain passengerTrain = new PassengerTrain(startVagons);
        System.out.println(passengerTrain.getInfo() + "\n------------------------------");

        passengerTrain.addVagon(new Vagon(ComfortClass.E, 45, 45));
        passengerTrain.addVagon(new Vagon(ComfortClass.A, 15, 40));
        passengerTrain.addVagon(new Vagon(ComfortClass.D, 40, 48));
        passengerTrain.addVagon(new Vagon(ComfortClass.C, 36, 54));
        System.out.println(passengerTrain.getInfo() + "\n------------------------------");

        passengerTrain.removeVagon(2);
        passengerTrain.addVagon(new Vagon(ComfortClass.C, 35, 58));
        System.out.println(passengerTrain.getInfo() + "\n------------------------------");

        passengerTrain.sortByComfortLevel();
        System.out.println(passengerTrain.getInfo() + "\n------------------------------");

        Vagon neededVagon = passengerTrain.getVagon(35, 45);
        System.out.println("Needed vagon (35..45): \n" +
                neededVagon.getComfortClass() + " ; " +
                neededVagon.getNumOfPassengers() + " ; " +
                neededVagon.getNumOfBags());
    }
}