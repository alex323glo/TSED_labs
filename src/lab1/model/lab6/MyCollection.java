/**
* Class: Main
*
* Version: 1.1
*
* Copyrights: none.
* */

package lab1.model.lab6;

import lab1.model.lab5.Train;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Alexey_O on 03.06.2017.
 */
public class MyCollection implements Set<Train>, Serializable {
    /**
     * This class contains structure and methods
     * to organize collection (type of collection: Set-List;
     * it implements Set interface and has inner structure of List)
     * and main operation on it and its elements.
     * */

    private int size = 0;
    private Node head;
    private Node tail;

    public MyCollection() {
    }

    public MyCollection(Train[] trains) {
        if (trains == null || trains.length < 1) {
            return;
        }

        for (Train train: trains) {
            this.add(train);
        }
    }

    /**
     * Returns the number of elements in this collection (its cardinality).
     *
     * @return the number of elements in this set (its cardinality)
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns <tt>true</tt> if this set contains no elements.
     *
     * @return <tt>true</tt> if this set contains no elements
     */
    @Override
    public boolean isEmpty() {
        return size < 1;
    }

    /**
     * Returns <tt>true</tt> if this set contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this set
     * contains an element <tt>e</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     *
     * @param o element whose presence in this set is to be tested
     * @return <tt>true</tt> if this set contains the specified element
     * @throws ClassCastException   if the type of the specified element
     *                              is incompatible with this set
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *                              set does not permit null elements
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     */
    @Override
    public boolean contains(Object o) {
        if (this.size() < 1) {
            return false;
        }

        if (o == null) {
            throw new NullPointerException();
        }

        if (!Train.class.equals(o.getClass())) {
            throw new ClassCastException();
        }

        Train searchedTrain = (Train) o;
        Node tempNode = new Node(null, null, head);
        while (tempNode.next() != null) {
            tempNode = tempNode.next;
            if (searchedTrain.equals(tempNode.value())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns an iterator over the elements in this set.  The elements are
     * returned in no particular order (unless this set is an instance of some
     * class that provides a guarantee).
     *
     * @return an iterator over the elements in this set
     */
    @NotNull
    @Override
    public Iterator<Train> iterator() {
        return new Iterator<Train>() {
            Node current = new Node(null, null, head);
            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public Train next() {
                if (this.hasNext()) {
                    current = current.next();
                    return current.value();
                }
                return null;
            }
        };
    }

    /**
     * Returns an array containing all of the elements in this set.
     * If this set makes any guarantees as to what order its elements
     * are returned by its iterator, this method must return the
     * elements in the same order.
     * <p>
     * <p>The returned array will be "safe" in that no references to it
     * are maintained by this set.  (In other words, this method must
     * allocate a new array even if this set is backed by an array).
     * The caller is thus free to modify the returned array.
     * <p>
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all the elements in this set
     */
    @NotNull
    @Override
    public Object[] toArray() {
        if (size() < 1) {
            return new Train[0];
        }
        Train[] trainArray = new Train[size()];
        Node tempNode = head;
        for (int i = 0; i < size(); i++) {
            trainArray[i] = new Train(tempNode.value());
            tempNode = tempNode.next();
        }
        return trainArray;
    }

    /**
     * Returns an array containing all of the elements in this set; the
     * runtime type of the returned array is that of the specified array.
     * If the set fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this set.
     * <p>
     * <p>If this set fits in the specified array with room to spare
     * (i.e., the array has more elements than this set), the element in
     * the array immediately following the end of the set is set to
     * <tt>null</tt>.  (This is useful in determining the length of this
     * set <i>only</i> if the caller knows that this set does not contain
     * any null elements.)
     * <p>
     * <p>If this set makes any guarantees as to what order its elements
     * are returned by its iterator, this method must return the elements
     * in the same order.
     * <p>
     * <p>Like the {@link #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     * <p>
     * <p>Suppose <tt>x</tt> is a set known to contain only strings.
     * The following code can be used to dump the set into a newly allocated
     * array of <tt>String</tt>:
     * <p>
     * <pre>
     *     String[] y = x.toArray(new String[0]);</pre>
     * <p>
     * Note that <tt>toArray(new Object[0])</tt> is identical in function to
     * <tt>toArray()</tt>.
     *
     * @param a the array into which the elements of this set are to be
     *          stored, if it is big enough; otherwise, a new array of the same
     *          runtime type is allocated for this purpose.
     * @return an array containing all the elements in this set
     * @throws ArrayStoreException  if the runtime type of the specified array
     *                              is not a supertype of the runtime type of every element in this
     *                              set
     * @throws NullPointerException if the specified array is null
     */
    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        return null;
    }

    /**
     * Adds the specified element to this set if it is not already present
     * (optional operation).  More formally, adds the specified element
     * <tt>e</tt> to this set if the set contains no element <tt>e2</tt>
     * such that
     * <tt>(e==null&nbsp;?&nbsp;e2==null&nbsp;:&nbsp;e.equals(e2))</tt>.
     * If this set already contains the element, the call leaves the set
     * unchanged and returns <tt>false</tt>.  In combination with the
     * restriction on constructors, this ensures that sets never contain
     * duplicate elements.
     * <p>
     * <p>The stipulation above does not imply that sets must accept all
     * elements; sets may refuse to add any particular element, including
     * <tt>null</tt>, and throw an exception, as described in the
     * specification for {@link Collection#add Collection.add}.
     * Individual set implementations should clearly document any
     * restrictions on the elements that they may contain.
     *
     * @param train element to be added to this set
     * @return <tt>true</tt> if this set did not already contain the specified
     * element
     * @throws NullPointerException          if the specified element is null and this
     *                                       set does not permit null elements
     */
    @Override
    public boolean add(Train train) {
        if (train == null) {
            throw new NullPointerException();
        }
        if (size() > Integer.MAX_VALUE - 1) {
            return false;
        }
        if (head == null) {
            head = new Node(train, null, null);
            tail = head;
        } else {
            tail.next = new Node(train, tail, null);
            tail = tail.next;
        }
        size++;
        return true;
    }

    /**
     * Removes the specified element from this set if it is present
     * (optional operation).  More formally, removes an element <tt>e</tt>
     * such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>, if
     * this set contains such an element.  Returns <tt>true</tt> if this set
     * contained the element (or equivalently, if this set changed as a
     * result of the call).  (This set will not contain the element once the
     * call returns.)
     *
     * @param o object to be removed from this set, if present
     * @return <tt>true</tt> if this set contained the specified element
     * @throws ClassCastException            if the type of the specified element
     *                                       is incompatible with this set
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException          if the specified element is null and this
     *                                       set does not permit null elements
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws UnsupportedOperationException if the <tt>remove</tt> operation
     *                                       is not supported by this set
     */
    @Override
    public boolean remove(Object o) {
        if (!Train.class.equals(o.getClass())) {
            throw new ClassCastException();
        }

        if (o == null) {
            throw new  NullPointerException();
        }

        if (size() < 1) {
            return false;
        }

        Train searchedTrain = (Train) o;
        Node tempNode = head;
        while (tempNode != null) {
            if (searchedTrain.equals(tempNode.value())) {
                if (size() < 2) {
                    this.clear();
                }
                if (tempNode.prev() != null) {
                    tempNode.prev().next = tempNode.next();
                }
                if (tempNode.next() != null) {
                    tempNode.next().prev = tempNode.prev();
                }
                return true;
            }
            tempNode = tempNode.next();
        }
        return false;
    }

    /**
     * Returns <tt>true</tt> if this set contains all of the elements of the
     * specified collection.  If the specified collection is also a set, this
     * method returns <tt>true</tt> if it is a <i>subset</i> of this set.
     *
     * @param c collection to be checked for containment in this set
     * @return <tt>true</tt> if this set contains all of the elements of the
     * specified collection
     * @throws ClassCastException   if the types of one or more elements
     *                              in the specified collection are incompatible with this
     *                              set
     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified collection contains one
     *                              or more null elements and this set does not permit null
     *                              elements
     *                              (<a href="Collection.html#optional-restrictions">optional</a>),
     *                              or if the specified collection is null
     * @see #contains(Object)
     */
    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        //TODO: containsAll(Collection) [complete] [test]
        return false;
    }

    /**
     * Adds all of the elements in the specified collection to this set if
     * they're not already present (optional operation).  If the specified
     * collection is also a set, the <tt>addAll</tt> operation effectively
     * modifies this set so that its value is the <i>union</i> of the two
     * sets.  The behavior of this operation is undefined if the specified
     * collection is modified while the operation is in progress.
     *
     * @param c collection containing elements to be added to this set
     * @return <tt>true</tt> if this set changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
     *                                       is not supported by this set
     * @throws ClassCastException            if the class of an element of the
     *                                       specified collection prevents it from being added to this set
     * @throws NullPointerException          if the specified collection contains one
     *                                       or more null elements and this set does not permit null
     *                                       elements, or if the specified collection is null
     * @throws IllegalArgumentException      if some property of an element of the
     *                                       specified collection prevents it from being added to this set
     * @see #add(Object)
     */
    @Override
    public boolean addAll(@NotNull Collection<? extends Train> c) {
        //TODO: addAll(Collection) [complete] [test]
        return false;
    }

    /**
     * Retains only the elements in this set that are contained in the
     * specified collection (optional operation).  In other words, removes
     * from this set all of its elements that are not contained in the
     * specified collection.  If the specified collection is also a set, this
     * operation effectively modifies this set so that its value is the
     * <i>intersection</i> of the two sets.
     *
     * @param c collection containing elements to be retained in this set
     * @return <tt>true</tt> if this set changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>retainAll</tt> operation
     *                                       is not supported by this set
     * @throws ClassCastException            if the class of an element of this set
     *                                       is incompatible with the specified collection
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException          if this set contains a null element and the
     *                                       specified collection does not permit null elements
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
     *                                       or if the specified collection is null
     * @see #remove(Object)
     */
    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        //TODO: retainAll(Collection) [complete] [test]
        return false;
    }

