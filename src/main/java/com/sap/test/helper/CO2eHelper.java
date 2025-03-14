package com.sap.test.helper;

public class CO2eHelper {
    public static double roundResult(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
