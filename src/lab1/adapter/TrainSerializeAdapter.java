package lab1.adapter;

import lab1.model.lab5.Train;

import java.io.Serializable;

/**
 * Created by Alexey_O on 13.09.2017.
 */
public class TrainSerializeAdapter implements Serializable {
    /**
     * This class is a wrapper for Train class.
     * Created with the aim to implement Serializable interface
     * and make possible to serialize/deserialize Train class
     * instance into/from binary and text file.
     *
     * Includes:
     *  - a reference to Train class instance;
     *
     *  - override method toString() (makes possible serialization
     *  into text file);
     * */

    // Fields and properties;
    private Train train;

    // Constructors:
    public TrainSerializeAdapter() {
        train = new Train();
    }

    public TrainSerializeAdapter(Train train) {
        this.train = train;
    }

    // Getters and setters:
    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    // Override methods:
    @Override
    public String toString() {
        return String.format("{className=%s; numOfVagons=%d}", Train.class.getName(), train.getNumOfVagons());
    }
}
