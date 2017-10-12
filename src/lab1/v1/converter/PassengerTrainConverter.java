package lab1.v1.converter;

import lab1.v1.model.lab5.PassengerTrain;
import lab1.v1.model.lab5.Vagon;

public class PassengerTrainConverter implements TextSerializationConverter {

    @Override
    public String convertToString(Object object) {

        PassengerTrain train = (PassengerTrain) object;

        return String.format("");
    }

    @Override
    public Object convertFromString(String text) {
        return null;
    }

    private String convertVagonArrayToString(Vagon[] vagons) {
        String str = "{";
        return null;
    }

}
