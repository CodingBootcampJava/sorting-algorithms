package com.mycompany.assignment03.comparators;

import com.mycompany.assignment03.models.Tshirt;

import java.util.Comparator;

public class SortBySize implements Comparator<Tshirt> {
    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        return o1.getS().ordinal() - o2.getS().ordinal();
    }



}
