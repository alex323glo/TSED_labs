package lab1;

import lab1.v1.Serializer;
import lab1.v1.model.lab5.Train;
import lab1.v1.model.lab6.MyCollection;
import org.junit.*;

public class TestSerialization extends Assert {

    private static MyCollection collection;
    private static Object[] testTrainArray;
    private boolean flag;
    private static final int TEST_COLLECTION_SIZE = 10;
    private static final int[] TEST_VAGONS_NUM_ARRAY = {3, 4, 5};
    private static final String TEST_FILE_NAME_1 = "sandbox/lab1/v1/test1.txt";
    private static final String TEST_FILE_NAME_2 = "sandbox/lab1/v1/test2.txt";
    private static final String TEST_FILE_NAME_3 = "sandbox/lab1/v1/test3.txt";
    private static final String TEST_FILE_NAME_4 = "sandbox/lab1/v1/test4.txt";

    @BeforeClass
    public static void prepareTestClass() {
        collection = new MyCollection();
        testTrainArray = new Train[TEST_VAGONS_NUM_ARRAY.length];
        for (int i = 0; i < TEST_VAGONS_NUM_ARRAY.length; i++) {
            testTrainArray[i] = new Train(TEST_VAGONS_NUM_ARRAY[i]);
        }
    }

    @Before
    public void resetTest() {
        for (int i = 0 ; i < TEST_COLLECTION_SIZE; i++) {
            collection.add(new Train(i + 1));
        }
        flag = true;
    }

    @Test
    public void testSerializationAsCollection() {
        try {

            assertEquals(Serializer.serializeAsCollection(collection, TEST_FILE_NAME_1), true);
            assertArrayEquals(Serializer.deserializeAsCollection(TEST_FILE_NAME_1).toArray(), collection.toArray());

        } catch (Exception e) {
            flag = false;
        } finally {
            assertEquals(flag, true);
        }
    }

    @Test
    public void testSerializationAsObjectsGroup() {
        try {

            assertEquals(Serializer.serializeAsObjectsGroup(collection, TEST_FILE_NAME_2), true);
            assertArrayEquals(Serializer.deserializeAsObjectsGroup(TEST_FILE_NAME_2).toArray(), collection.toArray());

        } catch (Exception e) {
            flag = false;
        } finally {
            assertEquals(flag, true);
        }
    }

    @Test
    public void testSerializationAsText() {
        try {

            assertEquals(Serializer.serializeAsText(collection, TEST_FILE_NAME_3), true);
            assertArrayEquals(Serializer.deserializeAsText(TEST_FILE_NAME_3).toArray(), collection.toArray());

        } catch (Exception e) {
            flag = false;
        } finally {
            assertEquals(flag, true);
        }
    }

    @Test
    public void testDeserializeAsText() {
        try {

            assertArrayEquals(Serializer.deserializeAsText(TEST_FILE_NAME_4).toArray(), testTrainArray);

        } catch (Exception e) {
            flag = false;
        } finally {
            assertEquals(flag, true);
        }
    }

    @After
    public void cleanAfterTest() {
        collection.clear();
    }
}
