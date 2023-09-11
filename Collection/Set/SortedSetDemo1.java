/* 

Compiled from "SortedSet.java"
public interface java.util.SortedSet<E> extends java.util.Set<E> {
  public abstract java.util.Comparator<? super E> comparator();
  public abstract java.util.SortedSet<E> subSet(E, E);
  public abstract java.util.SortedSet<E> headSet(E);
  public abstract java.util.SortedSet<E> tailSet(E);
  public abstract E first();
  public abstract E last();
  public default java.util.Spliterator<E> spliterator();

*/

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collections;

class SortedSetDemo {

    public static void main(String[] args) {


        SortedSet ts = new TreeSet();

        // all elements are sorted at the time of insertion

        ts.add("Kanha");
        ts.add("Rahul");
        ts.add("Shashi");
        ts.add("Badhe");
        ts.add("Ashish");

        // Collections.sort(ts); 

        // no suitable method found for sort(SortedSet)
    
        System.out.println(ts);

        // [Ashish, Badhe, Kanha, Rahul, Shashi]

        System.out.println(ts.first()); // Ashish
        System.out.println(ts.last()); // Shashi
        System.out.println(ts.headSet("Shashi")); // [Ashish, Badhe, Kanha, Rahul]
        System.out.println(ts.subSet("Ashish","Rahul")); // [Ashish, Badhe, Kanha]
        System.out.println(ts.tailSet("Kanha")); // [Kanha, Rahul, Shashi] 
    }
}