package tests;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Assert;
import org.junit.Test;

public class Section1_1Exercises {
    @Test
    public void Exercise_1_1_1_a() {
        Assert.assertEquals(7, (0 + 15)/2);
    }

    @Test
    public void Exercise_1_1_1_b() {
        Assert.assertEquals(200.0000002,  2.0 * Math.pow(10, -6) * 100000000.1, 0.0);
    }

    @Test
    public void Exercise_1_1_1_c() {
        Assert.assertTrue(true && false || true && true);
    }

    @Test
    public void Exercise_1_1_2_a() {
        Object value = (1 + 2.236)/2;

        Assert.assertTrue(value instanceof Double);
        Assert.assertEquals(1.618, value);
    }

    @Test
    public void Exercise_1_1_2_b() {
        Object value = 1 + 2 + 3 + 4.0;

        Assert.assertTrue(value instanceof Double);
        Assert.assertEquals(10.0, value);
    }

    @Test
    public void Exercise_1_1_2_c() {
        Object value = 4.1 >= 4;

        Assert.assertTrue(value instanceof Boolean);
        Assert.assertEquals(true, value);
    }

    @Test
    public void Exercise_1_1_2_d() {
        Object value = 1 + 2 + "3";

        Assert.assertTrue(value instanceof String);
        Assert.assertEquals("33", value);
    }

    @Test
    public void Exercise_1_1_3_equal_case() {
        String result = Exercise_1_1_3_program(new String[] { "132", "132", "132" });

        Assert.assertEquals("equal", result);
    }

    @Test
    public void Exercise_1_1_3_not_equal_case() {
        String result = Exercise_1_1_3_program(new String[] { "132", "123", "132" });

        Assert.assertEquals("not equal", result);
    }

    private String Exercise_1_1_3_program(String[] args) {
        boolean allAreEquals = true;
        int lastValue = 0;

        for (int i = 0; i < 3; i++) {
            int newValue = Integer.parseInt(args[i]);
            allAreEquals = allAreEquals && (i == 0 || newValue == lastValue);
            lastValue = newValue;
        }

        return allAreEquals ? "equal" : "not equal";

    }

    @Test
    public void Exercise_1_1_6() {
        int f = 0;
        int g = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= 15; i++)
        {
            result.append(f).append("\n");
            f = f + g;
            g = f - g;
        }

        Assert.assertEquals("0\n1\n1\n2\n3\n5\n8\n13\n21\n34\n55\n89\n144\n233\n377\n610\n", result.toString());
    }

    @Test
    public void Exercise_1_1_7_a() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        Assert.assertEquals("3.00009\n", String.format("%.5f\n", t));
    }

    @Test
    public void Exercise_1_1_7_b() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        Assert.assertEquals(500 * 999, sum);
    }

    @Test
    public void Exercise_1_1_7_c() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        Assert.assertEquals(10 * 1000, sum);
    }
}
