package app4;

class A
{
	enum Month
	{   //through enum constant we can specify a common property
		//for that property value is varying
		//every month is having number of days as common
		JAN(31), FEB(28), MAR(31);
		int days;
		Month(int days)
		{
			this.days = days;
		}
		public int getDays()
		{
			return days;
		}
	}
	public static void main(String[] args)
	{
		Month m1 = Month.JAN;
		System.out.println(m1.getDays());
	}
}
/*
1. if all constants are having a common property and that 
   property values are different for different constants, then
   changed value through argument of the constructor
*/
