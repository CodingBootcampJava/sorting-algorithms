package com.mycompany.assignment03.classes;

import com.mycompany.assignment03.models.Tshirt;
import com.mycompany.assignment03.enums.Color;
import com.mycompany.assignment03.enums.Fabric;
import com.mycompany.assignment03.enums.Size;

import java.util.ArrayList;

public class SyntheticData {
    private int x;
    private ArrayList<Tshirt> manyTshirts = new ArrayList<>();

    public SyntheticData(int x) {
        this.x=x;
        }

    public ArrayList<Tshirt> getManyTshirts() {
        for (int i=0; i<x; i++) {
            manyTshirts.add(new Tshirt(Color.getRandomColor(), Size.getRandomSize(), Fabric.getRandomFabric()));
        }
        return manyTshirts;
    }

}
