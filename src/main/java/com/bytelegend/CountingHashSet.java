package com.bytelegend;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * `CountingHashSet` is a `HashSet` with all the features of `HashSet` plus the ability to count the
 * number of elements added since the creation of the instance.
 */
public class CountingHashSet {
    private static final HashSet<Object> hashSet = new HashSet<>();
    private int count = 0;


    public int size() {
        return hashSet.size();
    }

    public boolean add(Object obj) {
        count++;
        return hashSet.add(obj);
    }

    public boolean addAll(Collection c) {
        count += c.size();
        return hashSet.addAll(c);
    }

    public boolean remove(Object o) {
        return hashSet.remove(o);
    }

    public boolean removeAll(Collection c) {
        return hashSet.removeAll(c);
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        CountingHashSet countingSet = new CountingHashSet();
        countingSet.add(new Object());
        countingSet.addAll(Arrays.asList(1, 2, 3));

        // Should be 4
        System.out.println(countingSet.getCount());
    }
}
