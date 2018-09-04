import java.util.Scanner;

public class ReverseCapital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		String newStr = str.toUpperCase();
		
		StringBuffer s = new StringBuffer(newStr);
		s.reverse();
		System.out.println(s);
		sc.close();
	}

}
