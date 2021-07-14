package ru.geekbrains.webuigroup;

public class Triangle {
    public static double getArea(int a, int b, int c) {
        double p = (a + b + c) / 2;
        System.out.println(p);
        double t = p * (p-a) * (p-b)* (p-c);
        double s = Math.sqrt(t);
        return s;
    }
}
