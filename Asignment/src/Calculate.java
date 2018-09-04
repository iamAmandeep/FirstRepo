import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		
		float numOne, numTwo;
		numOne = Float.parseFloat(args[0]);
		numTwo = Float.parseFloat(args[1]);
		
		try {
		float div = numOne/numTwo;
		System.out.println("Division : "+div);
		}catch(Exception e) {
			System.out.println("Invalid Operands. Problem :"+e);
		}
		
		float mul = numOne*numTwo;
		System.out.println("Multiplication : "+mul);
		
	}
	
}
