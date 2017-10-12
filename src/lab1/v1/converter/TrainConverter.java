package lab1.v1.converter;

import lab1.v1.model.lab5.Train;

public class TrainConverter implements TextSerializationConverter {

    @Override
    public String convertToString(Object object) {

        Train train = (Train) object;

        return String.format("{class=%s,vagNum=%d}", Train.class.getSimpleName(), train.getNumOfVagons());
    }

    @Override
    public Object convertFromString(String text) {
        String[] strings = text.split(",");
        if (!strings[0].substring(7).equals(Train.class.getSimpleName())) {
            return null;
        }
        int numOfVagons = Integer.valueOf(strings[1].substring(6, strings[1].length() - 1));
        return new Train(numOfVagons);
    }

}
