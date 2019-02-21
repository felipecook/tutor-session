package edu.cnm.deepdive;

public class FizzBuzz {

  public String fizz(int a) {
    String returnString = "";
    if (a % 3 == 0) {
      returnString = "fizz";
    }
    return returnString;
  }

  public String buzz(int a) {
    String stringHolder = "";
    if (a % 5 == 0) {
      stringHolder = "Buzz";
    }
    return stringHolder;
  }

  public String fizzBuzz(int a) {
    String returnString = "";
    if (a % 15 == 0) {
      returnString = "FizzBuzz";
    }
    return returnString;
  }

}
