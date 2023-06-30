package com.bytelegend;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * `CountingHashSet` is a `HashSet` with all the features of `HashSet` plus the ability to count the
 * number of elements added since the creation of the instance.
 */
public class CountingHashSet extends HashSet<Object> {
    private int count = 0;

    @Override
    public boolean add(Object obj) {
        count++;
        return super.add(obj);
    }

    @Override
    public boolean addAll(Collection c) {
        boolean modified = false;
        for (Object obj : c)
            if (add(obj))
                modified = true;
        return modified;
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
