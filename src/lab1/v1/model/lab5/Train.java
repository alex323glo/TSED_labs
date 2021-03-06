/**
 * Class: Train
 *
 * Version: 1.1
 *
 * Copyrights: none.
 * */

package lab1.v1.model.lab5;

import com.sun.istack.internal.NotNull;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by Alexey_O on 23.05.2017.
 */
public class Train implements Comparable<Train>, Serializable {
    /**
    * This class is parent fo such classes as:
    *   - CargoTrain class;
    *   - TechnicalTrain class;
    *   - PassengerTrain class.
    * Includes structure and functionality of
    * simple train.
    * */

    protected long numOfVagons;

    public Train() {

    }

    public Train(Train train) {
        if (train == null) {
            return;
        }
        numOfVagons = train.getNumOfVagons();
    }

    public Train(int numOfVagons) {
        if (!this.setNumOfVagons(numOfVagons)) {
            System.out.println("Train.Train(int): wrong num of vagons!");
        }
    }

    /**
     * Sets whole number of passengers of current train.
     * Takes long positive value as parameter.
     * Returns false if parameter is not greater or
     * equal to 0 and/or operation is not successful.
     * */
    public boolean setNumOfVagons(long numOfVagons) {
        if (numOfVagons < 0) {
            System.out.println("Train.setNumOfVagons(): wrong num of vagons!");
            return false;
        }
        this.numOfVagons = numOfVagons;
        return true;
    }

    /**
     * Gets whole number of passengers of current Train.
     * Returns long greater or equal to 0 value.
     * */
    public long getNumOfVagons() {
        return numOfVagons;
    }

    /**
     * Prints train's signal to console.
     * Takes number of iterations of making
     * "toot" sound as parameters.
     * */
    public String toot(long numOfTimes) {
        if (numOfTimes < 1) {
            System.out.println("Train.toot(): Wrong num of times to toot!");
            return "";
        }
        String tempString = "Too";
        for (int i = 1; i < numOfTimes; i++) {
            tempString += "-too";
        }
        tempString += "t !!!";
        System.out.println(tempString);
        return tempString;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * <p>
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     * <p>
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     * <p>
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     * <p>
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     * <p>
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(@NotNull Train o) {
        return (int) (this.getNumOfVagons() - o.getNumOfVagons());
    }

    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     * an execution of a Java application, the {@code hashCode} method
     * must consistently return the same integer, provided no information
     * used in {@code equals} comparisons on the object is modified.
     * This integer need not remain consistent from one execution of an
     * application to another execution of the same application.
     * <li>If two objects are equal according to the {@code equals(Object)}
     * method, then calling the {@code hashCode} method on each of
     * the two objects must produce the same integer result.
     * <li>It is <em>not</em> required that if two objects are unequal
     * according to the {@link Object#equals(Object)}
     * method, then calling the {@code hashCode} method on each of the
     * two objects must produce distinct integer results.  However, the
     * programmer should be aware that producing distinct integer results
     * for unequal objects may improve the performance of hash tables.
     * </ul>
     * <p>
     * As much as is reasonably practical, the hashCode method defined by
     * class {@code Object} does return distinct integers for distinct
     * objects. (This is typically implemented by converting the internal
     * address of the object into an integer, but this implementation
     * technique is not required by the
     * Java&trade; programming language.)
     *
     * @return a hash code value for this object.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        return (int) (getNumOfVagons() ^ (getNumOfVagons() >>> 32));
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * The {@code equals} method implements an equivalence relation
     * on non-null object references:
     * <ul>
     * <li>It is <i>reflexive</i>: for any non-null reference value
     * {@code x}, {@code x.equals(x)} should return
     * {@code true}.
     * <li>It is <i>symmetric</i>: for any non-null reference values
     * {@code x} and {@code y}, {@code x.equals(y)}
     * should return {@code true} if and only if
     * {@code y.equals(x)} returns {@code true}.
     * <li>It is <i>transitive</i>: for any non-null reference values
     * {@code x}, {@code y}, and {@code z}, if
     * {@code x.equals(y)} returns {@code true} and
     * {@code y.equals(z)} returns {@code true}, then
     * {@code x.equals(z)} should return {@code true}.
     * <li>It is <i>consistent</i>: for any non-null reference values
     * {@code x} and {@code y}, multiple invocations of
     * {@code x.equals(y)} consistently return {@code true}
     * or consistently return {@code false}, provided no
     * information used in {@code equals} comparisons on the
     * objects is modified.
     * <li>For any non-null reference value {@code x},
     * {@code x.equals(null)} should return {@code false}.
     * </ul>
     * <p>
     * The {@code equals} method for class {@code Object} implements
     * the most discriminating possible equivalence relation on objects;
     * that is, for any non-null reference values {@code x} and
     * {@code y}, this method returns {@code true} if and only
     * if {@code x} and {@code y} refer to the same object
     * ({@code x == y} has the value {@code true}).
     * <p>
     * Note that it is generally necessary to override the {@code hashCode}
     * method whenever this method is overridden, so as to maintain the
     * general contract for the {@code hashCode} method, which states
     * that equal objects must have equal hash codes.
     *
     * @param o the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     * @see #hashCode()
     * @see HashMap
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        return getNumOfVagons() == train.getNumOfVagons();
    }


    @Override
    public String toString() {
        return "Train{" +
                "numOfVagons=" + numOfVagons +
                '}';
    }
}