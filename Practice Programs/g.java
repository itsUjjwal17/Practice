// Java program to illustrate the
// Character.isHighSurrogate() method
import java.lang.*;

public class g {

	public static void main(String[] args)
	{

		// create 2 char primitives c1, c2
		char c1 = '\u0a4f', c2 = '\ud8b4';

		// assign isHighSurrogate results of
		// c1, c2 to boolean primitives bool1, bool2
		boolean bool1 = Character.isHighSurrogate(c1);
		System.out.println("c1 is a Unicode"+
		"high-surrogate code unit ? " + bool1);

		boolean bool2 = Character.isHighSurrogate(c2);
		System.out.println("c2 is a Unicode"+
		"high-surrogate code unit ? " + bool2);
	}
}
