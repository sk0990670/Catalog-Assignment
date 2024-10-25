package com.solo.sahej;

import com.google.gson.JsonObject;
import java.math.BigInteger;
import java.util.List;

public class App {

    // Point class to hold x and y values
    public static class Point {
        private final int x;
        private final BigInteger y;

        public Point(int x, BigInteger y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public BigInteger getY() {
            return y;
        }
    }

    /**
     * Performs Lagrange interpolation to find the secret at x = 0.
     */
    public static BigInteger lagrangeInterpolation(List<Point> points, int x) {
        BigInteger secret = BigInteger.ZERO;

        for (int i = 0; i < points.size(); i++) {
            BigInteger term = points.get(i).getY();
            for (int j = 0; j < points.size(); j++) {
                if (i != j) {
                    term = term.multiply(BigInteger.valueOf(x - points.get(j).getX()))
                               .divide(BigInteger.valueOf(points.get(i).getX() - points.get(j).getX()));
                }
            }
            secret = secret.add(term);
        }
        return secret;
    }

    /**
     * Finds the constant term from the provided JSON data.
     */
    public static BigInteger findConstantTerm(JsonObject jsonData) {
        int n = jsonData.getAsJsonObject("keys").get("n").getAsInt();
        List<Point> points = new java.util.ArrayList<>();

        for (int i = 1; i <= n; i++) {
            JsonObject pointData = jsonData.getAsJsonObject(String.valueOf(i));
            int base = pointData.get("base").getAsInt();
            BigInteger value = new BigInteger(pointData.get("value").getAsString());
            points.add(new Point(i, value));
        }

        return lagrangeInterpolation(points, 0);
    }
}
