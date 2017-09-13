/**
 * Class: PassengerTrain
 *
 * Version: 1.2
 *
 * Copyrights: none*/

package lab1.model.lab5;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Alexey_O on 23.05.2017.
 */
public class PassengerTrain extends Train {
    /**
    * This class organises structure and functionality of
    * simple PassengerTrain. Based on Train class.
    * */
    private LinkedList<Vagon> vagons = new LinkedList<Vagon>();;
    private long numOfPassengers;
    private long numOfBags;

    public PassengerTrain() {

    }

    public PassengerTrain(long numOfVagons, ComfortClass comfortClassOfEachVagon, long numOfPassengersInEachVagon, long numOfBagsInEachVagon) {
        if (!setNumOfVagons(numOfVagons)) {
            System.out.println("PassengerTrain.PassengerTrain(long, long, long): wrong num of vagons!");
            return;
        }
        if (numOfPassengersInEachVagon < 0 || numOfBagsInEachVagon < 0) {
            System.out.println("PassengerTrain.PassengerTrain(long, long, long): wrong num of bags or/and passengers in each vagon!");
            return;
        }
        for (int i = 0; i < (int) numOfVagons; i++) {
            vagons.add(new Vagon(comfortClassOfEachVagon, numOfPassengersInEachVagon, numOfBagsInEachVagon));
        }
        this.numOfPassengers = ((int)numOfVagons) * numOfPassengersInEachVagon;
        this.numOfBags = ((int)numOfVagons) * numOfBagsInEachVagon;
    }

    public PassengerTrain(LinkedList<Vagon> vagons) {
        if (!this.setVagons(vagons)) {
            System.out.println("PassengerTrain.PassengerTrain(): wrong vagon list!");
        }
    }

    /**
     * Sets list of vagons as base for current PassengerTrain object.
     * Takes LinkedList of Vagon class objects as parameter.
     * */
    public boolean setVagons(LinkedList<Vagon> vagons) {
        if (vagons == null || vagons.size() < 1) {
            System.out.println("PassengerTrain.setVagons(): vagon list is empty!");
            return false;
        }
        this.vagons.clear();
        numOfPassengers = 0;
        numOfBags = 0;
        for (Vagon vagon: vagons) {
            if (vagon != null) {
                this.vagons.add(vagon);
                numOfPassengers += vagon.getNumOfPassengers();
                numOfBags += vagon.getNumOfBags();
            }
        }
        return true;
    }

    /**
     * Gets list of vagons of current PassengerTrain object.
     * Returns LinkedList of Vagon class objects.
     * */
    public LinkedList<Vagon> getVagons() {
        return vagons;
    }

    /**
     * Gets whole number of passengers of current passenger train.
     * Returns sum of numbers of passengers from all vagons
     * of current train.
     * */
    public long getWholeNumOfPassengers() {
        return numOfPassengers;
    }

    /**
     * Gets whole number of bags of current passenger train.
     * Returns sum of numbers of bags from all vagons
     * of current train.
     * */
    public long getWholeNumOfBags() {
        return numOfBags;
    }

    /**
     * Adds single vagon to current train.
     * Takes ref on Vagon class object as parameter.
     * Returns false if operation is not successful.
     * */
    public boolean addVagon(Vagon vagon) {
        if (vagon == null) {
            System.out.println("PassengerTrain.addVagon(): vagon doesn't exist!");
            return false;
        }
        vagons.add(vagon);
        numOfPassengers += vagon.getNumOfPassengers();
        numOfBags += vagon.getNumOfBags();
        return true;
    }

    /**
     * Removes single vagon from current train.
     * Takes vagon's number (index in vagons' list) as parameter.
     * Returns false if operation is not successful.
     * */
    public boolean removeVagon(long vagonIndex) {
        if (vagons.size() < 1) {
            System.out.println("PassengerTrain.removeVagon(): vagon list is empty!");
            return false;
        }
        if (vagonIndex < 0 || vagonIndex > vagons.size() - 1) {
            System.out.println("PassengerTrain.removeVagon(): wrong vagon's index!");
            return false;
        }
        Vagon tempVagon = vagons.get((int) vagonIndex);
        numOfPassengers -= tempVagon.getNumOfPassengers();
        numOfBags -= tempVagon.getNumOfBags();
        vagons.remove((int)vagonIndex);
        return true;
    }