    /**
     * Removes from this set all of its elements that are contained in the
     * specified collection (optional operation).  If the specified
     * collection is also a set, this operation effectively modifies this
     * set so that its value is the <i>asymmetric set difference</i> of
     * the two sets.
     *
     * @param c collection containing elements to be removed from this set
     * @return <tt>true</tt> if this set changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>removeAll</tt> operation
     *                                       is not supported by this set
     * @throws ClassCastException            if the class of an element of this set
     *                                       is incompatible with the specified collection
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException          if this set contains a null element and the
     *                                       specified collection does not permit null elements
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
     *                                       or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        //TODO: removeAll(Collection) [complete] [test]
        return false;
    }

    /**
     * Removes all of the elements from this collection.
     * The collection will be empty after this call returns.
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }



    @Override
    public String toString() {
        Train[] trains = (Train[]) this.toArray();
        if (trains != null && trains.length > 0) {
            return Arrays.toString(trains);
        }
        return null;
    }



    /**
     * Returns element of collection by int index.
     *
     * @param index number of element in collection, which is greater
     *              or equal to 0 and is not greater than (this.size() - 1)
     * @return ref to instance of class Train (or null, if there is no such element in collection).
     *         This instance is stored in collection on [index] position from head.
     * @throws IndexOutOfBoundsException     if index is smaller than 0 or greater than (this.size - 1).
     * @see Node
     */
    public Train get(int index){
        if (this.isEmpty()) {
            return null;
        }
        if (index < 0 || index > this.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        Node tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next();
        }
        return tempNode.value();
    }

