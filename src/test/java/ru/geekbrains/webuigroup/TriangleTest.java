package ru.geekbrains.webuigroup;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TriangleTest {
    Triangle triangle = new Triangle();
    private static Logger logger = LoggerFactory.getLogger(Triangle.class);

    @BeforeEach
    public void BeforeEachTest() {
        logger.info("Before each test");
    }

    @Test
    @DisplayName("Позитивный тест")
    public void positiveTest() {
        int a = 3;
        int b = 4;
        int c = 5;
        double expected = 6;
        double result = Triangle.getArea(a, b, c);
    }

    @Test
    @DisplayName("Одна из сторон равна нулю")
    public void negativeTest() {
        int a = 0;
        int b = 4;
        int c = 5;
        double result = Triangle.getArea(a, b, c);
        Assert.fail(result + "Сторона треугольника не должна равняться нулю");
    }

    @Test
    @DisplayName("Одна из сторон является отрицательным числом")
    public void negativeTest1() {
        int a = -5;
        int b = 4;
        int c = 5;
        double result = Triangle.getArea(a, b, c);
        Assert.fail(result + "Сторона треугольника должна быть больше нуля");
    }
}


