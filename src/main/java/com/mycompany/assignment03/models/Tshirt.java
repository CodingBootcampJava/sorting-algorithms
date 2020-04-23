/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment03.models;

import com.mycompany.assignment03.strategies.PayStrategy;
import com.mycompany.assignment03.enums.Fabric;
import com.mycompany.assignment03.enums.Color;
import com.mycompany.assignment03.enums.Size;

/**
 *
 * @author gkalf
 */
public class Tshirt {

    private PayStrategy payStrategy;
    private Color c;
    private Size s;
    private Fabric f;

    public Tshirt(PayStrategy payStrategy, Color c, Size s, Fabric f) {
        this.payStrategy = payStrategy;
        this.c = c;
        this.s = s;
        this.f = f;
    }

    public Tshirt(Color c, Size s, Fabric f) {
        this.c = c;
        this.s = s;
        this.f = f;
    }

    public void doPay() {
        payStrategy.pay(c.value, s.value, f.value);
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Size getS() {
        return s;
    }

    public void setS(Size s) {
        this.s = s;
    }

    public Fabric getF() {
        return f;
    }

    public void setF(Fabric f) {
        this.f = f;
    }    

    @Override
    public String toString() {
        return "T-shirt with Size = " + s + ", Color: " + c + ", and Fabric = " + f + '}';
    }

}
