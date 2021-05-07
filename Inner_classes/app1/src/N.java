class N
{
	N()
	{
		//local in the constructor
		class A	
		{
		}
	}

	static
	{
		class A
		{
		}
	}
	
	{
		//local in the IIB
		class A
		{
		}
	}
	public static void main(String[] args) 
	{
		//local in the main method
		class A
		{
		}
		System.out.println("done");
	}
}