    /**
     * Sorts list of vagons of current train by comfort level.
     * Uses enumeration (ComfortClass enum) and comparator
     * (VagonComparator class) to compare and sort vagons.
     * This sort is unsafe: list of vagons will be sorted without
     * duplicating of old version (unsorted list).
     * Returns false if operation is not successful.
     * */
    public boolean sortByComfortLevel() {
        if (vagons.size() < 1) {
            System.out.println("PassengerTrain.sortByComfortLevel(): vagon list is empty!");
            return false;
        }
        if (vagons.size() > 1) {
            vagons.sort(new VagonComparator());
        }
        return true;
    }

    /**
     * Searches and returns first vagon, which has needed number of passengers
     * (the number must stand between minPassengersNum and maxPassengersNum values).
     *
     * Returns searched Vagon class object of current train if matches and
     * null if doesn't.
     *
     * Both parameters must be greater or equal to 0 and not greater than (vagons.size() - 1),
     * Second parameter must be equal or greater than first one.
     * If this requirements are not kept, will be returned null.
     * */
    public Vagon getVagon(long minPassengersNum, long maxPassengersNum) {
        if (minPassengersNum > maxPassengersNum ||
                minPassengersNum < 0 || minPassengersNum > numOfPassengers ||
                maxPassengersNum < 0 || maxPassengersNum > numOfPassengers) {
            System.out.println("PassengerTrain.getVagon(): wrong min and/or max values!");
            return null;
        }
        if (vagons.size() < 1) {
            System.out.println("PassengerTrain.getVagon(): vagon list is empty!");
            return null;
        }
        if (vagons.size() < 2) {
            return vagons.peek();
        }
        for (Vagon vagon: vagons) {
            if (vagon.getNumOfPassengers() >= minPassengersNum &&
                    vagon.getNumOfPassengers() <= maxPassengersNum) {
                return vagon;
            }
        }
        System.out.println("PassengerTrain.getVagon(): no such vagon in vagon list!");
        return null;
    }

    /**
     * This method prints current structure and condition of current PassengerTrain object
     * in "readable" form. It helps demonstrate functionality of PassengerTrain class easily
     * using formed console output.
     * */
    public String getInfo() {
        if (vagons.size() < 1) {
            return "Num of Vagons: 0; \nNum of passengers: 0; \nNum of bags: 0; \nVagons: \n...";
        }
        String tempString = "Num of Vagons: ";
        tempString += (this.getNumOfVagons() +
                "; \nNum of passengers: " + this.getWholeNumOfPassengers() +
                "; \nNum of bags: " + this.getWholeNumOfBags() +
                "; \nVagons: \n vagon_index) comfort_class ; num_of_passengers ; num_of_bags \n ");
        Iterator<Vagon> iterator = vagons.iterator();
        Vagon tempVagon = null;
        for (int i = 0; i < vagons.size(); i++) {
            tempVagon = iterator.next();
            tempString += ((i + 1) + ") " + tempVagon.getComfortClass() +
                    " ; " + tempVagon.getNumOfPassengers() +
                    " ; " + tempVagon.getNumOfBags() + " \n ");
        }
        return tempString;
    }

    /**
     * Removes all Vagons from current train, initiates numbers of
     * vagons, all passengers and bags of current train with 0.
     * It helps simply "clean up" current train structure and condition
     * using on function call.
     * */
    public void clear() {
        vagons.clear();
        this.setNumOfVagons(0);
        numOfPassengers = 0;
        numOfBags = 0;
    }

    /**
     * Rewritten method of parent class (Train class).
     * Returns not value of private variable of current
     * instance of this class (like in parent class) but
     * size (number of elements) of vagons variable
     * (which type is LinkedList<Vagon>).
     * Such realisation of getNumOfVagons() is more accurate
     * and faster executed than parent's one.*/
    @Override
    public long getNumOfVagons() {
        return vagons.size();
    }
}
