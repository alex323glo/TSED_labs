/**
 * Class: CargoTrain
 *
 * Version: 1.2
 *
 * Copyrights: none.
 * */

package lab1.v1.model.lab5;

/**
 * Created by Alexey_O on 23.05.2017.
 */
public class CargoTrain extends Train {
    /**
     * This class extends from class Train and
     * contains methods and fields to realise
     * functions of simple CargoTrain.
     * */
    private double wholeCargoWeight;

    public CargoTrain() {

    }

    public CargoTrain(int numOfVagon) {
        if (!this.setNumOfVagons(numOfVagon)) {
            System.out.println("CargoTrain.CargoTrain(int): wrong num of vagons!");
        }
    }

    public CargoTrain(int numOfVagon, double wholeCargoWeight) {
        if (!this.setNumOfVagons(numOfVagon)) {
            System.out.println("CargoTrain.CargoTrain(int, double): wrong num of vagons!");
        }
        if (!this.setWholeCargoWeight(wholeCargoWeight)) {
            System.out.println("CargoTrain.CargoTrain(int, double): wrong whole cargo weight!");
        }
    }

    /**
     * Sets to current instance of class
     * whole weight of cargo.
     * Type of setted value is double.
     * */
    public boolean setWholeCargoWeight(double wholeCargoWeight) {
        if (wholeCargoWeight < 0) {
            System.out.println("CargoTrain.setWholeCargoWeight(): wrong whole cargo weight!");
            return false;
        }
        this.wholeCargoWeight = wholeCargoWeight;
        return true;
    }

    /**
     * Gets whole weight of train's cargo.
     * type of returned value is double.
     * */
    public double getWholeCargoWeight() {
        return wholeCargoWeight;
    }
}