package lab2;

import com.lab111.labwork2.C1;
import com.lab111.labwork2.C2;
import com.lab111.labwork2.C3;
import com.lab111.labwork2.I2;

public class Test {

    public static void main(String[] args) {
        C1 c1 = new C1();
        C2 c2 = new C2();
        C3 c3 = new C3();

        c1.meth1();
        c1.meth3();
        c1.meth2();

        c1.i1 = new C1();
        c1.i2 = new C2();
        c1.c3 = new C3();

        c2.meth2();

        c3.meth2();
        c3.meth3();


        I2 i2 = c1;
    }

}
