public abstract class BasicCalculator implements Calculation
{
	double value1;
    double value2;
    BasicCalculator( )
	{
		
		System.out.println("Default constructore");
	}
    BasicCalculator(double value1, double value2)
	{
		this.value1=value1;
		this.value2=value2;
	}
    public void setValue1(double value1)
	{
		this.value1=value1;
	}
    public void setValue2(double value2)
	{
		this.value2=value2;
	}

    double getValue1( )
	{
		return value1;
	}
    double getValue2( )
	{
		return value2;
	}

}
