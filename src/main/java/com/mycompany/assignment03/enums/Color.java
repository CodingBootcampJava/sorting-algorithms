/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment03.enums;

import java.util.Random;

/**
 * @author gkalf
 */
public enum Color {
    RED(5), ORANGE(4), YELLOW(7), GREEN(2), BLUE(1), INDIGO(3), VIOLET(6);

    public int value;

    private Color(int i) {
        this.value = i;
    }

    public static Color getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
