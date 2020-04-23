package com.mycompany.assignment03.comparators;

import com.mycompany.assignment03.models.Tshirt;

import java.util.Comparator;

public class SortByAll implements Comparator<Tshirt> {
    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        int compSize = o1.getS().value - o2.getS().value;
        if (compSize == 0) {
            int compColor = o1.getC().name().compareTo(o2.getC().name());
            if (compColor == 0) {
                int compFabric = o1.getF().name().compareTo(o2.getF().name());
                if (compFabric == 0) {
                    return 0;
                } else {
                    return compFabric;
                }
            } else {
                return compColor;
            }
        }else{
            return compSize;
        }
    }
}
