public class Main
{
	public static void main(String[] args)
	{
		ScientificCalculator obj= new ScientificCalculator(10.1,20.5);
		System.out.println("Addition   :" +obj.add( ));
		System.out.println("Subtraction:" +obj.subtract( ));
		System.out.println("Multiply   :" +obj.multiply( ));
		System.out.println("Division   :" +obj.divide( ));
		System.out.println("TO The Pow :" +obj.toThePow( ));
	}
}