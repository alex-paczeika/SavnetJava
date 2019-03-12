package com.tjse.tests.me30;

public class CalculatorImpl implements Calculator {

	private double curentValue=0;
	
	 
	@Override
	public double doOperation(String operation) {
	    try {
            Double.parseDouble(operation.substring(1));
        } catch(NumberFormatException e){
            return curentValue;
        }


    char semnul = operation.charAt(0);

    double numarul = Double.parseDouble(operation.substring(1));

    switch (semnul) {
        case '+':
            curentValue += numarul;
            break;
        case '-':
            curentValue = curentValue - numarul;
            break;
        case '*':
            curentValue = curentValue * numarul;
            break;
        case '/':
            curentValue = curentValue/numarul;
            break;
        case '=':
              curentValue=numarul;
              default:

            break;
    }
    return curentValue;
}


}
