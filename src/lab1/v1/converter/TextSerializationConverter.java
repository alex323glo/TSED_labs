package lab1.v1.converter;

public interface TextSerializationConverter {

    String convertToString(Object object);

    Object convertFromString(String text);

}
