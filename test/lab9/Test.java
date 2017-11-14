package lab9;

import com.lab111.labwork9.*;

/**
 * Created by alex323glo on 09.11.17.
 */
public class Test {

    public static void main(String[] args) {

        WebService webService1 = new DBWebService();
        Reader reader1 = webService1.createReader();
        Writer writer1 = webService1.createWriter();
        reader1.read();
        writer1.write();

        WebService webService2 = new FileWebService();
        Reader reader2 = webService2.createReader();
        Writer writer2 = webService2.createWriter();
        reader2.read();
        writer2.write();

    }

}
