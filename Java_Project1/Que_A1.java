
// Interface Quantiphi
interface Quantiphi {
	void learnCoding();
	void Practice();
	void contribute();
}

// Abstract class Student implementing from GFG interface
abstract class Student implements Quantiphi {

	// Overriding the methods
	@Override public void learnCoding()
	{
		System.out.println(
			"Implementation of Interface & Abstract class ");
	}
	@Override public void Practice()
	{
		System.out.println(
			"Let's master all fundamentals");
	}
}

// Extend the GEEK class by Student abstract class
class Custom extends Student {
	@Override public void contribute()
	{
		System.out.println(
			"Now let's help others by contributing ");
	}
}

// Driver code
public class Que_A1 {
	public static void main(String[] args)
	{
		Custom gfgStudent = new Custom();

		// Calls to the multiple functions
		gfgStudent.learnCoding();
		gfgStudent.Practice();
		gfgStudent.contribute();
	}
}
