package lab1.adapter;

import lab1.model.lab6.MyCollection;

import java.io.Serializable;

/**
 * Created by Alexey_O on 13.09.2017.
 */
public class MyCollectionSerializeAdapter implements Serializable {
    /**
     * This class is a wrapper for MyCollection class.
     * Created with the aim to implement Serializable interface
     * and make possible to serialize/deserialize MyCollection class
     * instance into/from binary file.
     *
     * Includes:
     *  - a reference to MyCollection class instance.
     *
     * */

    // Fields and properties:
    private MyCollection myCollection;

    // Constructors
    public MyCollectionSerializeAdapter() {
        myCollection = new MyCollection();
    }

    public MyCollectionSerializeAdapter(MyCollection myCollection) {
        this.myCollection = myCollection;
    }

    // Getters and setters:
    public MyCollection getMyCollection() {
        return myCollection;
    }

    public void setMyCollection(MyCollection myCollection) {
        this.myCollection = myCollection;
    }

}
