package com.bytelegend;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * `CountingHashSet` is a `HashSet` with all the features of `HashSet` plus the ability to count the
 * number of elements added since the creation of the instance.
 */
public class CountingHashSet {
    private int count = 0;

    final private HashSet<Object> set = new HashSet<>();

    public boolean add(Object obj) {
        count++;
        return set.add(obj);
    }

    public boolean remove(Object obj) {
        return set.remove(obj);
    }

    public int size() {
        return set.size();
    }

    public int count() {
        return count;
    }

    public boolean addAll(Collection c) {
        count += c.size();
        return set.addAll(c);
    }

    public boolean removeAll(Collection c) {
        return set.removeAll(c);
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
