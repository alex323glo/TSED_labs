package lab1.v1.validator;

/**
 * Created by Alexey_O on 13.09.2017.
 */
public class SerializeValidator {
    /**
     * This class is a container for pre-serialization-validation methods.
     *
     * Includes:
     *  - method isValid(Object), which validates object before
     *  passing it as an argument to serialization method.
     * */

    public static boolean isValid(Object object) {
        return object != null;
    }

}
