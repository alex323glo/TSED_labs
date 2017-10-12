/**
 * Class: TechnicalTrain
 *
 * Version: 1.1
 *
 * Copyrights: none
 * */

package lab1.v1.model.lab5;

/**
 * Created by Alexey_O on 23.05.2017.
 */
public class TechnicalTrain extends Train {
    private String specialisation = "Universal";

    public TechnicalTrain() {

    }

    public TechnicalTrain(int numOfVagons) {
        if (!setNumOfVagons(numOfVagons)) {
            System.out.println("TechnicalTrain.TechnicalTrain(int): wrong num of vagons!");
        }
    }

    public TechnicalTrain(int numOfVagons, String specialisation) {
        if (!setNumOfVagons(numOfVagons)) {
            System.out.println("TechnicalTrain.TechnicalTrain(int, String): wrong num of vagons!");
        }
        if (!setSpecialisation(specialisation)) {
            System.out.println("TechnicalTrain.TechnicalTrain(int, String): wrong name of specialisation!");
        }
    }

    /**
     * Sets specialisation of current technical train.
     * Takes String name of specialisation as parameter.
     * Returns false if parameter is null and/or operation
     * is not successful
     * */
    public boolean setSpecialisation(String specialisation) {
        if (specialisation == null || specialisation.length() < 1) {
            System.out.println("TechnicalTrain.setSpecialisation(): wrong name of specialisation!");
            return false;
        }
        this.specialisation = specialisation;
        return true;
    }

    /**
     * Gets name of specialisation of current technical train.
     * Returns String not-null name of specialisation of
     * current instance of TechnicalTrain class.
     * */
    public String getSpecialisation() {
        return specialisation;
    }
}