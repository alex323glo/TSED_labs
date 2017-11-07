package lab8;

import com.lab111.labwork8.*;

/**
 * Created by alex323glo on 07.11.17.
 */
public class Test {

    public static void main(String[] args) {

        // Simply cloneable structure:
        Composite composite1 = new SimplyCloneableComposite();
        composite1.addElement(new SimplyCloneableLeaf("leaf1"));
        composite1.addElement(new SimplyCloneableLeaf("leaf2"));
        Composite composite2 = new SimplyCloneableComposite();
        composite2.addElement(composite1);
        composite2.addElement(new SimplyCloneableLeaf("leaf3"));

        System.out.println("composite2:\n" + composite2.show());
        System.out.println("composite2 (clone):\n" + ((Composite) composite2.clone()).show());


        // Deeply cloneable structure:
        Composite composite3 = new DeeplyClonableComposite();
        composite3.addElement(new DeeplyCloneableLeaf("leaf4"));
        composite3.addElement(new DeeplyCloneableLeaf("leaf5"));
        Composite composite4 = new DeeplyClonableComposite();
        composite4.addElement(composite3);
        composite4.addElement(new DeeplyCloneableLeaf("leaf6"));

        System.out.println("composite4:\n" + composite4.show());
        System.out.println("composite4 (cloned):\n" + ((Composite) composite4.clone()).show());


        // Deeply and Simply cloneable structure:
        Composite composite5 = new SimplyCloneableComposite();
        composite5.addElement(new DeeplyCloneableLeaf("leaf7"));
        composite5.addElement(new SimplyCloneableLeaf("leaf8"));
        Composite composite6 = new DeeplyClonableComposite();
        composite6.addElement(composite5);
        composite6.addElement(new DeeplyCloneableLeaf("leaf9"));

        System.out.println("composite6:\n" + composite6.show());
        System.out.println("composite6 (cloned):\n" + ((Composite) composite6.clone()).show());
    }

}
