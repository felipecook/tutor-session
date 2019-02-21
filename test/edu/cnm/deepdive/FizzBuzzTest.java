package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {


  FizzBuzz fizzBuzz;

  @BeforeEach
  void setUp() throws Exception {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  void ifNumberIsDivisibleBy3() {
    String result = fizzBuzz.fizz(3);
    assertEquals("fizz", result);
  }

  @Test
  void ifNumberIsDivisibleBy5() {
    String result = fizzBuzz.buzz(8);
    assertEquals("buzz", result);
  }

  @Test
  void ifNumberIsDivisibleBy5Or3() {
    String result = fizzBuzz.fizzBuzz(15);
    assertEquals("FizzBuzz", result);
  }




}