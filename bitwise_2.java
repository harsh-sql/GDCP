import java.util.*;

public class bitwise_2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter Two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Bitwise AND (a&b) = " + (a & b));
		System.out.println("Bitwise OR  (a|b) = " + (a | b));
		System.out.println("Bitwise XOR (a^b) = " + (a ^ b));
		System.out.println("Complement  (~a ) = " + ~a);
		sc.close();
	}
}
