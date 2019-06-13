package eu.jcz;

public class IntegerTest {

	public static void main(String[] args) {
		
		
		Double doubleValue = 1.8d;
		System.out.println("doubleValue: " + doubleValue);
		Integer integerValue1 = doubleValue.intValue();
		System.out.println("doubleValue.intValue(): " + integerValue1);
		
		Integer integerValue2 = (int)Math.round(doubleValue);
		System.out.println("(int)Math.round(doubleValue): " + integerValue2);
	}

}
