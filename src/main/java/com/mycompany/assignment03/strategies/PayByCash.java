/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment03.strategies;

/**
 *
 * @author gkalf
 */
public class PayByCash implements PayStrategy {

    @Override
    public void pay(int x, int y, int z) {
        int amount = x + y + z + 3;
        System.out.println("Paid by Cash, the amount of "
                + amount + " €");
    }

}
