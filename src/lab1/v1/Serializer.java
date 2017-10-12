package lab1.v1;

import lab1.v1.model.lab5.Train;
import lab1.v1.model.lab6.MyCollection;
import lab1.v1.validator.SerializeValidator;
import lab1.v1.utils.SerializeUtils;

/**
 * Created by Alexey_O on 13.09.2017.
 */
public class Serializer {
    /**
     * This class is a container for public serialization
     * methods.
     *
     * It gives opportunity to:
     *  - serialize and deserialize MyCollection class instance
     *  as single object into/from binary file;
     *  - serialize and deserialize MyCollection class instances
     *  as a group of Train class objects into/from binary file;
     *  - serialize and deserialize MyCollection class instances
     *  as a group of Train class objects into/from text file;
     *
     * Includes:
     *  - method serializeAsCollection(MyCollection, String),
     *  which serializes MyCollection class instance as a single
     *  object into binary file with name <fileName>;
     *
     *  - method serializeAsObjectsGroup(MyCollection, String),
     *  which serializes MyCollection class instance as a group of
     *  Train class objects into binary file with name <fileName>;
     *
     *  - method serializeAsText(MyCollection, String),
     *  which serializes MyCollection class instance as a group of
     *  Train class objects into text file with name <fileName>;
     *
     *  - method deserializeAsCollection(String), which deserializes
     *  MyCollection class instance from binary file
     *  with name <fileName>  as a single object;
     *
     *  - method deserializeAsObjectsGroup(String), which deserializes
     *  MyCollection class instance from binary file
     *  with name <fileName> as a group of Train class objects;
     *
     *  - method deserializeAsText(String), which deserializes
     *  MyCollection class instance from text file
     *  with name <fileName> as a group of Train class objects;
     * */

    // Public methods:
    public static boolean serializeAsCollection(MyCollection collection, String fileName) {
        if (!SerializeValidator.isValid(collection) || !SerializeValidator.isValid(fileName)) {
            return false;
        }

        return SerializeUtils.writeCollectionToBinFile(collection, fileName);
    }

    public static boolean serializeAsObjectsGroup(MyCollection collection, String fileName) {
        if (!SerializeValidator.isValid(collection) || !SerializeValidator.isValid(fileName)) {
            return false;
        }

        return SerializeUtils.writeObjectsToBinFile((Train[]) collection.toArray(), fileName);
    }

    public static boolean serializeAsText(MyCollection collection, String fileName) {
        if (!SerializeValidator.isValid(collection) || !SerializeValidator.isValid(fileName)) {
            return false;
        }

        return SerializeUtils.writeObjectsToTextFile((Train[]) collection.toArray(), fileName);
    }

    public static MyCollection deserializeAsCollection(String fileName) {
        if (!SerializeValidator.isValid(fileName)) {
            return null;
        }

        return SerializeUtils.readCollectionFromBinFile(fileName);
    }

    public static MyCollection deserializeAsObjectsGroup(String fileName) {
        if (!SerializeValidator.isValid(fileName)) {
            return null;
        }

        return SerializeUtils.readObjectsFromBinFile(fileName);
    }

    public static MyCollection deserializeAsText(String fileName) {
        if (!SerializeValidator.isValid(fileName)) {
            return null;
        }

        return SerializeUtils.readObjectsFromTextFile(fileName);
    }

}
