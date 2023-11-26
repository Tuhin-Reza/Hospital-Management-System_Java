public class ScientificCalculator extends BasicCalculator implements ScientificCalculation
{
	public ScientificCalculator( )
	{
		System.out.println("Default constructore2");
	}
	
    public ScientificCalculator (double value1, double value2)
	{
		super(value1,value2);
	}
	
	public double add( )
	{
		return value1+value2;
	}
   public double subtract( )
   {
	   return value1-value2;
   }
   public double multiply( )
   {
	   return value1*value2;
   }
   public double divide( )
   {
	   return value1+value2;
   }
   public double toThePow( )
   {
	return Math.pow(value1,value2);
   }
   

}