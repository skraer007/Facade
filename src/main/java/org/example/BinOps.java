package org.example;

public class BinOps {
    private int arg1;
    private int arg2;
    private int result;

    public String sum(String a, String b) {
        arg1 = Integer.parseInt(a, 2);
        arg2 = Integer.parseInt(b, 2);
        result = arg1 + arg2;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        arg1 = Integer.parseInt(a, 2);
        arg2 = Integer.parseInt(b, 2);
        result = arg1 * arg2;
        return Integer.toBinaryString(result);
    }
}