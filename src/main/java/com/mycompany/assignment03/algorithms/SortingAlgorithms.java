package com.mycompany.assignment03.algorithms;

import com.mycompany.assignment03.models.Tshirt;

import java.util.*;

public class SortingAlgorithms {

    public static ArrayList<Tshirt> bubbleSortAscending(ArrayList<Tshirt> list, Comparator comparator) {
        int listLength = list.size();
        Tshirt temp;
        for (int i = 0; i < listLength; i++) {
            for (int j = 1; j < (listLength - i); j++) {
                if (comparator.compare(list.get(j - 1), list.get(j)) > 0) {
                    temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static ArrayList<Tshirt> quickSortAscending(ArrayList<Tshirt> list, int begin, int end, Comparator comparator) {
        int ll = begin;
        int rr = end;
        if (rr > ll) {
            Tshirt pivot = list.get((ll + rr) / 2);
            while (ll <= rr) {
                while (ll < end && comparator.compare(list.get(ll), pivot) < 0) {
                    ll += 1;
                }
                while (rr > begin && comparator.compare(list.get(rr), pivot) > 0) {
                    rr -= 1;
                }
                if (ll <= rr) {
                    Collections.swap(list, ll, rr);
                    ll += 1;
                    rr -= 1;
                }
            }
            if (begin < rr) {
                quickSortAscending(list, begin, rr, comparator);

            }
            if (ll < end) {
                quickSortAscending(list, ll, end, comparator);
            }
        }
        return list;
    }

    public static ArrayList<Tshirt> bucketSort(ArrayList<Tshirt> list, Comparator comparator) {
        final int noOfBuckets = (int) Math.sqrt(list.size());
        List<Tshirt>[] buckets = new List[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }
        for (Tshirt t : list) {
            buckets[hash(t)].add(t);
        }
        for (List<Tshirt> bucket : buckets) {
            Collections.sort(bucket, comparator);
        }
        int i = 0;
        for (List<Tshirt> bucket : buckets) {
            for (Tshirt num : bucket) {
                list.set(i++, num);
            }
        }
        return list;
    }

    private static int hash(Tshirt e) {
        return e.getC().value / 10;
    }
}