    /**
     * Returns element of collection by instance of Train class.
     *
     * @param instance is an instance of class Train, which must be equal to
     *                 searched instance stored in collection.
     * @return ref to instance of class Train (or null, if there is no such element in collection).
     *         This instance is stored in collection on [index] position from head.
     * @throws NullPointerException          if this set contains a null element and the
     *                                       specified collection does not permit null elements
     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
     *                                       or if the specified collection is null
     * @see Node
     */
    public Train get(Train instance) {
        if (instance == null) {
            throw new NullPointerException();
        }
        if (size() < 1) {
            return null;
        }
        Node tempNode = head;
        while (tempNode != null) {
            if (instance.equals(tempNode.value())) {
                return tempNode.value();
            }
            tempNode = tempNode.next();
        }
        return null;
    }


    /**
    * Class: Node
    *
    * Version: 1.0
    *
    * Copyrights: none.
    * */
    class Node implements Serializable {
        /**
         * Class of list node.
         * Organises whole list structure
         *
         * Has links on next and previous elements in List
         * and value (object of class Train).
         */

        Node prev;
        Node next;
        Train value;

        public Node() {

        }

        public Node(Train value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        /**
         * Returns ref on the previous element in collection.
         * */
        public Node prev() {
            return prev;
        }

        /**
         * Returns ref on the next element in collection.
         * */
        public Node next() {
            return next;
        }

        /**
         * Returns ref on value of Node (an instance of class Train).
         * */
        public Train value() {
            return value;
        }

        /**
         * Sets ref on previous element in collection.
         * */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Sets ref on next element in collection.
         * */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         * Sets value of current element (ref on an instance of class Train).
         * */
        public void setValue(Train value) {
            this.value = value;
        }
    }
}
