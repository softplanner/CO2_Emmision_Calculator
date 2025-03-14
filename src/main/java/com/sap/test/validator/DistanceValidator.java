package com.sap.test.validator;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class DistanceValidator implements IParameterValidator {

    public void validate(String name, String value)
            throws ParameterException {
        double n = Double.parseDouble(value);
        if (Double.compare(n, 0) == -1 || Double.compare(n, 0) == 0) {
            throw new ParameterException("Parameter " + name + " should be positive (found " + value + ")");
        }
    }
}
