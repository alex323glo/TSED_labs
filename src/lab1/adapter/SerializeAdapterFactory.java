package lab1.adapter;

import lab1.model.lab5.Train;
import lab1.model.lab6.MyCollection;

/**
 * Created by Alexey_O on 13.09.2017.
 */
public class SerializeAdapterFactory {
    /**
     * This class is a container for factory methods,
     * which helps to create instances of Train, MyCollection classes and
     * Train[] array.
     *
     * Includes:
     *  - method create(Train), which returns an instance of
     *  TrainSerializeAdapter class;
     *
     *  - method create(Object[]), which returns an array of
     *  instances of TrainSerializeAdapter class;
     *
     *  - method create(MyCollection), which returns an instance of
     *  MyCollectionSerializeAdapter class.
     * */

    public static TrainSerializeAdapter create(Train train) {
        return new TrainSerializeAdapter(train);
    }

    public static TrainSerializeAdapter[] create(Object[] trains) {
        if (trains == null || trains.getClass() != Train[].class) {
            return null;
        }

        TrainSerializeAdapter[] adapters = new TrainSerializeAdapter[trains.length];
        for (int i = 0; i < trains.length; i++) {
            adapters[i] = new TrainSerializeAdapter((Train) trains[i]);
        }

        return adapters;
    }


    public static MyCollectionSerializeAdapter create(MyCollection collection) {
        return new MyCollectionSerializeAdapter(collection);
    }
}
