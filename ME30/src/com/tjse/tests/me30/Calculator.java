package com.tjse.tests.me30;

public interface Calculator {
  /**
   * =nr sets current value to nr
   * +nr adds nr to current value
   * -nr subtracts nr from current value
   * *nr multiplies nr with current value
   * /nr divides current value with nr 
   * @param operation
   * @return the new current value
   */
	
	
  public double doOperation(String operation);
  
  
  public static void main(String[] args) {
      Calculator calculator = new CalculatorImpl();
      System.out.println(calculator.doOperation("+5"));
      System.out.println(calculator.doOperation("-5"));
      System.out.println(calculator.doOperation("=1"));
      System.out.println(calculator.doOperation("*10"));
      System.out.println(calculator.doOperation("/2"));
      System.out.println(calculator.doOperation("!q"));
      System.out.println(calculator.doOperation("!1"));
      System.out.println(calculator.doOperation("+q"));
  }
 
}        
        