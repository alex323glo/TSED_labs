package lab1.v1.utils;

import lab1.v1.model.lab5.Train;
import lab1.v1.model.lab6.MyCollection;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alexey_O on 13.09.2017.
 */
public class SerializeUtils {

    // TODO: comment!

    // TODO: writeCollectionToBinFile(MyCollectionSerializeAdapter adapter, String fileName);
    // TODO: writeObjectsToBinFile(TrainSerializeAdapter[] adapters, String fileName);
    // TODO: writeObjectsToTextFile(TrainSerializeAdapter[] adapters, String fileName);

    // TODO: readCollectionFromBinFile(String fileName);
    // TODO: readObjectsFromBinFile(String fileName);
    // TODO: readObjectsFromTextFile(String fileName);

    public static boolean writeCollectionToBinFile(MyCollection collection, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(collection);

            objectOutputStream.close();
            return true;
        } catch (FileNotFoundException fnfExc) {
            System.out.println("FileNotFoundException (can't create FileOutputStream)!");
        } catch (IOException ioExc) {
            System.out.println("IOException (can't create or use ObjectOutputStream)!");
        } catch (NullPointerException npExc) {
            System.out.println("NullPointerException (problems with collection or fileName objects)!");
        }
        return false;
    }

    public static boolean writeObjectsToBinFile(Train[] trains, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Train train: trains) {
                objectOutputStream.writeObject(train);
            }

            objectOutputStream.close();
            return true;
        } catch (FileNotFoundException fnfExc) {
            System.out.println("FileNotFoundException (can't create FileOutputStream)!");
        } catch (IOException ioExc) {
            System.out.println("IOException (can't create or use ObjectOutputStream)!");
        } catch (NullPointerException npExc) {
            System.out.println("NullPointerException (problems with collection or fileName objects)!");
        }
        return false;
    }

    public static boolean writeObjectsToTextFile(Train[] trains, String fileName) {
        try {
            File file = prepareFile(fileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String[] convertedObjects = textTrainsSerializer(trains);

            for (int i = 0; i < convertedObjects.length; i++) {
                bufferedWriter.write(convertedObjects[i]);
                if (i != convertedObjects.length - 1) {
                    bufferedWriter.newLine();
                }
            }

            bufferedWriter.flush();
            bufferedWriter.close();
            return true;
        } catch (IOException ioExc) {
            System.out.println("IOException (can't create File, create or use FileWriter or BufferWriter)!");
        } catch (NullPointerException npExc) {
            System.out.println("NullPointerException (can't parse Train array to String array or wrong fileName)!");
        }

        return false;
    }




    public static MyCollection readCollectionFromBinFile(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            MyCollection collection = (MyCollection) objectInputStream.readObject();
            return collection;
        } catch (FileNotFoundException fnfExc) {
            System.out.println("FileNotFoundException (can't create FileInputStream)!");
        } catch (IOException ioExc) {
            System.out.println("IOException (can't create or use ObjectInputStream)!");
        } catch (ClassNotFoundException cnfExc) {
            System.out.println("ClassNotFoundException (problems with readObject() function)!");
        }
        return null;
    }

    public static MyCollection readObjectsFromBinFile(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            MyCollection collection = new MyCollection();

            while (true) {
                try {
                    collection.add((Train) objectInputStream.readObject());
                } catch (EOFException eofExc) {
                    return collection;
                }
            }

        } catch (FileNotFoundException fnfExc) {
            System.out.println("FileNotFoundException (can't create FileInputStream)!");
        } catch (IOException ioExc) {
            System.out.println("IOException (can't create or use ObjectInputStream)!");
        } catch (ClassNotFoundException cnfExc) {
            System.out.println("ClassNotFoundException (problems with readObject() function)!");
        }
        return null;
    }

    public static MyCollection readObjectsFromTextFile(String fileName) {
        try {
            File file = prepareFile(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<String> text = new LinkedList<>();

            while (bufferedReader.ready()) {
                text.add(bufferedReader.readLine());
            }

            Train[] trains = textTrainsDeserializer(text.toArray(new String[text.size()]));

            return new MyCollection(trains);

        } catch (IOException ioExc) {
            System.out.println("IOException (can't create File, create or use FileReader or BufferReader)!");
        } catch (NullPointerException npExc) {
            System.out.println("NullPointerException (can't parse String array to Train array or wrong fileName)!");
        } catch (NumberFormatException nfExc) {
            System.out.println("NumberFormatException (can't parse String to Integer in textTrainsDeserializer() )!");
        }

        return null;
    }


    private static String[] textTrainsSerializer(Train[] trains) throws NullPointerException {
        if (trains == null) {
            throw new NullPointerException();
        }

        if (trains.length < 1) {
            return null;
        }

        String[] trainStrings = new String[trains.length];
        for (int i = 0; i < trains.length; i++) {
            trainStrings[i] = String.format("{vagNum=%d}", trains[i].getNumOfVagons());
        }

        return trainStrings;
    }

    private static Train[] textTrainsDeserializer(String[] trainStrings) throws NullPointerException, NumberFormatException {
        if (trainStrings == null) {
            throw new NullPointerException();
        }

        if (trainStrings.length < 1) {
            return null;
        }

        Train[] trains = new Train[trainStrings.length];
        for (int i = 0; i < trainStrings.length; i++) {
            if (trainStrings[i].length() > 0) {
                trains[i] = new Train(Integer.valueOf(trainStrings[i]
                        .replaceAll("\\{vagNum=", "")
                        .replaceAll("\\}", "")));
            }
        }

        return trains;
    }

    private static File prepareFile(String fileName) throws NullPointerException, IOException {
        if (fileName == null) {
            throw new NullPointerException();
        }

        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException ioe) {
            System.out.println("IOException (creating new file)!");
            throw new IOException();
        }

        return file;
    }
}
