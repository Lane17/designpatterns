package com.decorator;

import java.math.BigDecimal;

public class Decaf extends Beverage {
    public Decaf() {
        description = "๋์นดํ์ธ";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.05);
    }
}
