package app4;

enum I
{
	C1, C2, C3;
	private I()
	{
		
	}
}
//for the constructor of the enum the only access specifier allowed is private
//we cant specify protected or public
//why bcz the constructor is calling while loading the constants into the memory.
//enum constructor access level is private.
//it allows only private to specify explicitly. 
//enum constructor executes while loading a enum constant. enum constructor
  //available in the enum body itself. enum constructor will not be called from outside