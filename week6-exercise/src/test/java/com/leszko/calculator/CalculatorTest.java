package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
     private Calculator calculator = new Calculator();

     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }

     @Test
     public void testAnotherSum() {
          assertEquals(15, calculator.sum(12, 3));
     }

     @Test
     public void test1rSum() {
          assertEquals(10, calculator.sum(10, 0));
     }

     @Test
     public void test2Sum() {
          assertEquals(25, calculator.sum(22, 3));
     }
}
