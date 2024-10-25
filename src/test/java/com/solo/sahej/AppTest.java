package com.solo.sahej;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for App.
 */
class AppTest {
    /**
     * Tests Lagrange interpolation with known points.
     */
    @Test
    void testLagrangeInterpolation() {
        List<App.Point> points = Arrays.asList(
                new App.Point(1, BigInteger.valueOf(4)),
                new App.Point(2, BigInteger.valueOf(7)),
                new App.Point(3, BigInteger.valueOf(12))
        );

        BigInteger secret = App.lagrangeInterpolation(points, 0);
        assertEquals(BigInteger.valueOf(2), secret);
    }

    /**
     * Tests parsing input and calculating the secret.
     */
    @Test
    void testFindConstantTerm() {
        String jsonDataString = "{"
            + "\"keys\": {\"n\": 3, \"k\": 2},"
            + "\"1\": {\"base\": \"10\", \"value\": \"4\"},"
            + "\"2\": {\"base\": \"10\", \"value\": \"7\"},"
            + "\"3\": {\"base\": \"10\", \"value\": \"12\"}"
            + "}";

        JsonObject jsonData = new Gson().fromJson(jsonDataString, JsonObject.class);
        BigInteger secret = App.findConstantTerm(jsonData);
        assertEquals(BigInteger.valueOf(2), secret);
    }
}
