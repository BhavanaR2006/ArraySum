package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

@Test
public void testArraySum() {
    App obj = new App();
    int[] numbers = {10, 20, 30};
    assertEquals(60, obj.sumArray(numbers));
}

@Test
public void testSingleElement() {
    App obj = new App();
    int[] numbers = {5};
    assertEquals(5, obj.sumArray(numbers));
}

@Test
public void testEmptyArray() {
    App obj = new App();
    int[] numbers = {};
    assertEquals(0, obj.sumArray(numbers));
}

}