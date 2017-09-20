package lab1.test;

import lab1.Serializer;
import lab1.model.lab5.Train;
import lab1.model.lab6.MyCollection;

public class SimpleSerializationTest {

    private static final String TEST_FILE_NAME_1 = "test1.txt";

    private static final String TEST_FILE_NAME_2 = "test2.txt";

    private static final String TEST_FILE_NAME_3 = "test3.txt";

    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        collection.add(new Train(12));
        collection.add(new Train(28));

        System.out.println(collection);
        Serializer.serializeAsCollection(collection, TEST_FILE_NAME_1);

        MyCollection newCollection = Serializer.deserializeAsCollection(TEST_FILE_NAME_1);
        System.out.println(collection);

        System.out.println(collection);
        Serializer.serializeAsObjectsGroup(collection, TEST_FILE_NAME_2);

        newCollection = Serializer.deserializeAsObjectsGroup(TEST_FILE_NAME_2);
        System.out.println(newCollection);

        System.out.println(collection);
        Serializer.serializeAsText(collection, TEST_FILE_NAME_3);

        newCollection = Serializer.deserializeAsText(TEST_FILE_NAME_3);
        System.out.println(newCollection);
    }

}
