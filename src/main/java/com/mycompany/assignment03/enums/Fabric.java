/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment03.enums;

import java.util.Random;

/**
 *
 * @author gkalf
 */
public enum Fabric {
    WOOL(7), COTTON(2), POLYESTER(4), RAYON(5), LINEN(3), CASHMERE(1), SILK(6);

    public int value;

    private Fabric(int i) {
        this.value = i;
    }

    public static Fabric getRandomFabric() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
